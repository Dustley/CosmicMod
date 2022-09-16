package cosmic.cosmic.item;

import cosmic.cosmic.Cosmic;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Rope item
    public static final Item ROPE = registerItem("rope",
            new Item(new FabricItemSettings().group(ModItemGroup.COSMIC)));



    // registering mumbo jumbo i don't understand
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Cosmic.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Cosmic.LOGGER.debug("Registering Modded items for " + Cosmic.MOD_ID);
    }
}
