package com.quequiere.ridemycraft.a.a;

import java.util.ArrayList;
import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class a extends com.quequiere.ridemycraft.a.a
{
  public static String a = com.quequiere.ridemycraft.b.a.a.p.c();

  public final void a(Player paramPlayer, String[] paramArrayOfString)
  {
    paramArrayOfString = 0;
    Object localObject = com.quequiere.ridemycraft.car.a.a.iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.quequiere.ridemycraft.car.a locala = (com.quequiere.ridemycraft.car.a)((Iterator)localObject).next();
      if (!com.quequiere.ridemycraft.e.a.a(paramPlayer).c(locala))
        paramArrayOfString++;
    }
    int i = (int)Math.ceil(paramArrayOfString / 9.0D);
    localObject = Bukkit.createInventory(null, i * 9, a);
    Iterator localIterator = com.quequiere.ridemycraft.car.a.a.iterator();
    while (localIterator.hasNext())
    {
      paramArrayOfString = (com.quequiere.ridemycraft.car.a)localIterator.next();
      if (!com.quequiere.ridemycraft.e.a.a(paramPlayer).c(paramArrayOfString))
      {
        ItemStack localItemStack;
        ItemMeta localItemMeta;
        (localItemMeta = (localItemStack = paramArrayOfString.g()).getItemMeta()).setDisplayName(paramArrayOfString.a());
        ArrayList localArrayList;
        (localArrayList = new ArrayList()).add(com.quequiere.ridemycraft.b.a.a.r.c());
        localArrayList.add(com.quequiere.ridemycraft.b.a.a.u.c() + paramArrayOfString.h());
        localArrayList.add(com.quequiere.ridemycraft.b.a.a.t.c() + paramArrayOfString.d());
        localArrayList.add(com.quequiere.ridemycraft.b.a.a.s.c() + paramArrayOfString.e());
        if (paramPlayer.isOp())
          localArrayList.add(com.quequiere.ridemycraft.b.a.a.q.c() + paramArrayOfString.i());
        localItemMeta.setLore(localArrayList);
        localItemStack.setItemMeta(localItemMeta);
        ((Inventory)localObject).addItem(new ItemStack[] { localItemStack });
      }
    }
    paramPlayer.openInventory((Inventory)localObject);
  }

  public final void a(ConsoleCommandSender paramConsoleCommandSender, String[] paramArrayOfString)
  {
    com.quequiere.ridemycraft.b.a.a.i.b();
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a
 * JD-Core Version:    0.6.2
 */