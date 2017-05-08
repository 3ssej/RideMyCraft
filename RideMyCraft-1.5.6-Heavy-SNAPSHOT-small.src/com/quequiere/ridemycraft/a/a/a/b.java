package com.quequiere.ridemycraft.a.a.a;

import com.quequiere.ridemycraft.Ridemycraft;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import me.xhawk87.PopupMenuAPI.MenuItem;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import me.xhawk87.PopupMenuAPI.PopupMenuAPI;
import me.xhawk87.PopupMenuAPI.StringUtil;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class b
{
  public FileConfiguration a;
  public File b;

  public static void a(Player paramPlayer, com.quequiere.ridemycraft.c.b.b paramb)
  {
    ArrayList localArrayList = i.b(paramb);
    PopupMenu localPopupMenu = PopupMenuAPI.createMenu("Car Menu", (int)Math.ceil(localArrayList.size() / 9.0D));
    for (int i = 0; i < localArrayList.size(); i++)
    {
      i locali = (i)localArrayList.get(i);
      c localc;
      (localc = new c(locali.c(), locali.a(paramb), locali, localPopupMenu, paramb)).setDescriptions(StringUtil.wrapWords(locali.b(), 40));
      localPopupMenu.addMenuItem(localc, i);
    }
    localPopupMenu.setMenuCloseBehaviour(new d());
    localPopupMenu.openMenu(paramPlayer);
  }

  public static void a(Player paramPlayer, com.quequiere.ridemycraft.c.a.b paramb)
  {
    ArrayList localArrayList = h.b(paramb);
    PopupMenu localPopupMenu = PopupMenuAPI.createMenu("Car Menu", (int)Math.ceil(localArrayList.size() / 9.0D));
    for (int i = 0; i < localArrayList.size(); i++)
    {
      h localh = (h)localArrayList.get(i);
      e locale;
      (locale = new e(localh.c(), localh.a(paramb), localh, localPopupMenu, paramb)).setDescriptions(StringUtil.wrapWords(localh.b(), 40));
      localPopupMenu.addMenuItem(locale, i);
    }
    localPopupMenu.setMenuCloseBehaviour(new f());
    localPopupMenu.openMenu(paramPlayer);
  }

  public b(String paramString)
  {
    this.b = new File(Ridemycraft.getPlugin().getDataFolder(), "/language/" + paramString);
    this.a = YamlConfiguration.loadConfiguration(this.b);
    for (paramString : com.quequiere.ridemycraft.b.a.a.d())
    {
      this.a.addDefault("message." + paramString.name(), paramString.a());
      List localList;
      if ((localList = this.a.getStringList("message." + paramString.name())).size() > 0)
        paramString.a(localList);
    }
    this.a.options().copyDefaults(true);
    a();
  }

  public void a()
  {
    try
    {
      this.a.save(this.b);
      return;
    }
    catch (IOException localIOException2)
    {
      IOException localIOException1;
      (localIOException1 = localIOException2).printStackTrace();
    }
  }

  public static void a(PlayerInteractAtEntityEvent paramPlayerInteractAtEntityEvent)
  {
    Object localObject;
    com.quequiere.ridemycraft.c.b.b localb;
    com.quequiere.ridemycraft.a.a.a.a.b localb1;
    if ((paramPlayerInteractAtEntityEvent.getRightClicked() instanceof CraftPlayer))
    {
      if ((localObject = (CraftPlayer)paramPlayerInteractAtEntityEvent.getRightClicked()).getVehicle() == null)
        return;
      if ((com.quequiere.ridemycraft.c.b.b.a((CraftEntity)((CraftPlayer)localObject).getVehicle()) != null) || (com.quequiere.ridemycraft.c.b.a.a((CraftEntity)((CraftPlayer)localObject).getVehicle()) != null))
      {
        paramPlayerInteractAtEntityEvent.setCancelled(true);
        if (com.quequiere.ridemycraft.c.b.b.a((CraftEntity)((CraftPlayer)localObject).getVehicle()) != null)
          localb = com.quequiere.ridemycraft.c.b.b.a((CraftEntity)((CraftPlayer)localObject).getVehicle());
        else
          localb = com.quequiere.ridemycraft.c.b.a.a((CraftEntity)((CraftPlayer)localObject).getVehicle());
        if (localb == null)
        {
          paramPlayerInteractAtEntityEvent.getPlayer().sendMessage("Sorry this car doesn't exist");
          return;
        }
        if (!localb.c().equals(paramPlayerInteractAtEntityEvent.getPlayer()))
        {
          (localb1 = new com.quequiere.ridemycraft.a.a.a.a.b()).a(localb, paramPlayerInteractAtEntityEvent.getPlayer());
          return;
        }
        a(paramPlayerInteractAtEntityEvent.getPlayer(), localb);
        return;
      }
    }
    if (((paramPlayerInteractAtEntityEvent.getRightClicked() instanceof CraftEntity)) && (com.quequiere.ridemycraft.c.b.b.a((CraftEntity)paramPlayerInteractAtEntityEvent.getRightClicked()) != null))
    {
      paramPlayerInteractAtEntityEvent.setCancelled(true);
      localObject = paramPlayerInteractAtEntityEvent.getPlayer();
      if (!(localb = com.quequiere.ridemycraft.c.b.b.a((CraftEntity)paramPlayerInteractAtEntityEvent.getRightClicked())).c().equals(localObject))
      {
        (localb1 = new com.quequiere.ridemycraft.a.a.a.a.b()).a(localb, (Player)localObject);
        return;
      }
      a((Player)localObject, localb);
    }
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.b
 * JD-Core Version:    0.6.2
 */