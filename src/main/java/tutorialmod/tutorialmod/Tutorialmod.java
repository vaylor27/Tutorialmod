package tutorialmod.tutorialmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tutorialmod.tutorialmod.item.ModItems;

public class Tutorialmod implements ModInitializer {

    public static String MOD_ID = "tutorialmod";
    public static Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
