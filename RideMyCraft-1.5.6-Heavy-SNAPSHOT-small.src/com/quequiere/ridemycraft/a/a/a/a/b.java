package com.quequiere.ridemycraft.a.a.a.a;

import com.quequiere.ridemycraft.car.CarSeat;
import java.util.ArrayList;
import java.util.Iterator;
import me.xhawk87.PopupMenuAPI.MenuItem;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import me.xhawk87.PopupMenuAPI.PopupMenuAPI;
import me.xhawk87.PopupMenuAPI.StringUtil;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Wool;

public final class b extends h
{
  public final void a(com.quequiere.ridemycraft.c.b.b paramb, Player paramPlayer)
  {
    (localObject1 = new Wool(Material.WOOL)).setColor(DyeColor.LIME);
    MaterialData localMaterialData = new MaterialData(((Wool)localObject1).toItemStack().getType(), ((Wool)localObject1).getData());
    (localObject1 = new Wool(Material.WOOL)).setColor(DyeColor.RED);
    Object localObject1 = new MaterialData(((Wool)localObject1).toItemStack().getType(), ((Wool)localObject1).getData());
    PopupMenu localPopupMenu = PopupMenuAPI.createMenu("Climb menu", (int)Math.ceil((paramb.e().u().size() + 1) / 9.0D));
    c localc;
    (localc = new c(this, com.quequiere.ridemycraft.b.a.a.W.c(), localMaterialData, localPopupMenu, paramb)).setDescriptions(StringUtil.wrapWords(com.quequiere.ridemycraft.b.a.a.V.c(), 40));
    localPopupMenu.addMenuItem(localc, 0);
    int i = 1;
    Iterator localIterator = paramb.e().u().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (CarSeat)localIterator.next();
      boolean bool;
      Object localObject3;
      if ((bool = paramb.a((CarSeat)localObject2)))
        localObject3 = localMaterialData;
      else
        localObject3 = localObject1;
      localObject2 = new d(this, ((CarSeat)localObject2).getName(paramb.e()), (MaterialData)localObject3, localPopupMenu, paramb, (CarSeat)localObject2);
      if (bool)
        ((MenuItem)localObject2).setDescriptions(StringUtil.wrapWords("You can climb on this to climb as passenger", 40));
      else
        ((MenuItem)localObject2).setDescriptions(StringUtil.wrapWords("Someone is on this seat !", 40));
      localPopupMenu.addMenuItem((MenuItem)localObject2, i);
      i++;
    }
    localPopupMenu.openMenu(paramPlayer);
  }

  public final void a(com.quequiere.ridemycraft.c.a.b paramb, Player paramPlayer)
  {
    (localObject1 = new Wool(Material.WOOL)).setColor(DyeColor.LIME);
    MaterialData localMaterialData = new MaterialData(((Wool)localObject1).toItemStack().getType(), ((Wool)localObject1).getData());
    (localObject1 = new Wool(Material.WOOL)).setColor(DyeColor.RED);
    Object localObject1 = new MaterialData(((Wool)localObject1).toItemStack().getType(), ((Wool)localObject1).getData());
    PopupMenu localPopupMenu = PopupMenuAPI.createMenu("Climb menu", (int)Math.ceil((paramb.e().u().size() + 1) / 9.0D));
    e locale;
    (locale = new e(this, "Owner seat", localMaterialData, localPopupMenu, paramb)).setDescriptions(StringUtil.wrapWords("Only for owner !", 40));
    localPopupMenu.addMenuItem(locale, 0);
    int i = 1;
    Iterator localIterator = paramb.e().u().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (CarSeat)localIterator.next();
      boolean bool;
      Object localObject3;
      if ((bool = paramb.a((CarSeat)localObject2)))
        localObject3 = localMaterialData;
      else
        localObject3 = localObject1;
      localObject2 = new f(this, ((CarSeat)localObject2).getName(paramb.e()), (MaterialData)localObject3, localPopupMenu, paramb, (CarSeat)localObject2);
      if (bool)
        ((MenuItem)localObject2).setDescriptions(StringUtil.wrapWords("You can climb on this to climb as passenger", 40));
      else
        ((MenuItem)localObject2).setDescriptions(StringUtil.wrapWords("Someone is on this seat !", 40));
      localPopupMenu.addMenuItem((MenuItem)localObject2, i);
      i++;
    }
    localPopupMenu.openMenu(paramPlayer);
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.a.b
 * JD-Core Version:    0.6.2
 */