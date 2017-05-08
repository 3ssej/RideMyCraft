package com.quequiere.ridemycraft.a.a.a.a;

import com.quequiere.ridemycraft.car.CarSeat;
import me.xhawk87.PopupMenuAPI.MenuItem;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import org.bukkit.entity.Player;
import org.bukkit.material.MaterialData;

final class t extends MenuItem
{
  t(s params, String paramString, MaterialData paramMaterialData, PopupMenu paramPopupMenu, CarSeat paramCarSeat, com.quequiere.ridemycraft.a parama, com.quequiere.ridemycraft.car.a parama1)
  {
    super(paramString, paramMaterialData);
  }

  public final void onClick(Player paramPlayer)
  {
    this.a.closeMenu(paramPlayer);
    this.b.setAngle((int)this.c.c);
    try
    {
      this.d.a(true);
    }
    catch (com.quequiere.ridemycraft.b.a locala2)
    {
      com.quequiere.ridemycraft.b.a locala1;
      (locala1 = locala2).printStackTrace();
    }
    new n().a(this.d, paramPlayer, this.b);
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.a.t
 * JD-Core Version:    0.6.2
 */