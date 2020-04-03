package two.block.trees;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import two.world.gen.feature.FeatureTwo;

public class CloudwoodTree extends Tree {
	@Nullable
	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> func_225546_b_(Random random, boolean pick) {
		return FeatureTwo.CLOUDWOOD_TREE.func_225566_b_(pick ? DefaultBiomeFeatures.field_230136_s_ : DefaultBiomeFeatures.field_226812_g_);
	}
}