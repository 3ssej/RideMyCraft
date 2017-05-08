package com.quequiere.ridemycraft.a.a;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public final class e extends com.quequiere.ridemycraft.a.a
{
  public final void a(Player paramPlayer, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length != 3)
    {
      com.quequiere.ridemycraft.b.a.a.F.a(paramPlayer);
      return;
    }
    com.quequiere.ridemycraft.car.a locala;
    if ((locala = com.quequiere.ridemycraft.car.a.a(paramArrayOfString[2])) == null)
    {
      com.quequiere.ridemycraft.b.a.a.D.a(paramPlayer);
      return;
    }
    if ((paramArrayOfString = Bukkit.getPlayer(paramArrayOfString[1])) == null)
    {
      com.quequiere.ridemycraft.b.a.a.l.a(paramPlayer);
      return;
    }
    if ((paramArrayOfString = com.quequiere.ridemycraft.e.a.a(paramArrayOfString)) == null)
    {
      com.quequiere.ridemycraft.b.a.a.k.a(paramPlayer);
      return;
    }
    paramArrayOfString.a(locala);
  }

  public final void a(ConsoleCommandSender paramConsoleCommandSender, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length != 3)
    {
      com.quequiere.ridemycraft.b.a.a.F.b();
      return;
    }
    if ((paramConsoleCommandSender = com.quequiere.ridemycraft.car.a.a(paramArrayOfString[2])) == null)
    {
      com.quequiere.ridemycraft.b.a.a.D.b();
      return;
    }
    if ((paramArrayOfString = Bukkit.getPlayer(paramArrayOfString[1])) == null)
    {
      com.quequiere.ridemycraft.b.a.a.l.b();
      return;
    }
    if ((paramArrayOfString = com.quequiere.ridemycraft.e.a.a(paramArrayOfString)) == null)
    {
      com.quequiere.ridemycraft.b.a.a.k.b();
      return;
    }
    paramArrayOfString.a(paramConsoleCommandSender);
    com.quequiere.ridemycraft.b.a.a.x.b();
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.e
 * JD-Core Version:    0.6.2
 */