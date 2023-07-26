package net.nathan.tutorialmod.item;


import net.nathan.tutorialmod.item.custom.EightBallItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Rarity;
import net.nathan.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    //adding the actual item
    public static final RegistryObject<Item> ROWLET = ITEMS.register("rowlet",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.TUTORIAL_TAB)
                    .rarity(Rarity.EPIC)
                    .stacksTo(1)

            ));

    public static final RegistryObject<Item> WOOPER = ITEMS.register("wooper",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.TUTORIAL_TAB)
                    .rarity(Rarity.EPIC)
                    .stacksTo(1)

            ));

    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties()
                    .tab(ModCreativeModeTab.TUTORIAL_TAB)
                    .rarity(Rarity.EPIC)
                    .stacksTo(1)

            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }


}
