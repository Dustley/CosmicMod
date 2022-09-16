package cosmic.cosmic.item;

import cosmic.cosmic.Cosmic;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    // Item Tab
    public static final ItemGroup COSMIC = FabricItemGroupBuilder.build(
            new Identifier(Cosmic.MOD_ID,"cosmic"), () -> new ItemStack(ModItems.ROPE));

}
