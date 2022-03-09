package com.Apothic0n.EcosphericalExpansion.api.biome.features;

import com.Apothic0n.EcosphericalExpansion.api.biome.features.caves.ECOCavePlacements;
import net.minecraft.data.worldgen.placement.AquaticPlacements;
import net.minecraft.data.worldgen.placement.CavePlacements;
import net.minecraft.data.worldgen.placement.MiscOverworldPlacements;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

public class ECOBiomeFeatureGroups {

    public static void addGravelCavesBareFeatures(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOCavePlacements.GRAVEL_CAVES_GRAVEL);
    }

    public static void addSandCavesBareFeatures(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOCavePlacements.SAND_CAVES_SAND);
    }

    public static void addRedSandCavesBareFeatures(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOCavePlacements.RED_SAND_CAVES_RED_SAND);
    }

    public static void addAdditionalLushVegetation(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.LUSH_CAVES_CEILING_VEGETATION);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.CAVE_VINES);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.ROOTED_AZALEA_TREE);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.SPORE_BLOSSOM);
    }

    public static void addTuffCavesVegetationFeatures(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.LUSH_CAVES_CEILING_VEGETATION);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.CAVE_VINES);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOCavePlacements.TUFF_CAVES_TUFF);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.LUSH_CAVES_VEGETATION);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.ROOTED_AZALEA_TREE);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.SPORE_BLOSSOM);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.CLASSIC_VINES);
    }

    public static void addDeadTuffCavesVegetationFeatures(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.LUSH_CAVES_CEILING_VEGETATION);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.CAVE_VINES);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOCavePlacements.TUFF_CAVES_TUFF);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.SPORE_BLOSSOM);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.CLASSIC_VINES);
    }

    public static void addTreelessSwampVegetation(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.FLOWER_SWAMP);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_DEAD_BUSH);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_WATERLILY);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.BROWN_MUSHROOM_SWAMP);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.RED_MUSHROOM_SWAMP);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.BROWN_MUSHROOM_OLD_GROWTH);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.RED_MUSHROOM_OLD_GROWTH);
    }

    public static void addLushOceanVegetationFeatures(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.WARM_OCEAN_VEGETATION);
    }

    public static void addNormalOceanVegetationFeatures(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEA_PICKLE);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEAGRASS_RIVER);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEAGRASS_DEEP);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEAGRASS_SWAMP);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.KELP_WARM);
    }

    public static void addColdOceanVegetationFeatures(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEA_PICKLE);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEAGRASS_DEEP_COLD);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEAGRASS_COLD);
    }

    public static void addGrassyIceCavesVegetationFeatures(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOCavePlacements.GRASSY_ICE_CAVES_GRASSY_ICE);
    }

    public static void addGrassyTerracottaCavesVegetationFeatures(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.LUSH_CAVES_CEILING_VEGETATION);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.CAVE_VINES);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOCavePlacements.GRASSY_TERRACOTTA_CAVES_GRASSY_TERRACOTTA);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.ROOTED_AZALEA_TREE);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.SPORE_BLOSSOM);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.CLASSIC_VINES);
    }

    public static void addAmethystCavesVegetationFeatures(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOCavePlacements.SANDY_TERRACOTTA_CAVES_SANDY_TERRACOTTA);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.MISC_AMETHYSTS);
    }

    public static void addCalciteCavesVegetationFeatures(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.LUSH_CAVES_CEILING_VEGETATION);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.CAVE_VINES);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOCavePlacements.CALCITE_CAVES_CALCITE);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.LUSH_CAVES_VEGETATION);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.ROOTED_AZALEA_TREE);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.SPORE_BLOSSOM);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.CLASSIC_VINES);
    }

    public static void addMushroomCavesVegetationFeatures(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.LUSH_CAVES_CEILING_VEGETATION);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.DRIPSTONE_CLUSTER);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOCavePlacements.MUSHROOM_CAVES_BLACKSTONE);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.LARGE_DRIPSTONE);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.SPORE_BLOSSOM);
    }

    public static void addRootedCavesVegetationFeatures(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.LUSH_CAVES_CEILING_VEGETATION);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.CAVE_VINES);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOCavePlacements.ROOTED_CAVES_ROOTED_DIRT);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.ROOTED_AZALEA_TREE);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.SPORE_BLOSSOM);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.CLASSIC_VINES);
    }

    public static void addIceSpikes(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.SURFACE_STRUCTURES, MiscOverworldPlacements.ICE_SPIKE);
        pBuilder.addFeature(GenerationStep.Decoration.SURFACE_STRUCTURES, MiscOverworldPlacements.ICE_PATCH);
    }

    public static void addLushJungleTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_LUSH_JUNGLE);
    }

    public static void addSandyJungleTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_SANDY_JUNGLE);
    }

    public static void addAzaleaTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_AZALEA);
    }

    public static void addLushOakTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_LUSH_OAK);
    }

    public static void addMegaSavannaTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_MEGA_ACACIA);
    }

    public static void addSparseMegaSavannaTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_SPARSE_MEGA_ACACIA);
    }

    public static void addMegaSwampTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_MEGA_SWAMP);
    }

    public static void addMegaSpruceTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_MEGA_SPRUCE);
    }

    public static void addThinSpruceTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_THIN_SPRUCE);
    }

    public static void addBigDarkOakTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_BIG_DARK_OAK);
    }

    public static void addSmallDarkOakTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_SMALL_DARK_OAK);
    }

    public static void addNormalDarkOakTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_NORMAL_DARK_OAK);
    }

    public static void addRareNormalDarkOakTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_RARE_NORMAL_DARK_OAK);
    }

    public static void addVeryTallBirchTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_TALL_BIRCH);
    }

    public static void addTallMushrooms(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TREES_TALL_MUSHROOMS);
    }

    public static void addBasicBushes(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.OAK_BUSH);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.SPRUCE_BUSH);
    }

    public static void addBasicDesertFoilage(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TALL_CACTI);
    }

    public static void addBasaltRubble(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOCavePlacements.BASALT_CAVES_BASALT);
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.BASALT_RUBBLE);
    }

    public static void addBasicFlowers(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.BASIC_FLOWERS);
    }

    public static void addRedFlowers(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.RED_FLOWERS);
    }

    public static void addPurpleFlowers(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.PURPLE_FLOWERS);
    }

    public static void addOverworldMushrooms(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.OVERWORLD_MUSHROOMS);
    }

    public static void addNetherMushrooms(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.NETHER_MUSHROOMS);
    }

    public static void addBasicGrass(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.BASIC_GRASS);
    }

    public static void addTallGrass(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.TALL_GRASS);
    }

    public static void addFernGrass(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ECOVegetationPlacements.FERN_GRASS);
    }
}

