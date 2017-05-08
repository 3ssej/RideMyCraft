package com.quequiere.ridemycraft.a.a.a.a;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

public final class x extends k
{
  public final void a(com.quequiere.ridemycraft.car.a parama, Player paramPlayer)
  {
    Object localObject;
    if (((localObject = paramPlayer.getItemInHand()) == null) || (((ItemStack)localObject).getType().equals(Material.AIR)))
    {
      com.quequiere.ridemycraft.b.a.a.J.a(paramPlayer);
      return;
    }
    if ((localObject = ((ItemStack)localObject).getData()) != null)
      parama.b((MaterialData)localObject);
    try
    {
      parama.a(true);
    }
    catch (com.quequiere.ridemycraft.b.a locala)
    {
      (parama = locala).printStackTrace();
    }
    com.quequiere.ridemycraft.b.a.a.C.a(paramPlayer);
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.a.x
 * JD-Core Version:    0.6.2
 */