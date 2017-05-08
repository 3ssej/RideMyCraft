package com.quequiere.ridemycraft.a.a.a.a;

import com.quequiere.ridemycraft.car.CarSeat;
import com.quequiere.ridemycraft.car.a;
import me.xhawk87.PopupMenuAPI.MenuItem;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import org.bukkit.entity.Player;
import org.bukkit.material.MaterialData;

final class r extends MenuItem
{
  r(p paramp, String paramString, MaterialData paramMaterialData, PopupMenu paramPopupMenu, a parama, CarSeat paramCarSeat)
  {
    super(paramString, paramMaterialData);
  }

  public final void onClick(Player paramPlayer)
  {
    this.a.closeMenu(paramPlayer);
    new n().a(this.b, paramPlayer, this.c);
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.a.r
 * JD-Core Version:    0.6.2
 */