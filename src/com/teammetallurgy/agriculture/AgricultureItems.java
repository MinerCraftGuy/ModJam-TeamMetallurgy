package com.teammetallurgy.agriculture;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class AgricultureItems
{
	public static SubItem carmel;
	public static SubItem ovenRack;
	public static SubItem flour;
	public static SubItem dough;
	
	public static SubItem hotCocoa;
	public static SubItem vinegar;
	public static SubItem beer;
	public static SubItem rawHamburgerPatty;
	public static SubItem appleJellyToast;
	public static SubItem cinnamonToast;
	public static SubItem strawberryJellyToast;
	public static SubItem caramelAppleWithNuts;
	public static SubItem appleJelly;
	public static SubItem mashedPotatos;
	public static SubItem carrotCakeBatter;
	public static SubItem rawFrenchToast;
	public static SubItem batter;
	public static SubItem macaroniAndCheese;
	public static SubItem strawberryJelly;
	public static SubItem rawApplePie;
	public static SubItem rawStrawberryPie;
	public static SubItem strawberryShortcake;
	public static SubItem hamburger;
	public static SubItem pbjSandwichApple;
	public static SubItem pbjSandwichStrawberry;
	public static SubItem cheeseSandwich;
	public static SubItem butteredToast;
	public static SubItem baconCheeseFries;
	public static SubItem baconCheeseburger;
	public static SubItem peanutButter;
	public static SubItem chocolate;
	public static SubItem cheese;
	public static SubItem butter;
	public static SubItem whippedCream;
	//public static SubItem dough;
	public static SubItem appleGelatin;
	public static SubItem strawberryGelatin;
	public static SubItem marshmellows;
	public static SubItem pastaDough;
	public static SubItem cheeseFries;
	public static SubItem rawChickenNuggets;
	public static SubItem cheeseburger;
	public static SubItem deluxeHotCocoa;
	public static SubItem saltedBeef;
	public static SubItem breadedChicken;
	public static SubItem saltedPork;
	public static SubItem caramelApple;
	public static SubItem chocolateCoveredStrawberries;
	public static SubItem cinnamonAndSugar;
	public static SubItem sliceOfCheese;
	public static SubItem sliceOfBread;
	public static SubItem friedChicken;
	public static SubItem frenchFries;
	public static SubItem chickenNuggets;
	public static SubItem shortcake;
	public static SubItem carrotCake;
	public static SubItem grilledCheese;
	public static SubItem loafOfBread;
	public static SubItem pasta;
	public static SubItem toastedPbjSandwichApple;
	public static SubItem toastedPbjSandwichStrawberry;
	public static SubItem roastedPeanuts;
	public static SubItem applePie;
	public static SubItem frenchToast;
	public static SubItem hamburgerPatty;
	public static SubItem strawberryPie;
	public static SubItem beefJerkey;
	public static SubItem bacon;
	public static SubItem toast;
	public static SubItem caramel;
	public static SubItem appleMush;
	public static SubItem gelatin;
	public static SubItem breadCrumbs;
	public static SubItem groundBeef;
	public static SubItem groundChicken;
	public static SubItem groundPork;
	public static SubItem crushedPeanuts;
	public static SubItem strawberryMush;
	//public static SubItem flour;
	public static SubItem cookingOil;

	public static SubItem clayBowl;
	public static SubItem clayPlate;
	public static SubItem clayCup;
	public static SubItem ceramicBowl;
	public static SubItem ceramicPlate;
	public static SubItem ceramicCup;

	public static final int dishID = 19999;
	public static final int foodID = 20000;
	
	public static void init()
	{
		carmel = new SubItem(foodID, 1).setUnlocalizedName("Carmel").setTextureName("Carmel").setCreativeTab(Agriculture.tab);
		ovenRack = new SubItem(foodID, 2).setUnlocalizedName("OvenRack").setTextureName("OvenRack").setCreativeTab(Agriculture.tab);
		flour = new SubItem(foodID, 3).setUnlocalizedName("Flour").setTextureName("Flour").setCreativeTab(Agriculture.tab);
		dough = new SubItem(foodID, 4).setUnlocalizedName("Dough").setTextureName("Dough").setCreativeTab(Agriculture.tab);
		
		clayBowl = new SubItem(dishID, 0).setUnlocalizedName("ClayBowl").setTextureName("ClayBowl").setCreativeTab(Agriculture.tab);
		clayPlate = new SubItem(dishID, 1).setUnlocalizedName("ClayPlate").setTextureName("ClayPlate").setCreativeTab(Agriculture.tab);
		clayBowl = new SubItem(dishID, 2).setUnlocalizedName("ClayCup").setTextureName("ClayCup").setCreativeTab(Agriculture.tab);
		ceramicBowl = new SubItem(dishID, 3).setUnlocalizedName("CeramicBowl").setTextureName("CeramicBowl").setCreativeTab(Agriculture.tab);
		ceramicPlate = new SubItem(dishID, 4).setUnlocalizedName("CeramicPlate").setTextureName("CeramicPlate").setCreativeTab(Agriculture.tab);
		ceramicCup = new SubItem(dishID, 5).setUnlocalizedName("CeramicCup").setTextureName("CeramicCup").setCreativeTab(Agriculture.tab);
		
		hotCocoa = new SubItemFood(foodID, 5, 1, 0.1f).setUnlocalizedName("HotCocoa").setTextureName("HotCocoa").setCreativeTab(Agriculture.tab);
		vinegar = new SubItem(foodID, 6).setUnlocalizedName("Vinegar").setTextureName("Vinegar").setCreativeTab(Agriculture.tab);
		beer = new SubItemFood(foodID, 7, 1, 0.1f).setUnlocalizedName("Beer").setTextureName("Beer").setCreativeTab(Agriculture.tab);
		rawHamburgerPatty = new SubItem(foodID, 8).setUnlocalizedName("RawHamburgerPatty").setTextureName("RawHamburgerPatty").setCreativeTab(Agriculture.tab);
		appleJellyToast = new SubItemFood(foodID, 9, 1, 0.1f).setUnlocalizedName("AppleJellyToast").setTextureName("AppleJellyToast").setCreativeTab(Agriculture.tab);
		cinnamonToast = new SubItemFood(foodID, 10, 1, 0.1f).setUnlocalizedName("CinnamonToast").setTextureName("CinnamonToast").setCreativeTab(Agriculture.tab);
		strawberryJellyToast = new SubItemFood(foodID, 11, 1, 0.1f).setUnlocalizedName("StrawberryJellyToast").setTextureName("StrawberryJellyToast").setCreativeTab(Agriculture.tab);
		caramelAppleWithNuts = new SubItemFood(foodID, 12, 1, 0.1f).setUnlocalizedName("CaramelAppleWithNuts").setTextureName("CaramelAppleWithNuts").setCreativeTab(Agriculture.tab);
		appleJelly = new SubItem(foodID, 13).setUnlocalizedName("AppleJelly").setTextureName("AppleJelly").setCreativeTab(Agriculture.tab);
		mashedPotatos = new SubItemFood(foodID, 14, 1, 0.1f).setUnlocalizedName("MashedPotatos").setTextureName("MashedPotatos").setCreativeTab(Agriculture.tab);
		carrotCakeBatter= new SubItem(foodID, 15).setUnlocalizedName("CarrotCakeBatter").setTextureName("CarrotCakeBatter").setCreativeTab(Agriculture.tab);
		rawFrenchToast = new SubItem(foodID, 16).setUnlocalizedName("RawFrenchToast").setTextureName("RawFrenchToast").setCreativeTab(Agriculture.tab);
		batter = new SubItem(foodID, 17).setUnlocalizedName("Batter").setTextureName("Batter").setCreativeTab(Agriculture.tab);
		macaroniAndCheese = new SubItemFood(foodID, 18, 1, 0.1f).setUnlocalizedName("MacaroniAndCheese").setTextureName("MacaroniAndCheese").setCreativeTab(Agriculture.tab);
		strawberryJelly = new SubItemFood(foodID, 19, 1, 0.1f).setUnlocalizedName("StrawberryJelly").setTextureName("StrawberryJelly").setCreativeTab(Agriculture.tab);
		rawApplePie = new SubItem(foodID, 20).setUnlocalizedName("RawApplePie").setTextureName("RawApplePie").setCreativeTab(Agriculture.tab);
		rawStrawberryPie = new SubItem(foodID, 21).setUnlocalizedName("RawStrawberryPie").setTextureName("RawStrawberryPie").setCreativeTab(Agriculture.tab);
		strawberryShortcake = new SubItemFood(foodID, 22, 1, 0.1f).setUnlocalizedName("StrawberryShortcake").setTextureName("StrawberryShortcake").setCreativeTab(Agriculture.tab);
		hamburger = new SubItemFood(foodID, 23, 1, 0.1f).setUnlocalizedName("Hamburger").setTextureName("Hamburger").setCreativeTab(Agriculture.tab);
		pbjSandwichApple = new SubItemFood(foodID, 24, 1, 0.1f).setUnlocalizedName("PBJSandwichApple").setTextureName("PBJSandwichApple").setCreativeTab(Agriculture.tab);
		pbjSandwichStrawberry = new SubItemFood(foodID, 25, 1, 0.1f).setUnlocalizedName("PBJSandwichStrawberry").setTextureName("PBJSandwichStrawberry").setCreativeTab(Agriculture.tab);
		cheeseSandwich = new SubItemFood(foodID, 26, 1, 0.1f).setUnlocalizedName("CheeseSandwich").setTextureName("CheeseSandwich").setCreativeTab(Agriculture.tab);
		butteredToast = new SubItemFood(foodID, 27, 1, 0.1f).setUnlocalizedName("ButteredToast").setTextureName("ButteredToast").setCreativeTab(Agriculture.tab);
		baconCheeseFries = new SubItemFood(foodID, 28, 1, 0.1f).setUnlocalizedName("BaconCheeseFries").setTextureName("BaconCheeseFries").setCreativeTab(Agriculture.tab);
		baconCheeseburger = new SubItemFood(foodID, 29, 1, 0.1f).setUnlocalizedName("BaconCheeseburger").setTextureName("BaconCheeseburger").setCreativeTab(Agriculture.tab);
		peanutButter = new SubItem(foodID, 30).setUnlocalizedName("PeanutButter").setTextureName("PeanutButter").setCreativeTab(Agriculture.tab);
		chocolate = new SubItemFood(foodID, 31, 1, 0.1f).setUnlocalizedName("Chocolate").setTextureName("Chocolate").setCreativeTab(Agriculture.tab);
		cheese = new SubItem(foodID, 32).setUnlocalizedName("Cheese").setTextureName("Cheese").setCreativeTab(Agriculture.tab);
		butter = new SubItem(foodID, 33).setUnlocalizedName("Butter").setTextureName("Butter").setCreativeTab(Agriculture.tab);
		whippedCream = new SubItem(foodID, 34).setUnlocalizedName("WhippedCream").setTextureName("WhippedCream").setCreativeTab(Agriculture.tab);
		dough = new SubItem(foodID, 35).setUnlocalizedName("Dough").setTextureName("Dough").setCreativeTab(Agriculture.tab);
		appleGelatin = new SubItem(foodID, 36).setUnlocalizedName("AppleGelatin").setTextureName("Gelatin").setCreativeTab(Agriculture.tab);
		strawberryGelatin = new SubItem(foodID, 37).setUnlocalizedName("StrawberryGelatin").setTextureName("StrawberryGelatin").setCreativeTab(Agriculture.tab);
		marshmellows = new SubItemFood(foodID, 38, 1, 0.1f).setUnlocalizedName("Marshmellows").setTextureName("Marshmellows").setCreativeTab(Agriculture.tab);
		pastaDough = new SubItem(foodID, 39).setUnlocalizedName("PastaDough").setTextureName("PastaDough").setCreativeTab(Agriculture.tab);
		cheeseFries = new SubItemFood(foodID, 40, 1, 0.1f).setUnlocalizedName("CheeseFries").setTextureName("CheeseFries").setCreativeTab(Agriculture.tab);
		rawChickenNuggets = new SubItem(foodID, 41).setUnlocalizedName("RawChickenNuggets").setTextureName("RawChickenNuggets").setCreativeTab(Agriculture.tab);
		cheeseburger = new SubItemFood(foodID, 42, 1, 0.1f).setUnlocalizedName("Cheeseburger").setTextureName("Cheeseburger").setCreativeTab(Agriculture.tab);
		deluxeHotCocoa = new SubItemFood(foodID, 43, 1, 0.1f).setUnlocalizedName("DeluxeHotCocoa").setTextureName("DeluxHotCocoa").setCreativeTab(Agriculture.tab);
		saltedBeef = new SubItem(foodID, 44).setUnlocalizedName("SaltedBeef").setTextureName("SaltedBeef").setCreativeTab(Agriculture.tab);
		breadedChicken = new SubItem(foodID, 45).setUnlocalizedName("BreadedChicken").setTextureName("BreadedChicken").setCreativeTab(Agriculture.tab);
		saltedPork = new SubItem(foodID, 46).setUnlocalizedName("SaltedPork").setTextureName("SaltedPork").setCreativeTab(Agriculture.tab);
		caramelApple = new SubItemFood(foodID, 47, 1, 0.1f).setUnlocalizedName("CaramelApple").setTextureName("CaramelApple").setCreativeTab(Agriculture.tab);
		chocolateCoveredStrawberries = new SubItemFood(foodID, 48, 1, 0.1f).setUnlocalizedName("ChocolateCoveredStrawberries").setTextureName("ChocolateCoveredStrawberries").setCreativeTab(Agriculture.tab);
		cinnamonAndSugar = new SubItem(foodID, 49).setUnlocalizedName("CinnamonAndSugar").setTextureName("CinnamonAndSugar").setCreativeTab(Agriculture.tab);
		sliceOfCheese = new SubItem(foodID, 50).setUnlocalizedName("SliceOfCheese").setTextureName("SliceOfCheese").setCreativeTab(Agriculture.tab);
		sliceOfBread = new SubItemFood(foodID, 51, 1, 0.1f).setUnlocalizedName("SliceOfBread").setTextureName("SliceOfBread").setCreativeTab(Agriculture.tab);
		friedChicken = new SubItemFood(foodID, 52, 1, 0.1f).setUnlocalizedName("FriedChicken").setTextureName("FriedChicken").setCreativeTab(Agriculture.tab);
		frenchFries = new SubItemFood(foodID, 53, 1, 0.1f).setUnlocalizedName("FrenchFries").setTextureName("FrenchFries").setCreativeTab(Agriculture.tab);
		shortcake = new SubItemFood(foodID, 54, 1, 0.1f).setUnlocalizedName("Shortcake").setTextureName("Shortcake").setCreativeTab(Agriculture.tab);
		carrotCake = new SubItemFood(foodID, 55, 1, 0.1f).setUnlocalizedName("CarrotCake").setTextureName("CarrotCake").setCreativeTab(Agriculture.tab);
		grilledCheese = new SubItemFood(foodID, 56, 1, 0.1f).setUnlocalizedName("GrilledCheese").setTextureName("GrilledCheese").setCreativeTab(Agriculture.tab);
		loafOfBread = new SubItemFood(foodID, 57, 1, 0.1f).setUnlocalizedName("LoafOfBread").setTextureName("LoafOfBread").setCreativeTab(Agriculture.tab);
		pasta = new SubItem(foodID, 58).setUnlocalizedName("Pasta").setTextureName("HotCocoa").setCreativeTab(Agriculture.tab);
		toastedPbjSandwichApple = new SubItemFood(foodID, 59, 1, 0.1f).setUnlocalizedName("ToastedPBJSandwichApple").setTextureName("ToastedPBJSandwichApple").setCreativeTab(Agriculture.tab);
		toastedPbjSandwichStrawberry= new SubItemFood(foodID, 60, 1, 0.1f).setUnlocalizedName("ToastedPBJSandwichStrawberry").setTextureName("ToastedPBJSandwichStrawberry").setCreativeTab(Agriculture.tab);
		roastedPeanuts = new SubItemFood(foodID, 61, 1, 0.1f).setUnlocalizedName("RoastedPeanuts").setTextureName("RoastedPeanuts").setCreativeTab(Agriculture.tab);
		applePie = new SubItemFood(foodID, 62, 1, 0.1f).setUnlocalizedName("ApplePie").setTextureName("ApplePie").setCreativeTab(Agriculture.tab);
		frenchToast = new SubItemFood(foodID, 63, 1, 0.1f).setUnlocalizedName("FrenchToast").setTextureName("FrenchToast").setCreativeTab(Agriculture.tab);
		hamburgerPatty = new SubItem(foodID, 64).setUnlocalizedName("HamburgerPatty").setTextureName("HamburgerPatty").setCreativeTab(Agriculture.tab);
		strawberryPie = new SubItemFood(foodID, 65, 1, 0.1f).setUnlocalizedName("StrawberryPie").setTextureName("StrawberryPie").setCreativeTab(Agriculture.tab);
		beefJerkey = new SubItemFood(foodID, 66, 1, 0.1f).setUnlocalizedName("BeefJerkey").setTextureName("BeefJerkey").setCreativeTab(Agriculture.tab);
		bacon = new SubItemFood(foodID, 67, 1, 0.1f).setUnlocalizedName("Bacon").setTextureName("Bacon").setCreativeTab(Agriculture.tab);
		toast = new SubItemFood(foodID, 68, 1, 0.1f).setUnlocalizedName("Toast").setTextureName("Toast").setCreativeTab(Agriculture.tab);
		caramel = new SubItem(foodID, 69).setUnlocalizedName("Caramel").setTextureName("Caramel").setCreativeTab(Agriculture.tab);
		appleMush = new SubItem(foodID, 70).setUnlocalizedName("AppleMush").setTextureName("AppleMush").setCreativeTab(Agriculture.tab);
		gelatin = new SubItem(foodID, 71).setUnlocalizedName("gelatin").setTextureName("gelatin").setCreativeTab(Agriculture.tab);
		breadCrumbs = new SubItem(foodID, 72).setUnlocalizedName("BreadCrumbs").setTextureName("BreadCrumbs").setCreativeTab(Agriculture.tab);
		groundBeef = new SubItem(foodID, 73).setUnlocalizedName("GroundBeef").setTextureName("GroundBeef").setCreativeTab(Agriculture.tab);
		groundChicken = new SubItem(foodID, 74).setUnlocalizedName("GroundChicken").setTextureName("GroundChicken").setCreativeTab(Agriculture.tab);
		groundPork = new SubItem(foodID, 75).setUnlocalizedName("GroundPork").setTextureName("GroundPork").setCreativeTab(Agriculture.tab);
		crushedPeanuts = new SubItem(foodID, 76).setUnlocalizedName("CrushedPeanuts").setTextureName("CrushedPeanuts").setCreativeTab(Agriculture.tab);
		strawberryMush = new SubItem(foodID, 77).setUnlocalizedName("StrawberryMush").setTextureName("Shortcake").setCreativeTab(Agriculture.tab);
		flour = new SubItem(foodID, 78).setUnlocalizedName("Flour").setTextureName("Flour").setCreativeTab(Agriculture.tab);
		cookingOil = new SubItem(foodID, 79).setUnlocalizedName("CookingOil").setTextureName("CookingOil").setCreativeTab(Agriculture.tab);
		
		//DONE!!!
		addNames();
	}

	public static void addNames()
	{
		LanguageRegistry.addName(carmel.getItemStack(), "Carmel");
		LanguageRegistry.addName(ovenRack.getItemStack(), "Oven Rack");
		
		LanguageRegistry.addName(hotCocoa.getItemStack(), "Hot Cocoa");
		LanguageRegistry.addName(vinegar.getItemStack(), "Vinegar");
		LanguageRegistry.addName(beer.getItemStack(), "Beer");
		LanguageRegistry.addName(rawHamburgerPatty.getItemStack(), "Raw Hamburger Patty");
		LanguageRegistry.addName(appleJellyToast.getItemStack(), "Apple Jelly Toast");
		LanguageRegistry.addName(cinnamonToast.getItemStack(), "Cinnamon Toast");
		LanguageRegistry.addName(strawberryJellyToast.getItemStack(), "Strawberry Jelly Toast");
		LanguageRegistry.addName(caramelAppleWithNuts.getItemStack(), "Caramel Apple with Nuts");
		LanguageRegistry.addName(appleJelly.getItemStack(), "Apple Jelly");
		LanguageRegistry.addName(mashedPotatos.getItemStack(), "Mashed Potatos");
		LanguageRegistry.addName(carrotCakeBatter.getItemStack(), "Carrot Cake Batter");
		LanguageRegistry.addName(rawFrenchToast.getItemStack(), "Raw French Toast");
		LanguageRegistry.addName(batter.getItemStack(), "Batter");
		LanguageRegistry.addName(macaroniAndCheese.getItemStack(), "Macaroni and Cheese");
		LanguageRegistry.addName(strawberryJelly.getItemStack(), "Strawberry Jelly");
		LanguageRegistry.addName(rawApplePie.getItemStack(), "Raw Apple Pie");
		LanguageRegistry.addName(rawStrawberryPie.getItemStack(), "Raw Strawberry Pie");
		LanguageRegistry.addName(strawberryShortcake.getItemStack(), "Strawberry Shortcake");
		LanguageRegistry.addName(hamburger.getItemStack(), "Hamburger");
		LanguageRegistry.addName(pbjSandwichApple.getItemStack(), "PB&J Sandwich (Apple)");
		LanguageRegistry.addName(pbjSandwichStrawberry.getItemStack(), "PB&J Sandwich (Strawberry)");
		LanguageRegistry.addName(cheeseSandwich.getItemStack(), "Cheese Sandwich");
		LanguageRegistry.addName(butteredToast.getItemStack(), "Buttered Toast");
	}
}