package com.quequiere.ridemycraft.a.a.a.a;

import com.quequiere.ridemycraft.car.CarSeat;
import java.util.ArrayList;
import me.xhawk87.PopupMenuAPI.MenuItem;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import org.bukkit.entity.Player;
import org.bukkit.material.MaterialData;

final class q extends MenuItem
{
  q(p paramp, String paramString, MaterialData paramMaterialData, com.quequiere.ridemycraft.car.a parama, PopupMenu paramPopupMenu)
  {
    super(paramString, paramMaterialData);
  }

  public final void onClick(Player paramPlayer)
  {
    CarSeat localCarSeat = new CarSeat(60, 90);
    this.a.u().add(localCarSeat);
    try
    {
      this.a.a(true);
    }
    catch (com.quequiere.ridemycraft.b.a locala2)
    {
      com.quequiere.ridemycraft.b.a locala1;
      (locala1 = locala2).printStackTrace();
    }
    this.b.closeMenu(paramPlayer);
    new n().a(this.a, paramPlayer, localCarSeat);
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.a.q
 * JD-Core Version:    0.6.2
 */