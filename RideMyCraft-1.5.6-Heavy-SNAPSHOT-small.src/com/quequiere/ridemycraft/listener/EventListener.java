package com.quequiere.ridemycraft.listener;

import com.quequiere.ridemycraft.Ridemycraft;
import com.quequiere.ridemycraft.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.craftbukkit.v1_8_R2.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_8_R2.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftInventoryCrafting;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class EventListener
  implements Listener
{
  public static Server server = null;

  public EventListener(Server paramServer)
  {
    server = paramServer;
  }

  @EventHandler(priority=EventPriority.HIGHEST)
  public void PlayerInteractWithCarEvent(PrepareItemCraftEvent paramPrepareItemCraftEvent)
  {
    if (Ridemycraft.version.equals(d.b))
    {
      if (com.quequiere.ridemycraft.a.a.a.a.a.b.a.get(paramPrepareItemCraftEvent.getInventory()) != null)
        paramPrepareItemCraftEvent.getInventory().setItem(0, com.quequiere.ridemycraft.a.b);
    }
    else if ((Ridemycraft.version.equals(d.a)) && (com.quequiere.ridemycraft.a.a.a.a.a.a.a.get(paramPrepareItemCraftEvent.getInventory()) != null))
      paramPrepareItemCraftEvent.getInventory().setItem(0, com.quequiere.ridemycraft.a.b);
  }

  @EventHandler(priority=EventPriority.HIGHEST)
  public void playerModifyRecent(InventoryCloseEvent paramInventoryCloseEvent)
  {
    Object localObject1;
    Object localObject2;
    if (Ridemycraft.version.equals(d.b))
    {
      if (com.quequiere.ridemycraft.a.a.a.a.a.b.a.get(paramInventoryCloseEvent.getInventory()) != null)
      {
        localObject1 = (Player)paramInventoryCloseEvent.getPlayer();
        localObject2 = (com.quequiere.ridemycraft.car.a)com.quequiere.ridemycraft.a.a.a.a.a.b.a.get(paramInventoryCloseEvent.getInventory());
        localObject2 = localObject1;
        localObject1 = localObject2;
        if (((paramInventoryCloseEvent = (CraftInventoryCrafting)(paramInventoryCloseEvent = paramInventoryCloseEvent).getView().getTopInventory()).getResult() == null) || (paramInventoryCloseEvent.getResult().equals(com.quequiere.ridemycraft.a.a)))
        {
          ArrayList localArrayList = new ArrayList();
          ShapedRecipe localShapedRecipe = new ShapedRecipe(((com.quequiere.ridemycraft.car.a)localObject1).g());
          int i = 0;
          int j = 0;
          ItemStack[] arrayOfItemStack;
          int m = (arrayOfItemStack = paramInventoryCloseEvent.getMatrix()).length;
          for (int k = 0; k < m; k++)
            if ((paramInventoryCloseEvent = arrayOfItemStack[k]) != null)
            {
              if (paramInventoryCloseEvent.getType().equals(Material.AIR))
              {
                localArrayList.add(new com.quequiere.ridemycraft.d.a(null, ' '));
              }
              else
              {
                localArrayList.add(new com.quequiere.ridemycraft.d.a(paramInventoryCloseEvent, com.quequiere.ridemycraft.d.a.a(i)));
                j++;
              }
              i++;
            }
          if (j <= 0)
          {
            if (((com.quequiere.ridemycraft.car.a)localObject1).t() == null)
            {
              ((Player)localObject2).sendMessage("You need to make a recipe !");
            }
            else
            {
              ((com.quequiere.ridemycraft.car.a)localObject1).a(null);
              try
              {
                ((com.quequiere.ridemycraft.car.a)localObject1).a(true);
              }
              catch (com.quequiere.ridemycraft.b.a locala1)
              {
              }
              ((Player)localObject2).sendMessage("Recipe has been removed!");
              ((Player)localObject2).sendMessage("You need to restart your server to apply this!");
              return;
            }
          }
          else
          {
            localShapedRecipe.shape(new String[] { (String)com.quequiere.ridemycraft.d.a.a(localArrayList).get(0), (String)com.quequiere.ridemycraft.d.a.a(localArrayList).get(1), (String)com.quequiere.ridemycraft.d.a.a(localArrayList).get(2) });
            Iterator localIterator = localArrayList.iterator();
            while (localIterator.hasNext())
              if ((paramInventoryCloseEvent = (com.quequiere.ridemycraft.d.a)localIterator.next()).a != null)
                localShapedRecipe.setIngredient(paramInventoryCloseEvent.b, paramInventoryCloseEvent.a.getData());
            if (((com.quequiere.ridemycraft.car.a)localObject1).t() != null)
              ((Player)localObject2).sendMessage("Old recipe removed, you need to restart server to complete this!");
            Bukkit.getServer().addRecipe(localShapedRecipe);
            ((com.quequiere.ridemycraft.car.a)localObject1).a(localShapedRecipe);
            try
            {
              ((com.quequiere.ridemycraft.car.a)localObject1).a(true);
            }
            catch (com.quequiere.ridemycraft.b.a locala2)
            {
            }
            ((Player)localObject2).sendMessage("Recipe added !");
            return;
          }
        }
        else if (paramInventoryCloseEvent.getResult().equals(com.quequiere.ridemycraft.a.b))
        {
          ((Player)localObject2).sendMessage("This craft already exist !");
        }
      }
    }
    else if ((Ridemycraft.version.equals(d.a)) && (com.quequiere.ridemycraft.a.a.a.a.a.a.a.get(paramInventoryCloseEvent.getInventory()) != null))
    {
      localObject1 = (Player)paramInventoryCloseEvent.getPlayer();
      localObject2 = (com.quequiere.ridemycraft.car.a)com.quequiere.ridemycraft.a.a.a.a.a.a.a.get(paramInventoryCloseEvent.getInventory());
      com.quequiere.ridemycraft.a.a(paramInventoryCloseEvent, (com.quequiere.ridemycraft.car.a)localObject2, (Player)localObject1);
    }
  }

  @EventHandler(priority=EventPriority.HIGHEST)
  public void playerModifyRecent(InventoryClickEvent paramInventoryClickEvent)
  {
    if (Ridemycraft.version.equals(d.b))
    {
      if ((com.quequiere.ridemycraft.a.a.a.a.a.b.a.get(paramInventoryClickEvent.getInventory()) != null) && (paramInventoryClickEvent.getSlotType().equals(InventoryType.SlotType.RESULT)))
        paramInventoryClickEvent.setCancelled(true);
    }
    else if ((Ridemycraft.version.equals(d.a)) && (com.quequiere.ridemycraft.a.a.a.a.a.a.a.get(paramInventoryClickEvent.getInventory()) != null) && (paramInventoryClickEvent.getSlotType().equals(InventoryType.SlotType.RESULT)))
      paramInventoryClickEvent.setCancelled(true);
  }

  @EventHandler(priority=EventPriority.HIGHEST)
  public void PlayerInteractWithCarEvent(PlayerInteractAtEntityEvent paramPlayerInteractAtEntityEvent)
  {
    if (Ridemycraft.version.equals(d.a))
    {
      Object localObject;
      com.quequiere.ridemycraft.c.a.b localb;
      com.quequiere.ridemycraft.a.a.a.a.b localb1;
      if (((paramPlayerInteractAtEntityEvent = paramPlayerInteractAtEntityEvent).getRightClicked() instanceof CraftPlayer))
      {
        if ((localObject = (CraftPlayer)paramPlayerInteractAtEntityEvent.getRightClicked()).getVehicle() == null)
          break label250;
        if ((com.quequiere.ridemycraft.c.a.b.a((CraftEntity)((CraftPlayer)localObject).getVehicle()) != null) || (com.quequiere.ridemycraft.c.a.a.a((CraftEntity)((CraftPlayer)localObject).getVehicle()) != null))
        {
          paramPlayerInteractAtEntityEvent.setCancelled(true);
          if (com.quequiere.ridemycraft.c.a.b.a((CraftEntity)((CraftPlayer)localObject).getVehicle()) != null)
            localb = com.quequiere.ridemycraft.c.a.b.a((CraftEntity)((CraftPlayer)localObject).getVehicle());
          else
            localb = com.quequiere.ridemycraft.c.a.a.a((CraftEntity)((CraftPlayer)localObject).getVehicle());
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
          com.quequiere.ridemycraft.a.a.a.b.a(paramPlayerInteractAtEntityEvent.getPlayer(), localb);
          return;
        }
      }
      if (((paramPlayerInteractAtEntityEvent.getRightClicked() instanceof CraftEntity)) && (com.quequiere.ridemycraft.c.a.b.a((CraftEntity)paramPlayerInteractAtEntityEvent.getRightClicked()) != null))
      {
        paramPlayerInteractAtEntityEvent.setCancelled(true);
        localObject = paramPlayerInteractAtEntityEvent.getPlayer();
        if (!(localb = com.quequiere.ridemycraft.c.a.b.a((CraftEntity)paramPlayerInteractAtEntityEvent.getRightClicked())).c().equals(localObject))
        {
          (localb1 = new com.quequiere.ridemycraft.a.a.a.a.b()).a(localb, (Player)localObject);
          return;
        }
        com.quequiere.ridemycraft.a.a.a.b.a((Player)localObject, localb);
      }
    }
    else
    {
      label250: if (Ridemycraft.version.equals(d.b))
        com.quequiere.ridemycraft.a.a.a.b.a(paramPlayerInteractAtEntityEvent);
    }
  }

  @EventHandler(priority=EventPriority.HIGHEST)
  public void playerchoosecarevent(InventoryClickEvent paramInventoryClickEvent)
  {
    Player localPlayer = (Player)paramInventoryClickEvent.getWhoClicked();
    Object localObject1 = paramInventoryClickEvent.getCurrentItem();
    Object localObject2 = paramInventoryClickEvent.getInventory();
    if ((localObject1 == null) || (((ItemStack)localObject1).getType().equals(Material.AIR)))
      return;
    com.quequiere.ridemycraft.car.a locala;
    if (((Inventory)localObject2).getName().equals(com.quequiere.ridemycraft.e.a.a))
    {
      locala = com.quequiere.ridemycraft.car.a.a(localObject1 = (localObject1 = ((ItemStack)localObject1).getItemMeta()).getDisplayName());
      if (paramInventoryClickEvent.getRawSlot() >= ((Inventory)localObject2).getSize())
      {
        paramInventoryClickEvent.setCancelled(true);
        return;
      }
      if (locala == null)
      {
        com.quequiere.ridemycraft.b.a.a.B.a(localPlayer, (String)localObject1);
      }
      else if (com.quequiere.ridemycraft.e.a.a(localPlayer).c(locala))
      {
        localObject2 = localPlayer;
        localObject1 = locala;
        if (Ridemycraft.version.equals(d.a))
        {
          com.quequiere.ridemycraft.c.a.b.g();
          if (com.quequiere.ridemycraft.c.a.b.a((Player)localObject2, (com.quequiere.ridemycraft.car.a)localObject1))
          {
            com.quequiere.ridemycraft.b.a.a.f.a((Player)localObject2);
            break label244;
          }
        }
        else if (Ridemycraft.version.equals(d.b))
        {
          com.quequiere.ridemycraft.c.b.b.g();
          if (com.quequiere.ridemycraft.c.b.b.a((Player)localObject2, (com.quequiere.ridemycraft.car.a)localObject1))
          {
            com.quequiere.ridemycraft.b.a.a.f.a((Player)localObject2);
            break label244;
          }
        }
        if (Ridemycraft.version.equals(d.a))
          com.quequiere.ridemycraft.c.a.b.b((Player)localObject2, (com.quequiere.ridemycraft.car.a)localObject1);
        else if (Ridemycraft.version.equals(d.b))
          com.quequiere.ridemycraft.c.b.b.b((Player)localObject2, (com.quequiere.ridemycraft.car.a)localObject1);
      }
      else
      {
        com.quequiere.ridemycraft.b.a.a.z.a(localPlayer);
      }
      label244: paramInventoryClickEvent.setCancelled(true);
      localPlayer.closeInventory();
      return;
    }
    if (((Inventory)localObject2).getName().equals(com.quequiere.ridemycraft.a.a.a.a))
    {
      locala = com.quequiere.ridemycraft.car.a.a(localObject1 = (localObject1 = ((ItemStack)localObject1).getItemMeta()).getDisplayName());
      if (paramInventoryClickEvent.getRawSlot() >= ((Inventory)localObject2).getSize())
      {
        paramInventoryClickEvent.setCancelled(true);
        return;
      }
      if (locala == null)
        com.quequiere.ridemycraft.b.a.a.B.a(localPlayer, (String)localObject1);
      else if (!com.quequiere.ridemycraft.e.a.a(localPlayer).c(locala))
        com.quequiere.ridemycraft.e.a.a(localPlayer).b(locala);
      else
        com.quequiere.ridemycraft.b.a.a.y.a(localPlayer);
      paramInventoryClickEvent.setCancelled(true);
      localPlayer.closeInventory();
    }
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.listener.EventListener
 * JD-Core Version:    0.6.2
 */