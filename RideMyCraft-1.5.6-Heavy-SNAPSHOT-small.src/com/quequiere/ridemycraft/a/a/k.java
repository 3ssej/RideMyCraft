package com.quequiere.ridemycraft.a.a;

import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public final class k extends com.quequiere.ridemycraft.a.a
{
  public final void a(Player paramPlayer, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length != 3)
    {
      com.quequiere.ridemycraft.b.a.a.E.a(paramPlayer);
      return;
    }
    com.quequiere.ridemycraft.car.a locala;
    if ((locala = com.quequiere.ridemycraft.car.a.a(paramArrayOfString[1])) == null)
    {
      com.quequiere.ridemycraft.b.a.a.D.a(paramPlayer);
      return;
    }
    try
    {
      paramArrayOfString = Integer.parseInt(paramArrayOfString[2]);
      locala.a(paramArrayOfString);
      try
      {
        locala.a(true);
      }
      catch (com.quequiere.ridemycraft.b.a locala1)
      {
        (paramArrayOfString = locala1).printStackTrace();
      }
      com.quequiere.ridemycraft.b.a.a.C.a(paramPlayer);
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      com.quequiere.ridemycraft.b.a.a.H.a(paramPlayer);
    }
  }

  public final void a(ConsoleCommandSender paramConsoleCommandSender, String[] paramArrayOfString)
  {
    com.quequiere.ridemycraft.b.a.a.i.b();
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.k
 * JD-Core Version:    0.6.2
 */