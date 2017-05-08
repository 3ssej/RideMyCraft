package com.quequiere.ridemycraft.c.a;

import com.quequiere.ridemycraft.car.CarSeat;
import java.util.HashMap;
import net.minecraft.server.v1_8_R2.EntityArmorStand;
import net.minecraft.server.v1_8_R2.EntityHuman;
import net.minecraft.server.v1_8_R2.World;
import org.bukkit.craftbukkit.v1_8_R2.entity.CraftEntity;

public final class a extends EntityArmorStand
{
  private static HashMap<CraftEntity, b> a = new HashMap();
  private CarSeat b;

  private a(World paramWorld, CarSeat paramCarSeat)
  {
    super(paramWorld);
    this.b = paramCarSeat;
  }

  public final void g(float paramFloat1, float paramFloat2)
  {
    if ((this.passenger == null) || (!(this.passenger instanceof EntityHuman)))
    {
      die();
      a.remove(this);
    }
  }

  public final CarSeat a()
  {
    return this.b;
  }

  public static b a(CraftEntity paramCraftEntity)
  {
    return (b)a.get(paramCraftEntity);
  }

  public static a a(World paramWorld, b paramb, CarSeat paramCarSeat)
  {
    (paramCarSeat = new a(paramWorld, paramCarSeat)).setPosition(paramb.locX, paramb.locY, paramb.locZ);
    paramCarSeat.setInvisible(true);
    paramWorld.addEntity(paramCarSeat);
    a.put(paramCarSeat.getBukkitEntity(), paramb);
    return paramCarSeat;
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.c.a.a
 * JD-Core Version:    0.6.2
 */