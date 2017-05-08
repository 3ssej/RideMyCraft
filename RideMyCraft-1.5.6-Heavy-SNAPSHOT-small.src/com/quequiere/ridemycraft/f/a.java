package com.quequiere.ridemycraft.f;

import com.quequiere.ridemycraft.b.c;
import com.quequiere.ridemycraft.f.a.b;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public final class a
  implements Runnable
{
  private static int a = 6;
  private b b;
  private com.quequiere.ridemycraft.f.a.a c;
  private BlockFace d;
  private int e = 0;

  public a(Location paramLocation, BlockFace paramBlockFace, b paramb)
  {
    this.d = paramBlockFace;
    this.b = paramb;
    this.c = paramb.a(paramLocation, null);
    this.c.a(paramBlockFace, this.c);
  }

  public final void run()
  {
    a(this.c, this.d);
    System.out.println("fin ! ");
    Iterator localIterator = this.b.a().iterator();
    while (localIterator.hasNext())
      localIterator.next();
  }

  private void a(com.quequiere.ridemycraft.f.a.a parama, BlockFace paramBlockFace)
  {
    if (this.e > 300)
    {
      System.out.println("Fin forcee");
      return;
    }
    this.e += 1;
    if ((localObject1 = a(parama.a(), paramBlockFace)).size() == 0)
    {
      System.out.println("Aucune direction possible a partir de " + parama.a() + " ==> " + paramBlockFace);
      System.out.println("Forcer avance");
      ((ArrayList)localObject1).add(paramBlockFace);
    }
    else
    {
      System.out.println("direction possible: " + ((ArrayList)localObject1).size());
    }
    Object localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      paramBlockFace = (BlockFace)((Iterator)localObject1).next();
      Object localObject2 = parama.a();
      do
      {
        Object localObject3;
        if ((localObject3 = a(localObject2 = ((Location)localObject2).getBlock().getRelative(paramBlockFace, 1).getLocation(), paramBlockFace)).size() == 0)
        {
          System.out.println("Tout droit vers " + paramBlockFace);
        }
        else
        {
          if (((ArrayList)localObject3).size() > 0)
          {
            localObject2 = this.b.a((Location)localObject2, parama);
            System.out.println("Nouvelle direction possible " + ((com.quequiere.ridemycraft.f.a.a)localObject2).a() + " depuis ==> " + paramBlockFace);
            parama.a(paramBlockFace, (com.quequiere.ridemycraft.f.a.a)localObject2);
            b localb = this.b;
            localObject3 = localObject2;
            localb.a().add(localObject3);
            if ((!localb.a((com.quequiere.ridemycraft.f.a.a)localObject3) ? 1 : 0) == 0)
              break;
            a((com.quequiere.ridemycraft.f.a.a)localObject2, paramBlockFace);
            break;
          }
          System.out.println("Erreur inconnu");
        }
      }
      while (c((Location)localObject2, paramBlockFace));
      System.out.println("Fin d'une route");
    }
  }

  private static ArrayList<BlockFace> a(Location paramLocation, BlockFace paramBlockFace)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = paramBlockFace;
    Object localObject1 = paramLocation;
    BlockFace localBlockFace = com.quequiere.ridemycraft.a.a((BlockFace)localObject2);
    localObject2 = (localObject1 = ((Location)localObject1).getBlock().getRelative(localBlockFace, 1)).getRelative(((BlockFace)localObject2).equals(BlockFace.EAST) ? BlockFace.WEST : ((BlockFace)localObject2).equals(BlockFace.SOUTH) ? BlockFace.NORTH : ((BlockFace)localObject2).equals(BlockFace.WEST) ? BlockFace.EAST : (localObject2 = localObject2).equals(BlockFace.NORTH) ? BlockFace.SOUTH : null, 1);
    localObject1 = (((Block)localObject1).getType().equals(c.b)) && (!((Block)localObject2).getType().equals(c.b)) ? localBlockFace : null;
    localObject2 = b(paramLocation, paramBlockFace);
    if (localObject1 != null)
    {
      localArrayList.add(localObject1);
      if (c(paramLocation, paramBlockFace))
        localArrayList.add(paramBlockFace);
    }
    if (localObject2 != null)
    {
      localArrayList.add(localObject2);
      if ((c(paramLocation, paramBlockFace)) && (!localArrayList.contains(paramBlockFace)))
        localArrayList.add(paramBlockFace);
    }
    return localArrayList;
  }

  private static BlockFace b(Location paramLocation, BlockFace paramBlockFace)
  {
    BlockFace localBlockFace = com.quequiere.ridemycraft.a.b(paramBlockFace);
    for (int i = 1; i < a + 1; i++)
    {
      Block localBlock1;
      Block localBlock2 = (localBlock1 = paramLocation.getBlock().getRelative(localBlockFace, i)).getRelative(paramBlockFace, 1);
      if ((localBlock1.getType().equals(c.b)) && (!localBlock2.getType().equals(c.b)))
      {
        if ((paramLocation.getBlockX() == -414) && (paramLocation.getBlockZ() == 142))
        {
          System.out.println("Alerte:");
          System.out.println(paramLocation);
          System.out.println(localBlock1.getLocation());
          System.out.println(com.quequiere.ridemycraft.a.b(paramBlockFace));
          System.out.println(localBlock2.getLocation());
          System.out.println(paramBlockFace);
        }
        return localBlockFace;
      }
    }
    return null;
  }

  private static boolean c(Location paramLocation, BlockFace paramBlockFace)
  {
    return (paramLocation = paramLocation.getBlock().getRelative(paramBlockFace, 1)).getType().equals(c.b);
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.f.a
 * JD-Core Version:    0.6.2
 */