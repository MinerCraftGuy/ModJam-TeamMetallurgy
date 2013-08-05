package com.teammetallurgy.agriculture.machines.icebox;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.teammetallurgy.agriculture.AgricultureItems;
import com.teammetallurgy.agriculture.SubItem;

public class IceboxRecipes
{
	private static Map<Integer, IceboxRecipes> recipes;
	
	private int requiredHeat;
	private ItemStack source;
	private ItemStack result;
	
	static
	{
		addRecipe(AgricultureItems.vanillaIceCream, AgricultureItems.vanillaIceCreamMix, 100000);
		addRecipe(AgricultureItems.strawberryIceCream, AgricultureItems.strawberryIceCreamMix, 100000);
		addRecipe(AgricultureItems.chocolateIceCream, AgricultureItems.chocolateIceCreamMix, 100000);
	}
	
	private IceboxRecipes(ItemStack source, ItemStack result, int heat)
	{
		this.source = source;
		this.result = result;
		this.requiredHeat = heat;
	}
	
	public static void addRecipe(Object result, Object source, int heat)
	{
		ItemStack resultStack = getItemStack(result);
		ItemStack sourceStack = getItemStack(source);
		IceboxRecipes recipe = new IceboxRecipes(sourceStack, resultStack, heat);
		
		int hash = (sourceStack.itemID << 8) + sourceStack.getItemDamage();
		
		if(recipes == null)
		{
			recipes = new HashMap<Integer, IceboxRecipes>();
		}
		
		recipes.put(hash, recipe);
	}
	
	public static ItemStack getItemStack(Object object)
	{
		ItemStack stack = null;
		if(object instanceof ItemStack)
		{
			stack = (ItemStack) object;
		}
		else if(object instanceof SubItem)
		{
			stack = ((SubItem) object).getItemStack();
		}
		else if(object instanceof Item)
		{
			stack = new ItemStack((Item)object);
		}
		return stack;
	}
	
	public static ItemStack getResult(ItemStack input, int heat)
	{
		int hash = (input.itemID << 8) + input.getItemDamage();
		IceboxRecipes result = recipes.get(hash);

		if(result != null)
		{
			if(result.getRequiredHeat() <= heat)
			{
				ItemStack itemStack = result.getResult();
				itemStack.stackSize = 1;
				return itemStack;
			}
		}
		
		return null;
	}

	private ItemStack getResult()
	{
		return result;
	}

	private int getRequiredHeat()
	{
		return requiredHeat;
	}
}
