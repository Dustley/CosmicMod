package cosmic.cosmic;

import cosmic.cosmic.block.ModBlocks;
import cosmic.cosmic.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cosmic implements ModInitializer {

    public static final String MOD_ID = "cosmic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
