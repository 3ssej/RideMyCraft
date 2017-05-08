package com.quequiere.ridemycraft;

import java.util.ArrayList;
import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.v1_8_R2.inventory.CraftInventoryCrafting;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Wool;

public class a
{
  public static ItemStack a;
  public static ItemStack b;
  public float c = 0.0F;

  public a(float paramFloat)
  {
    this.c = paramFloat;
  }

  public static MaterialData a()
  {
    Object localObject;
    (localObject = new Wool(Material.WOOL)).setColor(DyeColor.LIME);
    return localObject = new MaterialData(((Wool)localObject).toItemStack().getType(), ((Wool)localObject).getData());
  }

  public static void a(InventoryCloseEvent paramInventoryCloseEvent, com.quequiere.ridemycraft.car.a parama, Player paramPlayer)
  {
    if (((paramInventoryCloseEvent = (CraftInventoryCrafting)paramInventoryCloseEvent.getView().getTopInventory()).getResult() == null) || (paramInventoryCloseEvent.getResult().equals(a)))
    {
      ArrayList localArrayList = new ArrayList();
      ShapedRecipe localShapedRecipe = new ShapedRecipe(parama.g());
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
        if (parama.t() == null)
        {
          paramPlayer.sendMessage("You need to make a recipe !");
          return;
        }
        parama.a(null);
        try
        {
          parama.a(true);
        }
        catch (com.quequiere.ridemycraft.b.a locala1)
        {
        }
        paramPlayer.sendMessage("Recipe has been removed!");
        paramPlayer.sendMessage("You need to restart your server to apply this!");
        return;
      }
      localShapedRecipe.shape(new String[] { (String)com.quequiere.ridemycraft.d.a.a(localArrayList).get(0), (String)com.quequiere.ridemycraft.d.a.a(localArrayList).get(1), (String)com.quequiere.ridemycraft.d.a.a(localArrayList).get(2) });
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
        if ((paramInventoryCloseEvent = (com.quequiere.ridemycraft.d.a)localIterator.next()).a != null)
          localShapedRecipe.setIngredient(paramInventoryCloseEvent.b, paramInventoryCloseEvent.a.getData());
      if (parama.t() != null)
        paramPlayer.sendMessage("Old recipe removed, you need to restart server to complete this!");
      Bukkit.getServer().addRecipe(localShapedRecipe);
      parama.a(localShapedRecipe);
      try
      {
        parama.a(true);
      }
      catch (com.quequiere.ridemycraft.b.a locala2)
      {
      }
      paramPlayer.sendMessage("Recipe added !");
      return;
    }
    if (paramInventoryCloseEvent.getResult().equals(b))
      paramPlayer.sendMessage("This craft already exist !");
  }

  public static BlockFace a(BlockFace paramBlockFace)
  {
    if (paramBlockFace.equals(BlockFace.NORTH))
      return BlockFace.EAST;
    if (paramBlockFace.equals(BlockFace.WEST))
      return BlockFace.NORTH;
    if (paramBlockFace.equals(BlockFace.SOUTH))
      return BlockFace.WEST;
    if (paramBlockFace.equals(BlockFace.EAST))
      return BlockFace.SOUTH;
    return null;
  }

  public static BlockFace b(BlockFace paramBlockFace)
  {
    if (paramBlockFace.equals(BlockFace.NORTH))
      return BlockFace.WEST;
    if (paramBlockFace.equals(BlockFace.WEST))
      return BlockFace.SOUTH;
    if (paramBlockFace.equals(BlockFace.SOUTH))
      return BlockFace.EAST;
    if (paramBlockFace.equals(BlockFace.EAST))
      return BlockFace.NORTH;
    return null;
  }

  public static ArrayList<BlockFace> b()
  {
    ArrayList localArrayList;
    (localArrayList = new ArrayList()).add(BlockFace.NORTH);
    localArrayList.add(BlockFace.WEST);
    localArrayList.add(BlockFace.SOUTH);
    localArrayList.add(BlockFace.EAST);
    return localArrayList;
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a
 * JD-Core Version:    0.6.2
 */