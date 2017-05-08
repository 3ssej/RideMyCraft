package me.xhawk87.PopupMenuAPI;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class PopupMenu
  implements InventoryHolder
{
  private HashMap<Integer, MenuItem> items = new HashMap();
  private Inventory inventory;
  private String title;
  private int rows;
  private boolean exitOnClickOutside = true;
  private MenuCloseBehaviour menuCloseBehaviour;

  public PopupMenu(String paramString, int paramInt)
  {
    this.title = paramString;
    this.rows = paramInt;
  }

  public void setMenuCloseBehaviour(MenuCloseBehaviour paramMenuCloseBehaviour)
  {
    this.menuCloseBehaviour = paramMenuCloseBehaviour;
  }

  public MenuCloseBehaviour getMenuCloseBehaviour()
  {
    return this.menuCloseBehaviour;
  }

  public void setExitOnClickOutside(boolean paramBoolean)
  {
    this.exitOnClickOutside = paramBoolean;
  }

  public boolean addMenuItem(MenuItem paramMenuItem, int paramInt1, int paramInt2)
  {
    return addMenuItem(paramMenuItem, paramInt2 * 9 + paramInt1);
  }

  public boolean addMenuItem(MenuItem paramMenuItem, int paramInt)
  {
    ItemStack localItemStack;
    if (((localItemStack = getInventory().getItem(paramInt)) != null) && (localItemStack.getType() != Material.AIR))
      return false;
    getInventory().setItem(paramInt, paramMenuItem.getItemStack());
    this.items.put(Integer.valueOf(paramInt), paramMenuItem);
    paramMenuItem.addToMenu(this);
    return true;
  }

  public boolean removeMenuItem(int paramInt1, int paramInt2)
  {
    return removeMenuItem(paramInt2 * 9 + paramInt1);
  }

  public boolean removeMenuItem(int paramInt)
  {
    ItemStack localItemStack;
    if (((localItemStack = getInventory().getItem(paramInt)) == null) || (localItemStack.getTypeId() == 0))
      return false;
    getInventory().clear(paramInt);
    ((MenuItem)this.items.remove(Integer.valueOf(paramInt))).removeFromMenu(this);
    return true;
  }

  protected void selectMenuItem(Player paramPlayer, int paramInt)
  {
    if (this.items.containsKey(Integer.valueOf(paramInt)))
      (paramInt = (MenuItem)this.items.get(Integer.valueOf(paramInt))).onClick(paramPlayer);
  }

  public void openMenu(Player paramPlayer)
  {
    if (getInventory().getViewers().contains(paramPlayer))
      throw new IllegalArgumentException(paramPlayer.getName() + " is already viewing " + getInventory().getTitle());
    paramPlayer.openInventory(getInventory());
  }

  public void closeMenu(Player paramPlayer)
  {
    if (getInventory().getViewers().contains(paramPlayer))
    {
      getInventory().getViewers().remove(paramPlayer);
      paramPlayer.closeInventory();
    }
  }

  public void switchMenu(Player paramPlayer, PopupMenu paramPopupMenu)
  {
    PopupMenuAPI.switchMenu(paramPlayer, this, paramPopupMenu);
  }

  public Inventory getInventory()
  {
    if (this.inventory == null)
      this.inventory = Bukkit.createInventory(this, this.rows * 9, this.title);
    return this.inventory;
  }

  public boolean exitOnClickOutside()
  {
    return this.exitOnClickOutside;
  }

  protected PopupMenu clone()
  {
    PopupMenu localPopupMenu;
    (localPopupMenu = new PopupMenu(this.title, this.rows)).setExitOnClickOutside(this.exitOnClickOutside);
    localPopupMenu.setMenuCloseBehaviour(this.menuCloseBehaviour);
    Iterator localIterator = this.items.keySet().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      addMenuItem((MenuItem)this.items.get(Integer.valueOf(i)), i);
    }
    return localPopupMenu;
  }

  public void updateMenu()
  {
    Iterator localIterator = getInventory().getViewers().iterator();
    while (localIterator.hasNext())
    {
      Object localObject;
      if (((localObject = (HumanEntity)localIterator.next()) instanceof Player))
        (localObject = (Player)localObject).updateInventory();
    }
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     me.xhawk87.PopupMenuAPI.PopupMenu
 * JD-Core Version:    0.6.2
 */