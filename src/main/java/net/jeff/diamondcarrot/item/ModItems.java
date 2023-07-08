package net.jeff.diamondcarrot.item;

import net.jeff.diamondcarrot.DiamondCarrot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Holds a list of the items that will make up the mod -- in this case, Diamond Carrots
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DiamondCarrot.MOD_ID);

    public static final RegistryObject<Item> DIAMOND_CARROT = ITEMS.register("diamond_carrot", () -> new Item(new Item.Properties().food(Foods.DIAMOND_CARROT_PROPERTIES)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static class Foods {
        public static final FoodProperties DIAMOND_CARROT_PROPERTIES = new FoodProperties.Builder()
                .nutrition(20)
                .saturationMod(20.0f)
                .alwaysEat()
                .fast()
                .build();
    }
}
