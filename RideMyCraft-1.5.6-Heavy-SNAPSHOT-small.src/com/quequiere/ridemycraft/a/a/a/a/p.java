package com.quequiere.ridemycraft.a.a.a.a;

import com.quequiere.ridemycraft.car.CarSeat;
import com.quequiere.ridemycraft.car.a;
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

public final class p extends k
{
  public final void a(a parama, Player paramPlayer)
  {
    (localObject1 = new Wool(Material.WOOL)).setColor(DyeColor.LIME);
    Object localObject1 = new MaterialData(((Wool)localObject1).toItemStack().getType(), ((Wool)localObject1).getData());
    PopupMenu localPopupMenu = PopupMenuAPI.createMenu("Seat Modify Menu", (int)Math.ceil((parama.u().size() + 1) / 9.0D));
    q localq;
    (localq = new q(this, "Create new seat", (MaterialData)localObject1, parama, localPopupMenu)).setDescriptions(StringUtil.wrapWords("Add a new seat here !", 40));
    localPopupMenu.addMenuItem(localq, 0);
    int i = 1;
    Iterator localIterator = parama.u().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (CarSeat)localIterator.next();
      localObject2 = new r(this, "Modify: " + ((CarSeat)localObject2).getName(parama), (MaterialData)localObject1, localPopupMenu, parama, (CarSeat)localObject2);
      localPopupMenu.addMenuItem((MenuItem)localObject2, i);
      i++;
    }
    localPopupMenu.openMenu(paramPlayer);
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.a.p
 * JD-Core Version:    0.6.2
 */