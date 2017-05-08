package com.quequiere.ridemycraft.a.a.a.a;

import com.quequiere.ridemycraft.car.CarSeat;
import java.util.ArrayList;
import java.util.Iterator;
import me.xhawk87.PopupMenuAPI.MenuItem;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import me.xhawk87.PopupMenuAPI.PopupMenuAPI;
import me.xhawk87.PopupMenuAPI.StringUtil;
import org.bukkit.entity.Player;

public final class s extends k
{
  public final void a(com.quequiere.ridemycraft.car.a parama, Player paramPlayer, CarSeat paramCarSeat)
  {
    Object localObject = new ArrayList();
    for (float f = 0.0F; f <= 360.0F; f += 5.0F)
      ((ArrayList)localObject).add(new com.quequiere.ridemycraft.a(Math.round(f * 100.0F) / 100.0F));
    PopupMenu localPopupMenu = PopupMenuAPI.createMenu("Angle Seat Modify menu", (int)Math.ceil(((ArrayList)localObject).size() / 9.0D));
    int i = 0;
    Iterator localIterator = ((ArrayList)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (com.quequiere.ridemycraft.a)localIterator.next();
      t localt;
      (localt = new t(this, ((com.quequiere.ridemycraft.a)localObject).c, com.quequiere.ridemycraft.a.a(), localPopupMenu, paramCarSeat, (com.quequiere.ridemycraft.a)localObject, parama)).setDescriptions(StringUtil.wrapWords("Set angle seat to " + ((com.quequiere.ridemycraft.a)localObject).c, 40));
      localPopupMenu.addMenuItem(localt, i);
      i++;
    }
    localPopupMenu.openMenu(paramPlayer);
  }

  public final void a(com.quequiere.ridemycraft.car.a parama, Player paramPlayer)
  {
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.a.s
 * JD-Core Version:    0.6.2
 */