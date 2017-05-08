package com.quequiere.ridemycraft.b;

import com.quequiere.ridemycraft.Ridemycraft;
import java.io.IOException;
import java.io.PrintStream;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;

public final class c
{
  private static FileConfiguration c;
  public static String a = "en.yml";
  public static Material b = Material.DIAMOND_BLOCK;

  public static void a(FileConfiguration paramFileConfiguration, Ridemycraft paramRidemycraft)
    throws IOException
  {
    System.out.println("\033[32m------Loading configuration-------\033[0m");
    c = paramFileConfiguration;
    paramFileConfiguration.options().header("Skype Support: quequierebego");
    c.addDefault("config.language", a);
    a = c.getString("config.language");
    c.options().copyDefaults(true);
    paramRidemycraft.saveConfig();
    if (!b.a())
    {
      System.out.println("\033[33m[" + Ridemycraft.getPlugin().getName() + "] Cars folder doesn't exist ...creating");
      b.b();
      paramFileConfiguration = new com.quequiere.ridemycraft.car.a("TestCar", Material.FURNACE);
      try
      {
        paramFileConfiguration.a(false);
        paramFileConfiguration.b();
      }
      catch (a locala)
      {
        (paramFileConfiguration = locala).printStackTrace();
      }
    }
    com.quequiere.ridemycraft.car.a.c();
    System.out.println("\033[32m------Data loaded-------\033[0m");
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.b.c
 * JD-Core Version:    0.6.2
 */