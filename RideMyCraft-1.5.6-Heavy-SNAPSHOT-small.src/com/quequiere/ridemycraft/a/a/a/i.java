package com.quequiere.ridemycraft.a.a.a;

import com.quequiere.ridemycraft.a.a.a.a.g;
import com.quequiere.ridemycraft.a.a.a.a.h;
import com.quequiere.ridemycraft.a.a.a.a.l;
import java.util.ArrayList;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Wool;

public enum i
{
  private boolean d = false;
  private MaterialData e = null;
  private String f = "No description for this option.";
  private h g;
  private boolean h = false;

  private i(boolean paramString, MaterialData paramh, String paramBoolean2, h arg6, boolean arg7)
  {
    this.f = paramBoolean2;
    Object localObject;
    this.g = localObject;
    this.h = true;
  }

  public final MaterialData a(com.quequiere.ridemycraft.c.b.b paramb)
  {
    if (this.d)
    {
      paramb = 0;
      Wool localWool = new Wool(Material.WOOL);
      if (paramb != 0)
        localWool.setColor(DyeColor.LIME);
      else
        localWool.setColor(DyeColor.RED);
      return paramb = new MaterialData(localWool.toItemStack().getType(), localWool.getData());
    }
    if (this.e != null)
      return this.e;
    return new MaterialData(Material.WOOL);
  }

  public final boolean a()
  {
    return this.h;
  }

  public final String b()
  {
    if (this.d)
      return this.f;
    return this.f;
  }

  public final void a(com.quequiere.ridemycraft.c.b.b paramb, Player paramPlayer)
  {
    if (this.g != null)
    {
      this.g.a(paramb, paramPlayer);
      return;
    }
  }

  public static ArrayList<i> b(com.quequiere.ridemycraft.c.b.b paramb)
  {
    ArrayList localArrayList = new ArrayList();
    i[] arrayOfi1;
    System.arraycopy(i, 0, arrayOfi1 = new i[3], 0, 3);
    i[] arrayOfi2;
    int k = (arrayOfi2 = arrayOfi1).length;
    for (int j = 0; j < k; j++)
      if ((arrayOfi1 = arrayOfi2[j]).equals(c))
      {
        if (paramb.e().l())
          localArrayList.add(arrayOfi1);
      }
      else
        localArrayList.add(arrayOfi1);
    return localArrayList;
  }

  public final String c()
  {
    if (equals(b))
      return com.quequiere.ridemycraft.b.a.a.P.c();
    if (equals(a))
      return com.quequiere.ridemycraft.b.a.a.Q.c();
    if (equals(c))
      return com.quequiere.ridemycraft.b.a.a.R.c();
    return super.toString();
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.i
 * JD-Core Version:    0.6.2
 */