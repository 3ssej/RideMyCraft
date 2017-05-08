package com.quequiere.ridemycraft.a.a;

import com.quequiere.ridemycraft.Ridemycraft;
import com.quequiere.ridemycraft.d;
import java.util.ArrayList;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public final class b extends com.quequiere.ridemycraft.a.a
{
  static
  {
    com.quequiere.ridemycraft.b.a.a.p.c();
  }

  public final void a(Player paramPlayer, String[] paramArrayOfString)
  {
    if (Ridemycraft.version.equals(d.b))
    {
      if ((paramArrayOfString = com.quequiere.ridemycraft.c.b.b.a(paramPlayer = paramPlayer)).size() <= 0)
      {
        com.quequiere.ridemycraft.b.a.a.d.a(paramPlayer);
      }
      else if (!(paramArrayOfString = (com.quequiere.ridemycraft.c.b.b)paramArrayOfString.get(0)).getBukkitEntity().isValid())
      {
        paramPlayer.sendMessage("Force despawn car!");
        paramArrayOfString.b();
      }
      else
      {
        paramPlayer.sendMessage("Command sent");
        paramArrayOfString.a();
      }
    }
    else if (Ridemycraft.version.equals(d.a))
    {
      if ((paramArrayOfString = com.quequiere.ridemycraft.c.a.b.a(paramPlayer = paramPlayer)).size() <= 0)
      {
        com.quequiere.ridemycraft.b.a.a.d.a(paramPlayer);
        return;
      }
      if (!(paramArrayOfString = (com.quequiere.ridemycraft.c.a.b)paramArrayOfString.get(0)).getBukkitEntity().isValid())
      {
        paramPlayer.sendMessage("Force despawn car!");
        paramArrayOfString.b();
        return;
      }
      paramArrayOfString.a();
    }
  }

  public final void a(ConsoleCommandSender paramConsoleCommandSender, String[] paramArrayOfString)
  {
    com.quequiere.ridemycraft.b.a.a.i.b();
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.b
 * JD-Core Version:    0.6.2
 */