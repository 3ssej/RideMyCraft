package com.quequiere.ridemycraft.a;

import com.quequiere.ridemycraft.Ridemycraft;
import com.quequiere.ridemycraft.a.a.b;
import com.quequiere.ridemycraft.a.a.d;
import com.quequiere.ridemycraft.a.a.e;
import com.quequiere.ridemycraft.a.a.f;
import com.quequiere.ridemycraft.a.a.g;
import com.quequiere.ridemycraft.a.a.k;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public enum c
{
  createcar(new d()), givecar(new e()), buy(new com.quequiere.ridemycraft.a.a.a()), info(new f()), setprice(new k()), modify(new g()), car(new com.quequiere.ridemycraft.a.a.c()), callcar(new b());

  private a ce;

  private c(a arg3)
  {
    Object localObject;
    this.ce = localObject;
  }

  public final void execute(CommandSender paramCommandSender, String[] paramArrayOfString)
  {
    if ((paramCommandSender instanceof Player))
    {
      paramCommandSender = (Player)paramCommandSender;
      this.ce.a(paramCommandSender, paramArrayOfString);
      return;
    }
    this.ce.a((ConsoleCommandSender)paramCommandSender, paramArrayOfString);
  }

  public final boolean hasPermission(CommandSender paramCommandSender)
  {
    if (equals(info))
      return true;
    return Ridemycraft.permission.has(paramCommandSender, Ridemycraft.getPlugin().getName() + ".commande." + toString());
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.c
 * JD-Core Version:    0.6.2
 */