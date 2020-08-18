package io.github.fallout015.two.world.biome;

import io.github.fallout015.two.world.gen.feature.FeatureTwo;
import io.github.fallout015.two.world.gen.surfacebuilders.SurfaceBuilderTwo;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage.Decoration;

public class TheForestBiome extends Biome {
	protected TheForestBiome() {
		super(new Biome.Builder()
			.surfaceBuilder(SurfaceBuilderTwo.NIGHTMARE, SurfaceBuilderTwo.GAULT_NIGHTSTONE_CONFIG)
			.precipitation(RainType.SNOW)
			.category(Category.FOREST)
			.depth(0.1f)
			.scale(1.0f)
			.temperature(0.2f)
			.downfall(0.7f)
			.waterColor(16711680)
			.waterFogColor(16711680)
			.parent("nightmare")
		);
		
		DefaultBiomeFeatures.addSprings(this);
		this.addFeature(Decoration.VEGETAL_DECORATION, FeatureTwo.GHOSTWOOD_TREE.withConfiguration(FeatureTwo.GHOSTWOOD));
	}
}