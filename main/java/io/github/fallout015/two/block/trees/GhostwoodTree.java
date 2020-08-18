package io.github.fallout015.two.block.trees;

import java.util.Random;

import javax.annotation.Nullable;

import io.github.fallout015.two.world.gen.feature.FeatureTwo;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class GhostwoodTree extends Tree {
	@Nullable
	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean pick) {
		return FeatureTwo.GHOSTWOOD_TREE.withConfiguration(FeatureTwo.GHOSTWOOD);
	}
}