package com.quequiere.ridemycraft.f.a;

import com.quequiere.ridemycraft.b.c;
import java.util.ArrayList;
import java.util.Iterator;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public final class b
{
  private ArrayList<a> a = new ArrayList();

  public b(Location paramLocation)
  {
    BlockFace localBlockFace = a(paramLocation = a(paramLocation, 10));
    (paramLocation = new com.quequiere.ridemycraft.f.a(paramLocation, localBlockFace, this)).run();
  }

  public final a a(Location paramLocation, a parama)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      a locala;
      if ((locala = (a)localIterator.next()).a().equals(paramLocation))
        return locala;
    }
    return new a(paramLocation, parama);
  }

  public final boolean a(a parama)
  {
    Object localObject = this;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      localObject = (a)localIterator.next();
      if (parama.a(localObject))
        return true;
    }
    return false;
  }

  public final ArrayList<a> a()
  {
    return this.a;
  }

  private static BlockFace a(Location paramLocation)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = com.quequiere.ridemycraft.a.b().iterator();
    BlockFace localBlockFace;
    Block localBlock;
    while (localIterator.hasNext())
    {
      localBlockFace = (BlockFace)localIterator.next();
      if ((localBlock = paramLocation.getBlock().getRelative(localBlockFace, 1)).getType().equals(c.b))
        localArrayList.add(localBlockFace);
    }
    localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      localBlockFace = (BlockFace)localIterator.next();
      if (!(localBlock = paramLocation.getBlock().getRelative(com.quequiere.ridemycraft.a.a(localBlockFace), 1)).getType().equals(c.b))
        return localBlockFace;
    }
    return null;
  }

  private static Location a(Location paramLocation, int paramInt)
  {
    double d1 = 1.7976931348623157E+308D;
    paramInt = null;
    Iterator localIterator = com.quequiere.ridemycraft.a.b().iterator();
    while (localIterator.hasNext())
    {
      BlockFace localBlockFace = (BlockFace)localIterator.next();
      int i = 1;
      int j = 0;
      Location localLocation = paramLocation.clone();
      while (localLocation.getBlock().getType().equals(c.b))
      {
        if (j > 10)
        {
          i = 1;
          break;
        }
        i = 0;
        localLocation = localLocation.getBlock().getRelative(localBlockFace, 1).getLocation();
        j++;
      }
      double d2;
      if ((i == 0) && ((d2 = paramLocation.distance(localLocation)) < d1))
      {
        paramInt = localLocation.getBlock().getRelative(localBlockFace, -1).getLocation().add(0.5D, 0.0D, 0.5D);
        d1 = d2;
      }
    }
    if (paramInt == null)
      return paramLocation;
    return paramInt;
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.f.a.b
 * JD-Core Version:    0.6.2
 */