package mods.ak4w;

import java.awt.Color;

import mods.ak4w.common.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.EnumHelper;
import net.minecraft.src.*;
@Mod(modid = "1", name = "Ak4w", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class mod_Ak4w
{	
    @SidedProxy(clientSide="mods.ak4w.client.ClientProxy", serverSide="mods.ak4w.common.CommonProxy", bukkitSide="mods.ak4w.common.CommonProxy")//Mettez bien les bons packages, sinon crash.
    public static CommonProxy proxy;
    
    
    
    //Creative Tabs
    public static CreativeTabs tabAk4w = new OngletCreatif("Ak4w Mods");
    
    //Blocks    
    public static final Block obsidianStairs = new BlockStairs(501, Block.obsidian, 0).setCreativeTab(tabAk4w).setUnlocalizedName("obsidianStairs");

    //Items
    
    
    
    
    //Armures
    
    
    
    
    
    //Outils
    
    @PreInit
    public void initConfig(FMLPreInitializationEvent event)
    {
        proxy.init();//Parce que je l'ai appelé ainsi
    }

    @Init public void load(FMLInitializationEvent event) 
    {
    	//GameRegistry
    	GameRegistry.registerBlock(obsidianStairs, "obsidianStairs");
    	
    	
    	//LanguageRegistry
    	
    	LanguageRegistry.addName(obsidianStairs, "Escalier d'obsidienne");
    	
    	
    	proxy.init();
    }
    
    
	@PostInit
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}