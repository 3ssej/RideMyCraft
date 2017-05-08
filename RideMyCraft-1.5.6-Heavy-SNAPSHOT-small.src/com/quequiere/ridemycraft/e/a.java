package com.quequiere.ridemycraft.e;

import com.google.gson.Gson;
import com.quequiere.ridemycraft.Ridemycraft;
import com.quequiere.ridemycraft.b.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class a
{
  private static HashMap<Player, a> b = new HashMap();
  public static String a = com.quequiere.ridemycraft.b.a.a.o.c();
  private ArrayList<String> cars = new ArrayList();
  private transient Player c;

  private a(Player paramPlayer)
  {
    this.c = paramPlayer;
  }

  private ArrayList<String> b()
  {
    if (this.cars == null)
      this.cars = new ArrayList();
    return this.cars;
  }

  public final void a(com.quequiere.ridemycraft.car.a parama)
  {
    if (b().contains(parama.a()))
    {
      com.quequiere.ridemycraft.b.a.a.y.a(this.c);
      return;
    }
    this.cars.add(parama.a());
    com.quequiere.ridemycraft.b.a.a.j.a(this.c);
    c();
  }

  public final void b(com.quequiere.ridemycraft.car.a parama)
  {
    if ((parama.i()) || (this.c.isOp()))
    {
      if (b().contains(parama.a()))
      {
        com.quequiere.ridemycraft.b.a.a.y.a(this.c);
        return;
      }
      double d = parama.h();
      a locala1 = this;
      a locala2 = this;
      Ridemycraft.economy.withdrawPlayer(locala1.c, d);
      if ((Ridemycraft.economy.getBalance(locala2.c) >= d ? 1 : 0) == 0)
      {
        if (!this.c.isOp());
      }
      else
      {
        this.cars.add(parama.a());
        com.quequiere.ridemycraft.b.a.a.x.a(this.c);
        c();
        return;
      }
      com.quequiere.ridemycraft.b.a.a.w.a(this.c, parama.h() + " " + Ridemycraft.economy.currencyNamePlural());
      return;
    }
    com.quequiere.ridemycraft.b.a.a.v.a(this.c);
  }

  public final boolean c(com.quequiere.ridemycraft.car.a parama)
  {
    return b().contains(parama.a());
  }

  public final void a()
  {
    int i = (int)Math.ceil(b().size() / 9.0D);
    Inventory localInventory = Bukkit.createInventory(null, i * 9, a);
    Iterator localIterator = this.cars.iterator();
    while (localIterator.hasNext())
    {
      Object localObject;
      if ((localObject = com.quequiere.ridemycraft.car.a.a(localObject = (String)localIterator.next())) != null)
      {
        ItemStack localItemStack;
        ItemMeta localItemMeta;
        (localItemMeta = (localItemStack = ((com.quequiere.ridemycraft.car.a)localObject).g()).getItemMeta()).setDisplayName(((com.quequiere.ridemycraft.car.a)localObject).a());
        ArrayList localArrayList;
        (localArrayList = new ArrayList()).add(com.quequiere.ridemycraft.b.a.a.n.c());
        if (this.c.isOp())
        {
          localArrayList.add(com.quequiere.ridemycraft.b.a.a.q.c() + ((com.quequiere.ridemycraft.car.a)localObject).i());
          localArrayList.add(com.quequiere.ridemycraft.b.a.a.u.c() + ((com.quequiere.ridemycraft.car.a)localObject).h());
        }
        localItemMeta.setLore(localArrayList);
        localItemStack.setItemMeta(localItemMeta);
        localInventory.addItem(new ItemStack[] { localItemStack });
      }
    }
    this.c.openInventory(localInventory);
  }

  private void c()
  {
    try
    {
      a locala = this;
      Gson localGson;
      (localObject = new FileWriter(b.b + "/" + this.c.getName() + ".json")).write((localGson = new Gson()).toJson(locala));
      ((FileWriter)localObject).close();
      return;
    }
    catch (IOException localIOException)
    {
      Object localObject;
      (localObject = localIOException).printStackTrace();
    }
  }

  public static a a(Player paramPlayer)
  {
    Object localObject;
    if ((localObject = (a)b.get(paramPlayer)) == null)
    {
      try
      {
        localObject = paramPlayer;
        Gson localGson = new Gson();
        localObject = new BufferedReader(new FileReader(((File)localObject).getAbsolutePath()));
        if ((localObject = (localObject = new File(b.b + "/" + ((Player)localObject).getName() + ".json")).exists() ? (localObject = (a)localGson.fromJson((Reader)localObject, a.class)) : null) == null)
          (localObject = new a(paramPlayer)).c();
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        (localObject = new a(paramPlayer)).c();
      }
      b.put(paramPlayer, localObject);
    }
    ((a)localObject).c = paramPlayer;
    return localObject;
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.e.a
 * JD-Core Version:    0.6.2
 */