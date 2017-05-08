package com.quequiere.ridemycraft.a.a.a;

import com.quequiere.ridemycraft.a.a.a.a.k;
import com.quequiere.ridemycraft.a.a.a.a.s;
import com.quequiere.ridemycraft.a.a.a.a.v;
import com.quequiere.ridemycraft.car.CarSeat;
import com.quequiere.ridemycraft.car.a;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.material.MaterialData;

public enum g
{
  private String c = "No description for this option.";
  private k d;

  private g(String arg3, k arg4)
  {
    Object localObject1;
    this.c = localObject1;
    Object localObject2;
    this.d = localObject2;
  }

  public static MaterialData a()
  {
    return new MaterialData(Material.WOOL);
  }

  public final String a(CarSeat paramCarSeat)
  {
    if (equals(a))
      return this.c + " Current: " + paramCarSeat.getAngle();
    if (equals(b))
      return this.c + " Current: " + paramCarSeat.getDistance();
    return this.c;
  }

  public final void a(a parama, Player paramPlayer, CarSeat paramCarSeat)
  {
    if (this.d != null)
    {
      this.d.a(parama, paramPlayer, paramCarSeat);
      return;
    }
  }

  public static g[] b()
  {
    g[] arrayOfg;
    System.arraycopy(e, 0, arrayOfg = new g[2], 0, 2);
    return arrayOfg;
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.g
 * JD-Core Version:    0.6.2
 */