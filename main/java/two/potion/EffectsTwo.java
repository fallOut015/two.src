package two.potion;

import java.util.LinkedList;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder("two")
public class EffectsTwo {
	public static final Effect FROSTY = register("frosty", (new EffectTwo(EffectType.HARMFUL, 14024703)).addAttributesModifier(SharedMonsterAttributes.MOVEMENT_SPEED, "e81d73be-7ee5-4811-b94b-d9eb3fb4c9cb", (double)-0.15F, AttributeModifier.Operation.MULTIPLY_TOTAL));
	
	public static void onEffectsRegistry(final RegistryEvent.Register<Effect> effectRegistryEvent) {
    	effectRegistryEvent.getRegistry().registerAll(Holder.EFFECTSTWO.toArray(new Effect[] {}));
	}
	static Effect register(String key, Effect effect) {
		Holder.EFFECTSTWO.add(effect.setRegistryName(key));
		
	    return effect;
	}
	static class Holder {
		public static final LinkedList<Effect> EFFECTSTWO = new LinkedList<Effect>();
	}
}