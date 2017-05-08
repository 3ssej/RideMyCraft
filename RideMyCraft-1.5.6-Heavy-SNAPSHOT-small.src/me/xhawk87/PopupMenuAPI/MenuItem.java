package me.xhawk87.PopupMenuAPI;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

public abstract class MenuItem
{
  private PopupMenu menu;
  private int number;
  private MaterialData icon;
  private String text;
  private List<String> descriptions = new ArrayList();

  public MenuItem(String paramString)
  {
    this(paramString, new MaterialData(Material.PAPER));
  }

  public MenuItem(String paramString, MaterialData paramMaterialData)
  {
    this(paramString, paramMaterialData, 1);
  }

  public MenuItem(String paramString, MaterialData paramMaterialData, int paramInt)
  {
    this.text = paramString;
    this.icon = paramMaterialData;
    this.number = paramInt;
  }

  protected void addToMenu(PopupMenu paramPopupMenu)
  {
    this.menu = paramPopupMenu;
  }

  protected void removeFromMenu(PopupMenu paramPopupMenu)
  {
    if (this.menu == paramPopupMenu)
      this.menu = null;
  }

  public PopupMenu getMenu()
  {
    return this.menu;
  }

  public int getNumber()
  {
    return this.number;
  }

  public MaterialData getIcon()
  {
    return this.icon;
  }

  public String getText()
  {
    return this.text;
  }

  public void setDescriptions(List<String> paramList)
  {
    this.descriptions = paramList;
  }

  public void addDescription(String paramString)
  {
    this.descriptions.add(paramString);
  }

  protected ItemStack getItemStack()
  {
    ItemStack localItemStack;
    ItemMeta localItemMeta;
    (localItemMeta = (localItemStack = new ItemStack(getIcon().getItemType(), getNumber(), getIcon().getData())).getItemMeta()).setLore(this.descriptions);
    localItemMeta.setDisplayName(getText());
    localItemStack.setItemMeta(localItemMeta);
    return localItemStack;
  }

  public abstract void onClick(Player paramPlayer);
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     me.xhawk87.PopupMenuAPI.MenuItem
 * JD-Core Version:    0.6.2
 */