package two.particles;

import java.util.LinkedList;

import net.minecraft.client.Minecraft;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ObjectHolder;
import two.client.particle.TwinkleParticle;

@ObjectHolder("two")
public class ParticleTypesTwo {
//	public static final BasicParticleType FROST = register("frost", false);
//	public static final BasicParticleType SPARK = register("spark", false);
//	public static final BasicParticleType TWINKLE = register("twinkle", false);
	
	// TODO fix
	
	@SuppressWarnings("resource")
	public static void onParticleTypesRegistry(final RegistryEvent.Register<ParticleType<?>> particleTypeRegistryEvent) {
		particleTypeRegistryEvent.getRegistry().registerAll(Holder.PARTICLETYPESTWO.toArray(new ParticleType<?> [] { }));

//		Minecraft.getInstance().particles.registerFactory(TWINKLE, TwinkleParticle.Factory::new);
	}
	private static BasicParticleType register(String key, boolean alwaysShow) {
		BasicParticleType particleType = new BasicParticleType(alwaysShow);
		particleType.setRegistryName(key);
		Holder.PARTICLETYPESTWO.add(particleType);
		return particleType;
	}
	static class Holder {
		public static final LinkedList<ParticleType<?>> PARTICLETYPESTWO = new LinkedList<ParticleType<?>>();
	}
}