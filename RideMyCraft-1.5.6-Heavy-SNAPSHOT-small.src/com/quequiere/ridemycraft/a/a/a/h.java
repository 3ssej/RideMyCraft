package com.quequiere.ridemycraft.a.a.a;

import com.quequiere.ridemycraft.a.a.a.a.g;
import com.quequiere.ridemycraft.a.a.a.a.l;
import java.util.ArrayList;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Wool;

public enum h
{
  private boolean d = false;
  private MaterialData e = null;
  private String f = "No description for this option.";
  private com.quequiere.ridemycraft.a.a.a.a.h g;
  private boolean h = false;

  private h(boolean paramString, MaterialData paramh, String paramBoolean2, com.quequiere.ridemycraft.a.a.a.a.h arg6, boolean arg7)
  {
    this.f = paramBoolean2;
    Object localObject;
    this.g = localObject;
    this.h = true;
  }

  public final MaterialData a(com.quequiere.ridemycraft.c.a.b paramb)
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

  public final void a(com.quequiere.ridemycraft.c.a.b paramb, Player paramPlayer)
  {
    if (this.g != null)
    {
      this.g.a(paramb, paramPlayer);
      return;
    }
  }

  public static ArrayList<h> b(com.quequiere.ridemycraft.c.a.b paramb)
  {
    ArrayList localArrayList = new ArrayList();
    h[] arrayOfh1;
    System.arraycopy(i, 0, arrayOfh1 = new h[3], 0, 3);
    h[] arrayOfh2;
    int k = (arrayOfh2 = arrayOfh1).length;
    for (int j = 0; j < k; j++)
      if ((arrayOfh1 = arrayOfh2[j]).equals(c))
      {
        if (paramb.e().l())
          localArrayList.add(arrayOfh1);
      }
      else
        localArrayList.add(arrayOfh1);
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
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.h
 * JD-Core Version:    0.6.2
 */