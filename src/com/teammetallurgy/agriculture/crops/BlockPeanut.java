package com.teammetallurgy.agriculture.crops;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

import com.teammetallurgy.agriculture.AgricultureItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPeanut extends BlockFlower
{
	private float growthRate = 0.5f;
	private Icon[] iconArray;

	public BlockPeanut(int par1)
	{
		super(par1);
	}

	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
	{
		final int id = par1World.getBlockId(par2, par3 - 1, par4);
		return id == Block.tilledField.blockID || true;
	}

	@Override
	public boolean canSustainPlant(World world, int x, int y, int z, ForgeDirection direction, IPlantable plant)
	{
		return true;
	}

	@Override
	public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
	{
		final ArrayList<ItemStack> ret = super.getBlockDropped(world, x, y, z, metadata, fortune);
		ret.add(AgricultureItems.peanuts.getItemStack());

		if (metadata >= 6)
		{
			for (int n = 0; n < 3 + fortune; n++)
			{
				if (world.rand.nextInt(15) <= metadata + 1)
				{
					ret.add(AgricultureItems.peanuts.getItemStack());
				}
			}
		}

		return ret;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int par1, int par2)
	{
		if (par2 < 0 || par2 > 7)
		{
			par2 = 7;
		}

		return iconArray[par2];
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float xOffset, float yOffset, float zOffset)
	{

		final float temp = growthRate;
		growthRate = 100;
		updateTick(world, x, y, z, new Random());
		growthRate = temp;

		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	public void registerIcons(IconRegister par1IconRegister)
	{
		iconArray = new Icon[8];

		for (int i = 0; i < iconArray.length; ++i)
		{
			iconArray[i] = par1IconRegister.registerIcon(func_111023_E() + "_stage_" + i);
		}
	}

	@Override
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		super.updateTick(par1World, par2, par3, par4, par5Random);

		if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
		{
			int l = par1World.getBlockMetadata(par2, par3, par4);
			if (l < 6)
			{
				if (par5Random.nextInt((int) (25.0F / growthRate) + 1) == 0)
				{
					++l;
					par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
				}
			}
		}
	}
}