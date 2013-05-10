package mods.ak4w.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import mods.ak4w.EntityGlobulox;
import mods.ak4w.common.CommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy 
{
	/**
	 *  Ce proxy ne concerne que la partie "Client" du mod, il gère :
	 *  - Les textures     
	 *  - Les renders
	 *  ...
	 */
	@Override
	public void registerRenderInformation()
	{
//		RenderingRegistry.registerEntityRenderingHandler(EntityGlobulox.class, new RenderGlobulox(new ModelGlobulox(), 1.0F));
	}
}