package com.quequiere.ridemycraft.f.a;

import com.quequiere.ridemycraft.a.a.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.bukkit.Location;
import org.bukkit.block.BlockFace;

public final class a
{
  private Location a;
  private HashMap<BlockFace, a> b = new HashMap();

  protected a(Location paramLocation, a parama)
  {
    this.a = paramLocation;
  }

  public final Location a()
  {
    return this.a;
  }

  public final boolean a(Object paramObject)
  {
    if (!(paramObject instanceof a))
      return false;
    paramObject = this;
    return (paramObject = paramObject = (a)paramObject).a.equals(this.a);
  }

  public final HashMap<BlockFace, a> b()
  {
    return this.b;
  }

  public final void a(BlockFace paramBlockFace, a parama)
  {
    a locala = this;
    if (!this.b.containsKey(paramBlockFace))
    {
      locala = this;
      this.b.put(paramBlockFace, parama);
    }
  }

  public static a a(Location paramLocation)
  {
    double d1 = 1.7976931348623157E+308D;
    Object localObject = null;
    Iterator localIterator = j.a.a().iterator();
    while (localIterator.hasNext())
    {
      a locala1 = (a)localIterator.next();
      a locala2;
      double d2;
      if ((d2 = paramLocation.distance((locala2 = locala1).a)) < d1)
      {
        d1 = d2;
        localObject = locala1;
      }
    }
    return localObject;
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.f.a.a
 * JD-Core Version:    0.6.2
 */