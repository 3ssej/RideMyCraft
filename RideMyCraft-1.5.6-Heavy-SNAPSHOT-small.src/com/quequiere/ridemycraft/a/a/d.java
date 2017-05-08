package com.quequiere.ridemycraft.a.a;

import com.quequiere.ridemycraft.b.b;
import org.bukkit.Material;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

public final class d extends com.quequiere.ridemycraft.a.a
{
  public final void a(Player paramPlayer, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length != 2)
    {
      com.quequiere.ridemycraft.b.a.a.m.a(paramPlayer);
      return;
    }
    if ((paramPlayer.getItemInHand() == null) || (paramPlayer.getItemInHand().getType().equals(Material.AIR)))
    {
      com.quequiere.ridemycraft.b.a.a.J.a(paramPlayer);
      return;
    }
    if (paramArrayOfString.length >= 2)
    {
      if (b.a(paramArrayOfString = paramArrayOfString[1]))
      {
        com.quequiere.ridemycraft.b.a.a.L.a(paramPlayer);
        return;
      }
      Material localMaterial = paramPlayer.getItemInHand().getType();
      MaterialData localMaterialData = paramPlayer.getItemInHand().getData();
      paramArrayOfString = new com.quequiere.ridemycraft.car.a(paramArrayOfString, localMaterial);
      if (localMaterialData != null)
        paramArrayOfString.a(localMaterialData);
      try
      {
        paramArrayOfString.a(false);
        paramArrayOfString.b();
        com.quequiere.ridemycraft.b.a.a.K.a(paramPlayer);
        return;
      }
      catch (com.quequiere.ridemycraft.b.a locala)
      {
        (paramArrayOfString = locala).printStackTrace();
        com.quequiere.ridemycraft.b.a.a.I.a(paramPlayer);
        return;
      }
    }
    com.quequiere.ridemycraft.b.a.a.G.a(paramPlayer);
  }

  public final void a(ConsoleCommandSender paramConsoleCommandSender, String[] paramArrayOfString)
  {
    com.quequiere.ridemycraft.b.a.a.i.b();
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.d
 * JD-Core Version:    0.6.2
 */