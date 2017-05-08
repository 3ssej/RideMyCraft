package com.quequiere.ridemycraft.b;

import com.quequiere.ridemycraft.Ridemycraft;
import java.io.PrintStream;

public final class a extends Exception
{
  public a(com.quequiere.ridemycraft.car.a parama)
  {
    System.out.println("\033[31m[" + Ridemycraft.getPlugin().getName() + "] Can't create car, " + parama.a() + " already exist!\033[0m");
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.b.a
 * JD-Core Version:    0.6.2
 */