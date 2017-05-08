package com.quequiere.ridemycraft.car;

import com.google.gson.Gson;
import com.quequiere.ridemycraft.Ridemycraft;
import com.quequiere.ridemycraft.b.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.material.MaterialData;

public class a
{
  public static ArrayList<a> a = new ArrayList();
  private String name = "";
  private float speed = 0.3F;
  private float speedBack = 0.1F;
  private float maniability = 15.0F;
  private float jsize = 1.0F;
  private Material material = null;
  private boolean Gasoline = false;
  private boolean AutoDepop = true;
  private boolean Inventory = false;
  private boolean useparticle = false;
  private int price = 0;
  private boolean buyable = false;
  private MaterialData data = null;
  private boolean fly = false;
  private int flyMaxHeight = 3;
  private boolean canFlyOnWater = false;
  private double heighModify = 0.0D;
  private ShapedRecipe recipe = null;
  private MaterialData fuelTypeData;
  private ArrayList<CarSeat> seatConf = new ArrayList();
  private int secondBeforeTwoFuelCheck = 1;

  public a(String paramString, Material paramMaterial)
  {
    this.material = paramMaterial;
    this.name = paramString;
  }

  private MaterialData getMatData()
  {
    return this.data;
  }

  public final void a(MaterialData paramMaterialData)
  {
    this.data = paramMaterialData;
  }

  public final String a()
  {
    return this.name;
  }

  private String toJson()
  {
    Gson localGson;
    return (localGson = new Gson()).toJson(this);
  }

  public final void a(boolean paramBoolean)
    throws com.quequiere.ridemycraft.b.a
  {
    if (!paramBoolean)
    {
      paramBoolean = this;
      if (b.a(this.name));
    }
    else
    {
      try
      {
        paramBoolean = this;
        a locala = this;
        Gson localGson;
        (paramBoolean = new FileWriter(b.a + "/" + this.name + ".json")).write((localGson = new Gson()).toJson(locala));
        paramBoolean.close();
        return;
      }
      catch (IOException localIOException)
      {
        (paramBoolean = localIOException).printStackTrace();
        return;
      }
    }
    throw new com.quequiere.ridemycraft.b.a(this);
  }

  public final boolean b()
  {
    a.size();
    a.add(this);
    a locala = this;
    System.out.println("\033[36m[" + Ridemycraft.getPlugin().getName() + "] " + this.name + " car loaded !\033[0m");
    return true;
  }

  public static void c()
  {
    System.out.println("\033[33m[" + Ridemycraft.getPlugin().getName() + "] Reloading cars \033[0m");
    a.clear();
    Object localObject1;
    File[] arrayOfFile;
    int j = (arrayOfFile = (localObject1 = new File(b.a + "/")).listFiles()).length;
    for (int i = 0; i < j; i++)
      if ((!(localObject1 = arrayOfFile[i]).isDirectory()) && (((File)localObject1).getName().contains(".json")))
        try
        {
          localObject3 = localObject1;
          Gson localGson = new Gson();
          localObject3 = new BufferedReader(new FileReader(((File)localObject3).getAbsolutePath()));
          if ((localObject3 = localObject3 = (a)localGson.fromJson((Reader)localObject3, a.class)) == null)
            com.quequiere.ridemycraft.b.a.a.M.a(((File)localObject1).getAbsolutePath());
          else
            ((a)localObject3).b();
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          Object localObject3;
          (localObject3 = localFileNotFoundException).printStackTrace();
        }
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      Object localObject2;
      if ((localObject2 = localObject1 = (a)localIterator.next()).recipe != null)
      {
        localObject2 = localObject1;
        Bukkit.getServer().addRecipe(localObject1.recipe);
        localObject2 = localObject1;
        System.out.println("\033[32mRecipe added for : " + localObject1.name + "\033[0m");
      }
    }
    System.out.println("\033[33m[" + Ridemycraft.getPlugin().getName() + "] Cars reloaded !\033[0m");
  }

  private static a fileToJson(File paramFile)
    throws FileNotFoundException
  {
    Gson localGson = new Gson();
    paramFile = new BufferedReader(new FileReader(paramFile.getAbsolutePath()));
    return paramFile = (a)localGson.fromJson(paramFile, a.class);
  }

  public static a a(String paramString)
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      a locala1;
      a locala2;
      if ((locala2 = locala1 = (a)localIterator.next()).name.equals(paramString))
        return locala1;
    }
    return null;
  }

  public final float d()
  {
    return this.speed;
  }

  public final void a(float paramFloat)
  {
    this.speed = paramFloat;
  }

  public final float e()
  {
    return this.maniability;
  }

  public final void b(float paramFloat)
  {
    if (paramFloat > 100.0F)
      paramFloat = 100.0F;
    this.maniability = paramFloat;
  }

  public final float f()
  {
    return this.jsize;
  }

  public final void c(float paramFloat)
  {
    this.jsize = paramFloat;
  }

  public final ItemStack g()
  {
    Object localObject = this;
    if (this.data != null)
    {
      localObject = this;
      (localObject = this.data.toItemStack()).setAmount(1);
    }
    else
    {
      localObject = this;
      localObject = new ItemStack(this.material);
    }
    return localObject;
  }

  private Material getMaterial()
  {
    return this.material;
  }

  public final int h()
  {
    return this.price;
  }

  public final void a(int paramInt)
  {
    this.price = paramInt;
  }

  public final boolean i()
  {
    return this.buyable;
  }

  public final void b(boolean paramBoolean)
  {
    this.buyable = paramBoolean;
  }

  public final boolean j()
  {
    return this.Gasoline;
  }

  public final void c(boolean paramBoolean)
  {
    this.Gasoline = paramBoolean;
  }

  public final boolean k()
  {
    return this.AutoDepop;
  }

  public final void d(boolean paramBoolean)
  {
    this.AutoDepop = paramBoolean;
  }

  public final boolean l()
  {
    return this.Inventory;
  }

  public final void e(boolean paramBoolean)
  {
    this.Inventory = paramBoolean;
  }

  public final float m()
  {
    return this.speedBack;
  }

  public final void d(float paramFloat)
  {
    this.speedBack = paramFloat;
  }

  public final boolean n()
  {
    return this.useparticle;
  }

  public final void f(boolean paramBoolean)
  {
    this.useparticle = paramBoolean;
  }

  public final boolean o()
  {
    return this.fly;
  }

  public final void g(boolean paramBoolean)
  {
    this.fly = paramBoolean;
  }

  public final int p()
  {
    return this.flyMaxHeight;
  }

  public final void b(int paramInt)
  {
    this.flyMaxHeight = paramInt;
  }

  public final int q()
  {
    return this.secondBeforeTwoFuelCheck;
  }

  public final MaterialData r()
  {
    if (this.fuelTypeData == null)
      return new MaterialData(Material.LOG);
    return this.fuelTypeData;
  }

  public final void b(MaterialData paramMaterialData)
  {
    this.fuelTypeData = paramMaterialData;
  }

  public final boolean s()
  {
    return this.canFlyOnWater;
  }

  public final void h(boolean paramBoolean)
  {
    this.canFlyOnWater = paramBoolean;
  }

  public final ShapedRecipe t()
  {
    return this.recipe;
  }

  public final void a(ShapedRecipe paramShapedRecipe)
  {
    this.recipe = paramShapedRecipe;
  }

  public final ArrayList<CarSeat> u()
  {
    if (this.seatConf == null)
      this.seatConf = new ArrayList();
    return this.seatConf;
  }

  public final double v()
  {
    return this.heighModify;
  }

  public final void a(double paramDouble)
  {
    this.heighModify = paramDouble;
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.car.a
 * JD-Core Version:    0.6.2
 */