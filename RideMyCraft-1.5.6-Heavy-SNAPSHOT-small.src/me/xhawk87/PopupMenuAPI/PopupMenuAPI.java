package me.xhawk87.PopupMenuAPI;

import com.quequiere.ridemycraft.Ridemycraft;
import java.util.Iterator;
import java.util.List;
import org.bukkit.Server;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.PluginManager;

public class PopupMenuAPI
  implements Listener
{
  private static Ridemycraft instance;

  public void onEnable()
  {
    instance = Ridemycraft.getPlugin();
    Ridemycraft.getPlugin().getServer().getPluginManager().registerEvents(this, Ridemycraft.getPlugin());
  }

  public static PopupMenu createMenu(String paramString, int paramInt)
  {
    return new PopupMenu(paramString, paramInt);
  }

  public static PopupMenu cloneMenu(PopupMenu paramPopupMenu)
  {
    return paramPopupMenu.clone();
  }

  public static void removeMenu(PopupMenu paramPopupMenu)
  {
    Iterator localIterator = paramPopupMenu.getInventory().getViewers().iterator();
    while (localIterator.hasNext())
    {
      HumanEntity localHumanEntity;
      if (((localHumanEntity = (HumanEntity)localIterator.next()) instanceof Player))
        paramPopupMenu.closeMenu((Player)localHumanEntity);
      else
        localHumanEntity.closeInventory();
    }
  }

  public static void switchMenu(Player paramPlayer, PopupMenu paramPopupMenu1, PopupMenu paramPopupMenu2)
  {
    paramPopupMenu1.closeMenu(paramPlayer);
    new a(paramPopupMenu2, paramPlayer).runTask(instance);
  }

  @EventHandler(priority=EventPriority.LOWEST)
  public void onMenuItemClicked(InventoryClickEvent paramInventoryClickEvent)
  {
    Inventory localInventory;
    if (((localInventory = paramInventoryClickEvent.getInventory()).getHolder() instanceof PopupMenu))
    {
      PopupMenu localPopupMenu = (PopupMenu)localInventory.getHolder();
      if ((paramInventoryClickEvent.getWhoClicked() instanceof Player))
      {
        Player localPlayer = (Player)paramInventoryClickEvent.getWhoClicked();
        if (paramInventoryClickEvent.getSlotType() == InventoryType.SlotType.OUTSIDE)
        {
          if (localPopupMenu.exitOnClickOutside())
            localPopupMenu.closeMenu(localPlayer);
        }
        else
        {
          int i;
          if ((i = paramInventoryClickEvent.getRawSlot()) < localInventory.getSize())
            localPopupMenu.selectMenuItem(localPlayer, i);
          else if (localPopupMenu.exitOnClickOutside())
            localPopupMenu.closeMenu(localPlayer);
        }
      }
      paramInventoryClickEvent.setCancelled(true);
    }
  }

  @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
  public void onMenuClosed(InventoryCloseEvent paramInventoryCloseEvent)
  {
    Object localObject;
    if (((paramInventoryCloseEvent.getPlayer() instanceof Player)) && (((localObject = paramInventoryCloseEvent.getInventory()).getHolder() instanceof PopupMenu)) && ((localObject = (localObject = (PopupMenu)((Inventory)localObject).getHolder()).getMenuCloseBehaviour()) != null))
      ((MenuCloseBehaviour)localObject).onClose((Player)paramInventoryCloseEvent.getPlayer());
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     me.xhawk87.PopupMenuAPI.PopupMenuAPI
 * JD-Core Version:    0.6.2
 */