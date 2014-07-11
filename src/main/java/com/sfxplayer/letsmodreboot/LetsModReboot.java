package com.sfxplayer.letsmodreboot;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LetsModReboot.MODID,version = LetsModReboot.VERSION,name = LetsModReboot.NAME )
public class LetsModReboot {
    public static final String MODID = "LetsModReboot";
    public static final String VERSION = "1.0";
    public static final String NAME = "LetsModReboot";

    @Mod.Instance(LetsModReboot.MODID)
    public static LetsModReboot instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }
    @Mod.EventHandler
    public void init (FMLInitializationEvent event){

    }
    @Mod.EventHandler
    public void postInit(FMLInitializationEvent event){

    }


}
