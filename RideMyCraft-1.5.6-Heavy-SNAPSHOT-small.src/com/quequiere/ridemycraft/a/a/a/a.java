package com.quequiere.ridemycraft.a.a.a;

import com.quequiere.ridemycraft.a.a.a.a.B;
import com.quequiere.ridemycraft.a.a.a.a.D;
import com.quequiere.ridemycraft.a.a.a.a.E;
import com.quequiere.ridemycraft.a.a.a.a.G;
import com.quequiere.ridemycraft.a.a.a.a.I;
import com.quequiere.ridemycraft.a.a.a.a.J;
import com.quequiere.ridemycraft.a.a.a.a.L;
import com.quequiere.ridemycraft.a.a.a.a.i;
import com.quequiere.ridemycraft.a.a.a.a.j;
import com.quequiere.ridemycraft.a.a.a.a.k;
import com.quequiere.ridemycraft.a.a.a.a.m;
import com.quequiere.ridemycraft.a.a.a.a.p;
import com.quequiere.ridemycraft.a.a.a.a.u;
import com.quequiere.ridemycraft.a.a.a.a.x;
import com.quequiere.ridemycraft.a.a.a.a.y;
import com.quequiere.ridemycraft.a.a.a.a.z;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Wool;

public enum a
{
  private boolean r;
  private MaterialData s;
  private String t = "No description for this option.";
  private k u;
  private boolean v = false;

  private a(boolean paramString, MaterialData paramk, String paramBoolean2, k arg6, boolean arg7)
  {
    this.r = paramString;
    this.s = null;
    this.t = paramBoolean2;
    Object localObject;
    this.u = localObject;
    boolean bool;
    this.v = bool;
  }

  public final MaterialData a(com.quequiere.ridemycraft.car.a parama)
  {
    if (this.r)
    {
      Object localObject = parama;
      parama = this;
      parama = parama.equals(n) ? ((com.quequiere.ridemycraft.car.a)localObject).l() : parama.equals(h) ? ((com.quequiere.ridemycraft.car.a)localObject).s() : parama.equals(g) ? ((com.quequiere.ridemycraft.car.a)localObject).o() : parama.equals(m) ? ((com.quequiere.ridemycraft.car.a)localObject).n() : parama.equals(l) ? ((com.quequiere.ridemycraft.car.a)localObject).k() : parama.equals(j) ? ((com.quequiere.ridemycraft.car.a)localObject).j() : equals(f) ? ((com.quequiere.ridemycraft.car.a)localObject).i() : 0;
      localObject = new Wool(Material.WOOL);
      if (parama != 0)
        ((Wool)localObject).setColor(DyeColor.LIME);
      else
        ((Wool)localObject).setColor(DyeColor.RED);
      return parama = new MaterialData(((Wool)localObject).toItemStack().getType(), ((Wool)localObject).getData());
    }
    if (this.s != null)
      return this.s;
    if (equals(k))
      return parama.r();
    return new MaterialData(Material.WOOL);
  }

  public final boolean a()
  {
    return this.v;
  }

  public final String b(com.quequiere.ridemycraft.car.a parama)
  {
    if (this.r)
      return this.t;
    if (equals(a))
      return this.t + " Current speed: " + parama.d();
    if (equals(d))
      return this.t + " Current Jump: " + parama.f();
    if (equals(i))
      return this.t + " Current Fly height : " + parama.p();
    if (equals(b))
      return this.t + " Current reverse speed: " + parama.m();
    if (equals(c))
      return this.t + " Current maneuvrability: " + parama.e();
    if (equals(e))
      return this.t + " Current price: " + parama.h();
    if (equals(q))
      return this.t + " Current heigh from ground: " + parama.v();
    return this.t;
  }

  public final void a(com.quequiere.ridemycraft.car.a parama, Player paramPlayer)
  {
    if (this.u != null)
    {
      this.u.a(parama, paramPlayer);
      return;
    }
  }

  public static a[] b()
  {
    a[] arrayOfa;
    System.arraycopy(w, 0, arrayOfa = new a[17], 0, 17);
    return arrayOfa;
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.a
 * JD-Core Version:    0.6.2
 */