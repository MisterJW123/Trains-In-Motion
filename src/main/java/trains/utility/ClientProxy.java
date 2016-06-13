package trains.utility;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import trains.entities.EntityTrainCore;
import trains.gui.GUITest;

public class ClientProxy extends CommonProxy {

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case GUITest.GUI_ID: {
                //TODO client thinks the train is an instance of net.minecraft.entity.item.EntityMinecartEmpty, not EntityTrainCore
                if (player != null && player.ridingEntity instanceof EntityTrainCore) {
                    return new GUITest(player.inventory, (EntityTrainCore) player.ridingEntity);
                } else {
                    return null;
                }
            }

            default:{
                return null;
            }
        }
    }
}
