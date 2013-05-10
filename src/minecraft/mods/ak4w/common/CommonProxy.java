package mods.ak4w.common;

import mods.ak4w.EntityGlobulox;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy 
{
	public void registerRenderInformation(){}
	
	public void init()//appelez la comme vous voulez, tant que vous l'appelez dans la méthode héritant de @PreInit
	{
//		EntityRegistry.registerGlobalEntityID(EntityGlobulox.class, "globulox", EntityRegistry.findGlobalUniqueEntityId(), 14141, 414141);
		registerRenderInformation();
	}
}
