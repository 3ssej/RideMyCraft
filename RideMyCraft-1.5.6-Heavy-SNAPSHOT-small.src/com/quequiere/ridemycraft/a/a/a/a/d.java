package com.quequiere.ridemycraft.a.a.a.a;

import com.quequiere.ridemycraft.car.CarSeat;
import me.xhawk87.PopupMenuAPI.MenuItem;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.entity.Player;
import org.bukkit.material.MaterialData;

final class d extends MenuItem
{
  d(b paramb, String paramString, MaterialData paramMaterialData, PopupMenu paramPopupMenu, com.quequiere.ridemycraft.c.b.b paramb1, CarSeat paramCarSeat)
  {
    super(paramString, paramMaterialData);
  }

  public final void onClick(Player paramPlayer)
  {
    this.a.closeMenu(paramPlayer);
    if (this.b.a(this.c))
    {
      paramPlayer.sendMessage("Climb...");
      Player localPlayer = paramPlayer;
      Object localObject = this.c;
      localObject = com.quequiere.ridemycraft.c.b.a.a((paramPlayer = this.b).world, paramPlayer, (CarSeat)localObject);
      if (localPlayer != null)
        ((com.quequiere.ridemycraft.c.b.a)localObject).getBukkitEntity().setPassenger(localPlayer);
      paramPlayer.a((com.quequiere.ridemycraft.c.b.a)localObject);
      return;
    }
    com.quequiere.ridemycraft.b.a.a.a.a(paramPlayer);
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.a.d
 * JD-Core Version:    0.6.2
 */