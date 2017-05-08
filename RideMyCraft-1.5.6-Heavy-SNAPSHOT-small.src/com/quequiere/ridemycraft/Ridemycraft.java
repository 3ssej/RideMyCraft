package com.quequiere.ridemycraft;

import com.quequiere.ridemycraft.b.a.a;
import com.quequiere.ridemycraft.listener.EventListener;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import me.xhawk87.PopupMenuAPI.PopupMenuAPI;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.command.PluginCommand;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Wool;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.mcstats.Metrics;
import org.mcstats.Metrics.Graph;

public final class Ridemycraft extends JavaPlugin
{
  private static Ridemycraft plugin;
  public static Permission permission = null;
  public static Economy economy = null;
  public static com.quequiere.ridemycraft.a.a.a.b language$6fdf99f1;
  public static d version;

  public final void onEnable()
  {
    plugin = this;
    try
    {
      Class.forName("net.minecraft.server.v1_8_R2.Entity");
      version = d.a;
      System.out.println("\033[32m[RideMyCraft] Minecraft server 1.8 R2\033[0m");
    }
    catch (ClassNotFoundException localClassNotFoundException1)
    {
      try
      {
        Class.forName("net.minecraft.server.v1_8_R3.Entity");
        version = d.b;
        System.out.println("\033[32m[RideMyCraft] Minecraft server 1.8 R3\033[0m");
      }
      catch (ClassNotFoundException localClassNotFoundException2)
      {
        System.out.println("\033[31m[RideMyCraft] Sorry but this version of spigot can't use RideMyCraft !\033[0m");
        return;
      }
    }
    Object localObject1;
    Object localObject2;
    try
    {
      Class.forName("org.mcstats.Metrics");
      localObject1 = this;
      try
      {
        (localObject2 = (localObject1 = new Metrics((Plugin)localObject1)).createGraph("Percentage of weapons used")).addPlotter(new b("Diamond Sword"));
        ((Metrics.Graph)localObject2).addPlotter(new c("Iron Sword"));
        ((Metrics)localObject1).start();
      }
      catch (IOException localIOException1)
      {
        (localObject1 = localIOException1).printStackTrace();
      }
      System.out.println("\033[32m[RideMyCraft] Metrics enabled !\033[0m");
    }
    catch (ClassNotFoundException localClassNotFoundException3)
    {
      System.out.println("\033[31m[RideMyCraft] No metrics\033[0m");
    }
    try
    {
      com.quequiere.ridemycraft.b.c.a(getConfig(), this);
    }
    catch (IOException localIOException2)
    {
      (localObject1 = localIOException2).printStackTrace();
      System.out.println("\033[36mError while loading config !\033[0m");
    }
    language$6fdf99f1 = new com.quequiere.ridemycraft.a.a.a.b(com.quequiere.ridemycraft.b.c.a);
    setupEconomy();
    setupPermissions();
    getCommand("ridemycraft").setExecutor(new com.quequiere.ridemycraft.a.b());
    getServer().getPluginManager().registerEvents(new EventListener(getServer()), this);
    new PopupMenuAPI().onEnable();
    (localObject1 = new Wool(Material.WOOL)).setColor(DyeColor.RED);
    (localObject1 = ((Wool)localObject1).toItemStack()).setAmount(1);
    (localObject2 = ((ItemStack)localObject1).getItemMeta()).setDisplayName("Info:");
    ArrayList localArrayList;
    (localArrayList = new ArrayList()).add("You need to use recipe that you want here");
    localArrayList.add("Then just close inventory with Escape button");
    localArrayList.add("If you want to remove this recipe");
    localArrayList.add("let craft empty then press escape.");
    ((ItemMeta)localObject2).setLore(localArrayList);
    ((ItemStack)localObject1).setItemMeta((ItemMeta)localObject2);
    a.a = (ItemStack)localObject1;
    (localObject1 = new Wool(Material.WOOL)).setColor(DyeColor.RED);
    (localObject1 = ((Wool)localObject1).toItemStack()).setAmount(1);
    (localObject2 = ((ItemStack)localObject1).getItemMeta()).setDisplayName("Info:");
    (localArrayList = new ArrayList()).add("Sorry but this recipe already exist !");
    ((ItemMeta)localObject2).setLore(localArrayList);
    ((ItemStack)localObject1).setItemMeta((ItemMeta)localObject2);
    a.b = (ItemStack)localObject1;
    (localObject1 = new Wool(Material.WOOL)).setColor(DyeColor.GREEN);
    (localObject1 = ((Wool)localObject1).toItemStack()).setAmount(1);
    (localObject2 = ((ItemStack)localObject1).getItemMeta()).setDisplayName("Info:");
    (localArrayList = new ArrayList()).add("You can add this craft");
    localArrayList.add("Click on me to add it!");
    ((ItemMeta)localObject2).setLore(localArrayList);
    ((ItemStack)localObject1).setItemMeta((ItemMeta)localObject2);
  }

  public static Ridemycraft getPlugin()
  {
    return plugin;
  }

  public final boolean setupEconomy()
  {
    RegisteredServiceProvider localRegisteredServiceProvider;
    if ((localRegisteredServiceProvider = getServer().getServicesManager().getRegistration(Economy.class)) != null)
      economy = (Economy)localRegisteredServiceProvider.getProvider();
    a.O.b();
    return economy != null;
  }

  public final boolean setupPermissions()
  {
    RegisteredServiceProvider localRegisteredServiceProvider;
    if ((localRegisteredServiceProvider = getServer().getServicesManager().getRegistration(Permission.class)) != null)
      permission = (Permission)localRegisteredServiceProvider.getProvider();
    a.N.b();
    return permission != null;
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.Ridemycraft
 * JD-Core Version:    0.6.2
 */