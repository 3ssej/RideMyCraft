package com.quequiere.ridemycraft.a.a.a.a;

import com.quequiere.ridemycraft.a.a.a.g;
import com.quequiere.ridemycraft.car.CarSeat;
import com.quequiere.ridemycraft.car.a;
import me.xhawk87.PopupMenuAPI.MenuItem;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import me.xhawk87.PopupMenuAPI.PopupMenuAPI;
import me.xhawk87.PopupMenuAPI.StringUtil;
import org.bukkit.entity.Player;

public final class n extends k
{
  public final void a(a parama, Player paramPlayer, CarSeat paramCarSeat)
  {
    g[] arrayOfg = g.b();
    PopupMenu localPopupMenu = PopupMenuAPI.createMenu("Car Seat Menu", (int)Math.ceil(arrayOfg.length / 9.0D));
    for (int i = 0; i < arrayOfg.length; i++)
    {
      g localg = arrayOfg[i];
      o localo;
      (localo = new o(this, localg.toString(), g.a(), localPopupMenu, localg, parama, paramPlayer, paramCarSeat)).setDescriptions(StringUtil.wrapWords(localg.a(paramCarSeat), 40));
      localPopupMenu.addMenuItem(localo, i);
    }
    localPopupMenu.openMenu(paramPlayer);
  }

  public final void a(a parama, Player paramPlayer)
  {
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.a.n
 * JD-Core Version:    0.6.2
 */