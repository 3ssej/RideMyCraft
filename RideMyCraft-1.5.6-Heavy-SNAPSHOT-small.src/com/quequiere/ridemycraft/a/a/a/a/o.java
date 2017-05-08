package com.quequiere.ridemycraft.a.a.a.a;

import com.quequiere.ridemycraft.a.a.a.g;
import com.quequiere.ridemycraft.car.CarSeat;
import com.quequiere.ridemycraft.car.a;
import me.xhawk87.PopupMenuAPI.MenuItem;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import org.bukkit.entity.Player;
import org.bukkit.material.MaterialData;

final class o extends MenuItem
{
  o(n paramn, String paramString, MaterialData paramMaterialData, PopupMenu paramPopupMenu, g paramg, a parama, Player paramPlayer, CarSeat paramCarSeat)
  {
    super(paramString, paramMaterialData);
  }

  public final void onClick(Player paramPlayer)
  {
    this.a.closeMenu(paramPlayer);
    this.b.a(this.c, this.d, this.e);
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.a.o
 * JD-Core Version:    0.6.2
 */