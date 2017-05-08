package com.quequiere.ridemycraft.a.a.a.a;

import java.util.ArrayList;
import java.util.Iterator;
import me.xhawk87.PopupMenuAPI.MenuItem;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import me.xhawk87.PopupMenuAPI.PopupMenuAPI;
import me.xhawk87.PopupMenuAPI.StringUtil;
import org.bukkit.entity.Player;

public final class z extends k
{
  public final void a(com.quequiere.ridemycraft.car.a parama, Player paramPlayer)
  {
    Object localObject = new ArrayList();
    for (float f = -3.0F; f <= 3.0F; f += 0.1F)
    {
      f = (f = Math.round(f *= 10.0F)) / 10.0F;
      ((ArrayList)localObject).add(new com.quequiere.ridemycraft.a(f));
    }
    PopupMenu localPopupMenu = PopupMenuAPI.createMenu("Heigh from ground Modify menu", (int)Math.ceil(((ArrayList)localObject).size() / 9.0D));
    int i = 0;
    Iterator localIterator = ((ArrayList)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (com.quequiere.ridemycraft.a)localIterator.next();
      A localA;
      (localA = new A(this, ((com.quequiere.ridemycraft.a)localObject).c, com.quequiere.ridemycraft.a.a(), localPopupMenu, (com.quequiere.ridemycraft.a)localObject, parama)).setDescriptions(StringUtil.wrapWords("Set heigh from ground to " + ((com.quequiere.ridemycraft.a)localObject).c, 40));
      localPopupMenu.addMenuItem(localA, i);
      i++;
    }
    localPopupMenu.openMenu(paramPlayer);
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.a.z
 * JD-Core Version:    0.6.2
 */