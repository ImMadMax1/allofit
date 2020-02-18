package net.mcreator.allofit;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@Elementsallofit.ModElement.Tag
public class MCreatorCheeseSliceFoodEaten extends Elementsallofit.ModElement {
	public MCreatorCheeseSliceFoodEaten(Elementsallofit instance) {
		super(instance, 1);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorCheeseSliceFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).clearActivePotions();
	}
}
