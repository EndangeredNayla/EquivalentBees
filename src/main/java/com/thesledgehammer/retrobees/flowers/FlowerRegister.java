package com.thesledgehammer.retrobees.flowers;

import com.thesledgehammer.retrobees.RetroBees;
import com.thesledgehammer.retrobees.misc.oredictionaryresourcetypes.Ores;

import forestry.api.apiculture.EnumBeeChromosome;
import forestry.api.apiculture.FlowerManager;
import forestry.api.genetics.AlleleManager;
import forestry.api.genetics.IAlleleFlowers;
import forestry.api.genetics.IFlowerRegistry;
import forestry.apiculture.flowers.FlowerRegistry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class FlowerRegister {
	public static IFlowerRegistry flowerRegistry;

	public static final String FlowerType = "flowers";
	
	public static final String FlowerDarkMatter = "DarkMatter";
	public static final String FlowerRedMatter = "RedMatter";
	public static final String FlowerIron = "Iron";
	public static final String FlowerGold = "Gold";
	public static final String FlowerCopper = "Copper";
	public static final String FlowerSilver = "Silver";
	public static final String FlowerLead = "Lead";
	public static final String FlowerTin = "Tin";
	public static final String FlowerAluminium = "Aluminium";
	public static final String FlowerGalena = "Galena";
	public static final String FlowerRuby = "Ruby";
	public static final String FlowerSapphire = "Sapphire";
	public static final String FlowerBauxite = "Bauxite";
	public static final String FlowerCinnabar = "Cinnabar";
	public static final String FlowerSphalerite = "Sphalerite";
	public static final String FlowerTungsten = "Tungsten";
	public static final String FlowerPeridot = "Peridot";
	public static final String FlowerSodalite = "Sodalite";
	public static final String FlowerIridium = "Iridium";
	public static final String FlowerPyrite = "Pyrite";
	public static final String FlowerSheldonite = "Sheldonite";
	
	public static IAlleleFlowers DARKMATTER;
	public static IAlleleFlowers REDMATTER;
	public static IAlleleFlowers IRON_ORE;
	public static IAlleleFlowers GOLD_ORE;
	public static IAlleleFlowers COPPER_ORE;
	public static IAlleleFlowers SILVER_ORE;
	public static IAlleleFlowers LEAD_ORE;
	public static IAlleleFlowers TIN_ORE;
	public static IAlleleFlowers ALUMINIUM_ORE;
	public static IAlleleFlowers GALENA_ORE;
	public static IAlleleFlowers RUBY_ORE;
	public static IAlleleFlowers SAPPHIRE_ORE;
	public static IAlleleFlowers BAUXITE_ORE;
	public static IAlleleFlowers CINNABAR_ORE;
	public static IAlleleFlowers SPHALERITE_ORE;
	public static IAlleleFlowers TUNGSTEN_ORE;
	public static IAlleleFlowers PERIDOT_ORE;
	public static IAlleleFlowers SODALITE_ORE;
	public static IAlleleFlowers IRIDIUM_ORE;
	public static IAlleleFlowers PYRITE_ORE;
	public static IAlleleFlowers SHELDONITE_ORE;
	
	public static void initFlowers() {
		Ores ore = new Ores();
		FlowerRegistry flowerRegistry = (FlowerRegistry) FlowerManager.flowerRegistry;
		//flowerRegistry.registerAcceptableFlower(ProjectEAPI.DarkMatter.getBlock(), FlowerDarkMatter);
		//flowerRegistry.registerAcceptableFlower(ProjectEAPI.RedMatter.getBlock(), FlowerRedMatter);
		flowerRegistry.registerAcceptableFlower(Blocks.GOLD_ORE, FlowerGold);
		flowerRegistry.registerAcceptableFlower(Blocks.IRON_ORE, FlowerIron);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(0).getItem()), FlowerCopper);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(1).getItem()), FlowerSilver);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(2).getItem()), FlowerLead);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(3).getItem()), FlowerTin);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(4).getItem()), FlowerAluminium);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(5).getItem()), FlowerGalena);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(6).getItem()), FlowerRuby);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(7).getItem()), FlowerSapphire);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(8).getItem()), FlowerBauxite);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(9).getItem()), FlowerCinnabar);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(10).getItem()), FlowerSphalerite);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(11).getItem()), FlowerTungsten);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(12).getItem()), FlowerPeridot);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(13).getItem()), FlowerSodalite);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(14).getItem()), FlowerIridium);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(15).getItem()), FlowerPyrite);
		flowerRegistry.registerAcceptableFlower(Block.getBlockFromItem(ore.getOreUID(16).getItem()), FlowerSheldonite);
		
		DARKMATTER = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerDarkMatter, EnumFlowers.DARKMATTER.getValue(), false, EnumBeeChromosome.FLOWER_PROVIDER);
		REDMATTER = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerRedMatter, EnumFlowers.REDMATTER.getValue(), true, EnumBeeChromosome.FLOWER_PROVIDER);
		IRON_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerIron, EnumFlowers.IRON.getValue(), false, EnumBeeChromosome.FLOWER_PROVIDER);
		GOLD_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerGold, EnumFlowers.GOLD.getValue(), true, EnumBeeChromosome.FLOWER_PROVIDER);
		COPPER_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerCopper, EnumFlowers.COPPER.getValue(), false, EnumBeeChromosome.FLOWER_PROVIDER);
		SILVER_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerSilver, EnumFlowers.SILVER.getValue(), true, EnumBeeChromosome.FLOWER_PROVIDER);
		LEAD_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerLead, EnumFlowers.LEAD.getValue(), false, EnumBeeChromosome.FLOWER_PROVIDER);
		TIN_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerTin, EnumFlowers.TIN.getValue(), true, EnumBeeChromosome.FLOWER_PROVIDER);
		ALUMINIUM_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerAluminium, EnumFlowers.ALUMINUM.getValue(), false, EnumBeeChromosome.FLOWER_PROVIDER);
		GALENA_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerGalena, EnumFlowers.GALENA.getValue(), true, EnumBeeChromosome.FLOWER_PROVIDER);
		RUBY_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerRuby, EnumFlowers.RUBY.getValue(), false, EnumBeeChromosome.FLOWER_PROVIDER);
		SAPPHIRE_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerSapphire, EnumFlowers.SAPPHIRE.getValue(), true, EnumBeeChromosome.FLOWER_PROVIDER);
		BAUXITE_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerBauxite, EnumFlowers.BAUXITE.getValue(), false, EnumBeeChromosome.FLOWER_PROVIDER);
		CINNABAR_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerCinnabar, EnumFlowers.CINNABAR.getValue(), true, EnumBeeChromosome.FLOWER_PROVIDER);
		SPHALERITE_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerSphalerite, EnumFlowers.SPHALERITE.getValue(), false, EnumBeeChromosome.FLOWER_PROVIDER);
		TUNGSTEN_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerTungsten, EnumFlowers.TUNGSTEN.getValue(), true, EnumBeeChromosome.FLOWER_PROVIDER);
		PERIDOT_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerPeridot, EnumFlowers.PERIDOT.getValue(), false, EnumBeeChromosome.FLOWER_PROVIDER);
		SODALITE_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerSodalite, EnumFlowers.SODALITE.getValue(), true, EnumBeeChromosome.FLOWER_PROVIDER);
		IRIDIUM_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerIridium, EnumFlowers.IRIDIUM.getValue(), false, EnumBeeChromosome.FLOWER_PROVIDER);
		PYRITE_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerPyrite, EnumFlowers.PYRITE.getValue(), true, EnumBeeChromosome.FLOWER_PROVIDER);
		SHELDONITE_ORE = AlleleManager.alleleFactory.createFlowers(RetroBees.MOD_ID, FlowerType, FlowerSheldonite, EnumFlowers.SHELDONITE.getValue(), false, EnumBeeChromosome.FLOWER_PROVIDER);
	}
}
