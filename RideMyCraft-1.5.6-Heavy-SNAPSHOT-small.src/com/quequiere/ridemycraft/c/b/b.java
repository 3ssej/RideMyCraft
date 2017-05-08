package com.quequiere.ridemycraft.c.b;

import com.quequiere.ridemycraft.a.a.j;
import com.quequiere.ridemycraft.car.CarSeat;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import net.minecraft.server.v1_8_R3.BlockPosition;
import net.minecraft.server.v1_8_R3.Blocks;
import net.minecraft.server.v1_8_R3.Entity;
import net.minecraft.server.v1_8_R3.EntityArmorStand;
import net.minecraft.server.v1_8_R3.EntityHuman;
import net.minecraft.server.v1_8_R3.EntityItem;
import net.minecraft.server.v1_8_R3.EntityLiving;
import net.minecraft.server.v1_8_R3.IBlockData;
import net.minecraft.server.v1_8_R3.PathEntity;
import net.minecraft.server.v1_8_R3.PathPoint;
import net.minecraft.server.v1_8_R3.Pathfinder;
import net.minecraft.server.v1_8_R3.PathfinderNormal;
import net.minecraft.server.v1_8_R3.Vector3f;
import net.minecraft.server.v1_8_R3.WorldServer;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.util.Vector;
import org.spigotmc.ActivationRange;

public final class b extends EntityArmorStand
{
  private static HashMap<CraftEntity, b> a = new HashMap();
  private boolean b = false;
  private float c = 0.0F;
  private com.quequiere.ridemycraft.car.a d;
  private Player e;
  private Inventory f;
  private long g = 0L;
  private int h = 0;
  private int i = 0;
  private boolean l = false;
  private int m = 0;
  private boolean n = false;
  private PathEntity o = null;
  private int p = 0;
  private long q = 0L;
  private ArrayList<a> r = new ArrayList();
  private float s = 0.3F;
  private com.quequiere.ridemycraft.f.a.a t = null;

  private b(net.minecraft.server.v1_8_R3.World paramWorld, com.quequiere.ridemycraft.car.a parama, Player paramPlayer)
  {
    super(paramWorld);
    this.d = parama;
    this.e = paramPlayer;
    this.f = Bukkit.createInventory(null, 45);
  }

  public final void g(float paramFloat1, float paramFloat2)
  {
    this.S = this.d.f();
    Object localObject1;
    Object localObject5;
    if ((this.passenger != null) && ((this.passenger instanceof EntityHuman)))
    {
      this.fallDistance = 0.0F;
      int j = 0;
      int k = 0;
      int i1 = 0;
      if ((this.d.o()) || ((this.d.s()) && (!this.d.o())))
        this.onGround = true;
      if (this.d.j())
      {
        long l1;
        long l2;
        if ((l2 = (l1 = System.currentTimeMillis() / 1000L) - this.g) > this.d.q())
        {
          this.g = l1;
          if (this.h <= 1)
          {
            b localb = this;
            ItemStack[] arrayOfItemStack;
            int i6 = (arrayOfItemStack = this.f.getContents()).length;
            for (int i4 = 0; i4 < i6; i4++)
            {
              ItemStack localItemStack;
              if ((i6 = localItemStack.getAmount() - 1) <= 0)
                localb.f.remove(localItemStack);
              else
                localItemStack.setAmount(i6);
            }
            if ((((localItemStack = arrayOfItemStack[i4]) != null) && (localItemStack.getData().equals(localb.d.r())) ? 1 : 0) != 0)
            {
              this.h = 100;
            }
            else if (this.h <= 0)
            {
              this.h = 0;
              com.quequiere.ridemycraft.b.a.a.e.a(this.e, ChatColor.GRAY + "Fuel: " + this.d.r().getItemType().name());
            }
            else
            {
              this.h -= 1;
            }
          }
          else if (this.h <= 0)
          {
            this.h = 0;
          }
          else
          {
            this.h -= 1;
          }
        }
        if (this.h <= 0)
        {
          if (j() > 0)
            this.motY = -0.2D;
          k(0.0F);
          this.c = 0.0F;
          super.g(0.0F, 0.0F);
          return;
        }
      }
      paramFloat1 = ((EntityLiving)this.passenger).aZ * 0.05F;
      k(this.d.d());
      float f2;
      if ((f2 = ((EntityLiving)this.passenger).ba) >= 0.0F)
      {
        if ((f2 > paramFloat2) && (this.c < 0.98F))
          f2 = this.c + this.d.e() / 100.0F / 10.0F;
        paramFloat2 = f2;
      }
      else
      {
        paramFloat2 = f2 * (this.d.m() / 100.0F);
      }
      if ((this.d.o()) && (!k()))
      {
        if (((this.d.j()) && (this.h > 0)) || ((!this.d.j()) && (j() <= this.d.p())))
          if (paramFloat2 > 0.0F)
          {
            int i3;
            if ((i3 = j()) != this.d.p())
              k = 1;
            else
              i1 = 1;
            this.motY = 0.2D;
          }
          else if (paramFloat2 == 0.0F)
          {
            i1 = 1;
            this.motY = 0.0D;
          }
          else
          {
            j = 1;
            this.motY = -0.2D;
          }
      }
      else if (!this.d.o())
      {
        i1 = 1;
        if ((k()) && (j() <= 0))
          this.motY = 0.0D;
      }
      float f3 = this.yaw - this.passenger.yaw;
      if (this.yaw < 0.0F)
        this.yaw += 360.0F;
      float f4;
      if ((f4 = f3) < 0.0F)
      {
        if ((f4 = -f4) > 180.0F)
          f3 += 360.0F;
      }
      else if (f4 > 180.0F)
        f3 -= 360.0F;
      if (f3 > 180.0F)
        f3 -= 380.0F;
      if ((f3 > -2.0F) && (f3 < 2.0F))
      {
        if (j != 0)
          setHeadPose(new Vector3f(20.0F, 0.0F, 0.0F));
        else if (k != 0)
          setHeadPose(new Vector3f(-10.0F, 0.0F, 0.0F));
        else if (i1 != 0)
          setHeadPose(new Vector3f(0.0F, 0.0F, 0.0F));
      }
      else if (f3 < 0.0F)
      {
        if (j != 0)
          setHeadPose(new Vector3f(20.0F, 0.0F, -13.0F));
        else if (k != 0)
          setHeadPose(new Vector3f(-10.0F, 0.0F, -13.0F));
        else if (i1 != 0)
          setHeadPose(new Vector3f(0.0F, 0.0F, -13.0F));
      }
      else if (j != 0)
        setHeadPose(new Vector3f(20.0F, 0.0F, 13.0F));
      else if (k != 0)
        setHeadPose(new Vector3f(-10.0F, 0.0F, 13.0F));
      else if (i1 != 0)
        setHeadPose(new Vector3f(0.0F, 0.0F, 13.0F));
      float f5 = this.yaw - f3 * (this.d.e() / 100.0F);
      this.yaw = f5;
      this.lastYaw = this.yaw;
      this.pitch = this.passenger.pitch;
      setYawPitch(this.yaw, this.pitch);
      this.aI = (this.aG = this.yaw);
      if ((this.e != null) && (this.d.n()))
        if ((this.c == 0.0F) && (paramFloat2 != 0.0F))
          for (int i7 = 0; i7 < 3; i7++)
            this.e.getWorld().playEffect(this.e.getLocation().add(0.0D, -1.0D, 0.0D), Effect.MOBSPAWNER_FLAMES, 0);
        else if (paramFloat2 != 0.0F)
          this.e.getWorld().playEffect(this.e.getLocation().add(0.0D, -1.0D, 0.0D), Effect.SMOKE, 0);
    }
    else if (this.d.k())
    {
      b();
    }
    else
    {
      Object localObject4;
      Object localObject6;
      Object localObject7;
      if ((this.n) && (this.o != null))
      {
        localObject4 = this;
        if (this.o.d() > ((b)localObject4).m)
        {
          PathPoint localPathPoint = ((b)localObject4).o.a(((b)localObject4).m);
          localObject6 = new Vector(((b)localObject4).locX, ((b)localObject4).locY, ((b)localObject4).locZ);
          localObject6 = (localObject7 = new Vector(localPathPoint.a, localPathPoint.b, localPathPoint.c)).subtract((Vector)localObject6);
          localObject1 = new Location(((b)localObject4).e.getWorld(), localPathPoint.a, localPathPoint.b, localPathPoint.c);
          localObject2 = new Location(((b)localObject4).e.getWorld(), ((b)localObject4).locX, ((b)localObject4).locY, ((b)localObject4).locZ);
          float f1;
          if ((f1 = (float)Math.toDegrees(Math.atan2(localPathPoint.c - ((b)localObject4).locZ, localPathPoint.a - ((b)localObject4).locX))) < 0.0F)
            f1 += 360.0F;
          ((b)localObject4).yaw = (f1 - 90.0F);
          if (!((Location)localObject1).getChunk().isLoaded())
            ((Location)localObject1).getChunk().load();
          double d7;
          if ((d7 = ((Location)localObject2).distance((Location)localObject1)) < 0.1D)
          {
            localObject4.m += 1;
            ((b)localObject4).p = 0;
          }
          else
          {
            localObject4.p += 1;
          }
          try
          {
            Object localObject3 = ((b)localObject4).o.a(((b)localObject4).m - 1);
            (localObject3 = new Location(((b)localObject4).e.getWorld(), ((PathPoint)localObject3).a, ((PathPoint)localObject3).b, ((PathPoint)localObject3).c)).distance((Location)localObject1);
            ((Location)localObject3).distance((Location)localObject2);
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
          {
          }
          if (((b)localObject4).p > 50)
          {
            ((b)localObject4).p = 0;
            ((b)localObject4).getBukkitEntity().teleport((Location)localObject1);
          }
          ((b)localObject4).getBukkitEntity().setVelocity(((Vector)localObject6).multiply(((b)localObject4).s));
        }
        else
        {
          ((b)localObject4).n = false;
          ((b)localObject4).o = null;
          com.quequiere.ridemycraft.b.a.a.C.a(((b)localObject4).e);
        }
      }
      else if (j.a != null)
      {
        if (this.t == null)
        {
          localObject1 = com.quequiere.ridemycraft.f.a.a.a(getBukkitEntity().getLocation());
          this.t = ((com.quequiere.ridemycraft.f.a.a)localObject1);
          a(((com.quequiere.ridemycraft.f.a.a)localObject1).a().clone().add(0.5D, 1.0D, 0.5D), 0.2F);
        }
        else
        {
          localObject4 = this.t;
          System.out.println("Cela est " + ((com.quequiere.ridemycraft.f.a.a)localObject4).b().size());
          if (((com.quequiere.ridemycraft.f.a.a)localObject4).b().size() == 0)
            System.out.println("Erreur critique !" + ((com.quequiere.ridemycraft.f.a.a)localObject4).a());
          int i5 = (localObject5 = new Random()).nextInt(((com.quequiere.ridemycraft.f.a.a)localObject4).b().size() - 1 + 1);
          localObject6 = (BlockFace)localObject4.b().keySet().toArray()[i5];
          localObject7 = (com.quequiere.ridemycraft.f.a.a)((com.quequiere.ridemycraft.f.a.a)localObject4).b().get(localObject6);
          if (j.a.a().contains(localObject7))
            System.out.println("je me contient " + localObject7 + " rand: " + i5);
          else
            System.out.println("Je me contient pas" + localObject7 + " rand: " + i5);
          if ((localObject1 = localObject7) != null)
          {
            a(((com.quequiere.ridemycraft.f.a.a)localObject1).a().clone().add(0.5D, 1.0D, 0.5D), 0.2F);
            if (((com.quequiere.ridemycraft.f.a.a)localObject1).b().size() <= 0)
            {
              System.out.println("faille " + this.t.b().size());
              System.out.println(j.a.a().contains(this.t) + " / " + j.a.a().contains(localObject1));
              b();
            }
            this.t = ((com.quequiere.ridemycraft.f.a.a)localObject1);
          }
          else
          {
            b();
          }
        }
      }
      if (this.d.o())
        if (j() < 2)
        {
          if (this.l)
          {
            this.i += 1;
            this.motY = 0.09D;
            if (this.i > 10)
            {
              this.l = false;
              this.i = 0;
            }
          }
          else
          {
            this.i += 1;
            this.motY = -0.05D;
            if (this.i > 23)
            {
              this.l = true;
              this.i = 0;
            }
          }
        }
        else
        {
          this.motY = -5.0D;
          this.i = 0;
        }
    }
    this.c = paramFloat2;
    super.g(paramFloat1, paramFloat2);
    Object localObject2 = l().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      int i2 = (localObject1 = (a)((Iterator)localObject2).next()).a().getDistance();
      localObject5 = new Vector(this.locX, this.locY, this.locZ);
      this.q = (()this.yaw + ((a)localObject1).a().getAngle());
      double d1 = this.q * 3.141592653589793D / 180.0D;
      double d2 = (this.q == 0L ? 360L : this.q - 1L) * 3.141592653589793D / 180.0D;
      double d3 = Math.cos(d1) * i2;
      double d4 = Math.cos(d2) * i2;
      double d5 = Math.sin(d1) * i2;
      double d6 = Math.sin(d2) * i2;
      paramFloat1 = new Vector(d4 - d3, 0.0D, d6 - d5);
      paramFloat1 = ((Vector)localObject5).subtract(paramFloat1);
      ((a)localObject1).setPosition(paramFloat1.getX(), paramFloat1.getY() - this.d.v(), paramFloat1.getZ());
    }
    this.locY -= this.d.v();
  }

  public final void a(a parama)
  {
    if (this.r == null)
      this.r = new ArrayList();
    this.r.add(parama);
  }

  public final void inactiveTick()
  {
    if (!ActivationRange.checkIfActive(this))
      g(0.0F, 0.0F);
  }

  public final void a()
  {
    a(this.e.getLocation(), 0.3F);
  }

  private void a(Location paramLocation, float paramFloat)
  {
    System.out.println("request");
    this.s = paramFloat;
    System.currentTimeMillis();
    (paramFloat = new PathfinderNormal()).a(this);
    paramLocation = new BlockPosition(paramLocation.getBlockX(), paramLocation.getBlockY(), paramLocation.getBlockZ());
    paramFloat = new Pathfinder(paramFloat);
    this.o = paramFloat.a(this.world, this, paramLocation, 1000.0F);
    if ((this.o == null) && (this.e != null))
    {
      com.quequiere.ridemycraft.b.a.a.b.a(this.e);
      return;
    }
    for (paramLocation = 0; paramLocation < this.o.d(); paramLocation++)
      if (!(paramFloat = new Location(getBukkitEntity().getWorld(), this.o.a(paramLocation).a, this.o.a(paramLocation).b, this.o.a(paramLocation).c).getChunk()).isLoaded())
        paramFloat.load();
    if (this.e != null)
      com.quequiere.ridemycraft.b.a.a.c.a(this.e);
    this.m = 0;
    this.p = 0;
    this.n = true;
  }

  public final void b()
  {
    die();
    if (a.containsKey(getBukkitEntity()))
      a.remove(getBukkitEntity());
    if (this.b)
      return;
    this.b = true;
    Object localObject = this;
    ItemStack[] arrayOfItemStack;
    int k = (arrayOfItemStack = this.f.getContents()).length;
    for (int j = 0; j < k; j++);
    if (((localObject = arrayOfItemStack[j]) != null ? 0 : 1) == 0)
    {
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext())
        if ((localObject = (ItemStack)localIterator.next()) != null)
        {
          localObject = new EntityItem(this.world, this.locX, this.locY, this.locZ, CraftItemStack.asNMSCopy((ItemStack)localObject));
          this.world.addEntity((Entity)localObject);
        }
    }
  }

  private int j()
  {
    BlockPosition localBlockPosition = new BlockPosition(this);
    localBlockPosition = this.world.getHighestBlockYAt(localBlockPosition);
    int j;
    return j = (int)(this.locY - localBlockPosition.getY());
  }

  private boolean k()
  {
    if ((this.d.o()) && (this.d.s()))
      return false;
    BlockPosition localBlockPosition = new BlockPosition(this);
    localBlockPosition = this.world.getHighestBlockYAt(localBlockPosition);
    return this.world.getType(localBlockPosition.down()).getBlock().equals(Blocks.WATER);
  }

  public final Player c()
  {
    return this.e;
  }

  public final com.quequiere.ridemycraft.car.a e()
  {
    return this.d;
  }

  public static b a(CraftEntity paramCraftEntity)
  {
    return (b)a.get(paramCraftEntity);
  }

  public static void g()
  {
    new ArrayList();
    Object localObject = (localObject = a.keySet()).iterator();
    while (((Iterator)localObject).hasNext())
    {
      CraftEntity localCraftEntity = (CraftEntity)((Iterator)localObject).next();
      b localb = (b)a.get(localCraftEntity);
      if ((localCraftEntity.isDead()) || (!localCraftEntity.isValid()) || (localb.k()))
      {
        localb.b();
        a.remove(localCraftEntity);
      }
    }
  }

  public static ArrayList<b> a(Player paramPlayer)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = (localObject1 = a.keySet()).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (CraftEntity)((Iterator)localObject1).next();
      b localb;
      if ((localb = localObject2 = (b)a.get(localObject2)).e.equals(paramPlayer))
        localArrayList.add(localObject2);
    }
    return localArrayList;
  }

  public static boolean a(Player paramPlayer, com.quequiere.ridemycraft.car.a parama)
  {
    Iterator localIterator = a(paramPlayer).iterator();
    while (localIterator.hasNext())
      if ((paramPlayer = paramPlayer = (b)localIterator.next()).d.equals(parama))
        return true;
    return false;
  }

  public final Inventory i()
  {
    return this.f;
  }

  public static void b(Player paramPlayer, com.quequiere.ridemycraft.car.a parama)
  {
    WorldServer localWorldServer = ((CraftWorld)paramPlayer.getLocation().getWorld()).getHandle();
    b localb;
    (localb = new b(localWorldServer, parama, paramPlayer)).setPosition(paramPlayer.getLocation().getX(), paramPlayer.getLocation().getY(), paramPlayer.getLocation().getZ());
    localb.setEquipment(4, CraftItemStack.asNMSCopy(parama.g()));
    localb.setInvisible(true);
    localWorldServer.addEntity(localb);
    localb.getBukkitEntity().setPassenger(paramPlayer);
    a.put(localb.getBukkitEntity(), localb);
    com.quequiere.ridemycraft.b.a.a.A.a(paramPlayer);
  }

  public final boolean a(CarSeat paramCarSeat)
  {
    Iterator localIterator = l().iterator();
    while (localIterator.hasNext())
    {
      a locala;
      if ((locala = (a)localIterator.next()).a().equals(paramCarSeat))
        return false;
    }
    return true;
  }

  private ArrayList<a> l()
  {
    ArrayList localArrayList = new ArrayList();
    if (this.r == null)
      this.r = new ArrayList();
    Iterator localIterator = this.r.iterator();
    a locala;
    while (localIterator.hasNext())
      if ((!(locala = (a)localIterator.next()).isAlive()) || (!locala.getBukkitEntity().isValid()))
        localArrayList.add(locala);
    localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      locala = (a)localIterator.next();
      this.r.remove(locala);
    }
    return this.r;
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.c.b.b
 * JD-Core Version:    0.6.2
 */