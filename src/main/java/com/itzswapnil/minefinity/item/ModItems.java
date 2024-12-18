package com.itzswapnil.minefinity.item;

import com.itzswapnil.minefinity.Minefinity;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Minefinity.MOD_ID);

    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
