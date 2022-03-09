package com.Apothic0n.EcosphericalExpansion.api.biome.features.caves;

import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.data.worldgen.features.MiscOverworldFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.WaterFluid;

import java.util.List;

public class ECOCavePlacements {
    public static final PlacedFeature GRAVEL_CAVES_GRAVEL = PlacementUtils.register("eco:gravel_caves_gravel", ECOCaveFeatures.GRAVEL_CAVES_GRAVEL.placed(CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
    public static final PlacedFeature SAND_CAVES_SAND = PlacementUtils.register("eco:sand_caves_sand", ECOCaveFeatures.SAND_CAVES_SAND.placed(CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
    public static final PlacedFeature RED_SAND_CAVES_RED_SAND = PlacementUtils.register("eco:red_sand_caves_red_sand", ECOCaveFeatures.RED_SAND_CAVES_RED_SAND.placed(CountPlacement.of(4), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
    public static final PlacedFeature BASALT_CAVES_BASALT = PlacementUtils.register("eco:basalt_caves_basalt", ECOCaveFeatures.BASALT_CAVES_BASALT.placed(CountPlacement.of(6), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
    public static final PlacedFeature TUFF_CAVES_TUFF = PlacementUtils.register("eco:tuff_caves_tuff", ECOCaveFeatures.TUFF_CAVES_TUFF.placed(CountPlacement.of(48), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
    public static final PlacedFeature CALCITE_CAVES_CALCITE = PlacementUtils.register("eco:calcite_caves_calcite", ECOCaveFeatures.CALCITE_CAVES_CALCITE.placed(CountPlacement.of(54), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
    public static final PlacedFeature MUSHROOM_CAVES_BLACKSTONE = PlacementUtils.register("eco:mushroom_caves_blackstone", ECOCaveFeatures.MUSHROOM_CAVES_BLACKSTONE.placed(CountPlacement.of(62), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
    public static final PlacedFeature ROOTED_CAVES_ROOTED_DIRT = PlacementUtils.register("eco:rooted_caves_rooted_dirt", ECOCaveFeatures.ROOTED_CAVES_ROOTED_DIRT.placed(CountPlacement.of(62), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
    public static final PlacedFeature GRASSY_ICE_CAVES_GRASSY_ICE = PlacementUtils.register("eco:grassy_ice_caves_grassy_ice", ECOCaveFeatures.GRASSY_ICE_CAVES_GRASSY_ICE.placed(CountPlacement.of(62), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
    public static final PlacedFeature GRASSY_TERRACOTTA_CAVES_GRASSY_TERRACOTTA = PlacementUtils.register("eco:grassy_terracotta_caves_grassy_terracotta", ECOCaveFeatures.GRASSY_TERRACOTTA_CAVES_GRASSY_TERRACOTTA.placed(CountPlacement.of(62), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
    public static final PlacedFeature SANDY_TERRACOTTA_CAVES_SANDY_TERRACOTTA = PlacementUtils.register("eco:sandy_terracotta_caves_sandy_terracotta", ECOCaveFeatures.SANDY_TERRACOTTA_CAVES_SANDY_TERRACOTTA.placed(CountPlacement.of(62), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
}
