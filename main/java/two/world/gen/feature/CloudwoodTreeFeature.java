package two.world.gen.feature;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

import com.mojang.datafixers.Dynamic;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class CloudwoodTreeFeature extends AbstractTreeFeature<TreeFeatureConfig> {
	public CloudwoodTreeFeature(Function<Dynamic<?>, ? extends TreeFeatureConfig> deserializer) {
		super(deserializer);
	}

	@Override
	protected boolean func_225557_a_(IWorldGenerationReader worldGenerationReader, Random random, BlockPos blockPos, Set<BlockPos> set$BlockPos1, Set<BlockPos> set$BlockPos2, MutableBoundingBox mutableBoundingBox, TreeFeatureConfig treeFeatureConfig) {
		return false;
	}
}