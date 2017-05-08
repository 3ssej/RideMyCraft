package com.quequiere.ridemycraft.a.a.a.a.a;

import com.quequiere.ridemycraft.a.a.a.a.k;
import java.util.HashMap;
import org.bukkit.craftbukkit.v1_8_R2.inventory.CraftInventoryCrafting;
import org.bukkit.craftbukkit.v1_8_R2.inventory.CraftInventoryView;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public final class a extends k
{
  public static HashMap<CraftInventoryCrafting, com.quequiere.ridemycraft.car.a> a = new HashMap();

  public final void a(com.quequiere.ridemycraft.car.a parama, Player paramPlayer)
  {
    paramPlayer = (CraftInventoryView)paramPlayer.openWorkbench(null, true);
    a.put((CraftInventoryCrafting)paramPlayer.getTopInventory(), parama);
    paramPlayer.getTopInventory().setItem(0, com.quequiere.ridemycraft.a.a);
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.a.a.a
 * JD-Core Version:    0.6.2
 */