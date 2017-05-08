package com.quequiere.ridemycraft.a;

import com.quequiere.ridemycraft.Ridemycraft;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public final class b
  implements CommandExecutor
{
  public final boolean onCommand(CommandSender paramCommandSender, Command paramCommand, String paramString, String[] paramArrayOfString)
  {
    if (paramCommand.getName().equalsIgnoreCase(Ridemycraft.getPlugin().getName()))
    {
      if (paramArrayOfString.length == 0)
      {
        a(paramCommandSender);
        return true;
      }
      try
      {
        if ((paramCommand = c.valueOf(paramArrayOfString[0])) == null)
        {
          paramCommandSender.sendMessage(ChatColor.RED + "Unknow command :" + paramArrayOfString[0]);
          a(paramCommandSender);
          return true;
        }
        if (paramCommand.hasPermission(paramCommandSender))
        {
          paramCommand.execute(paramCommandSender, paramArrayOfString);
          return true;
        }
        paramCommandSender.sendMessage(ChatColor.RED + "You need to have ==> " + Ridemycraft.getPlugin().getName() + ".commande." + paramArrayOfString[0]);
        return true;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        paramCommandSender.sendMessage(ChatColor.RED + "Argument illegal !");
        a(paramCommandSender);
        return true;
      }
    }
    return true;
  }

  private static void a(CommandSender paramCommandSender)
  {
    paramCommandSender.sendMessage(ChatColor.BLUE + "-----------------");
    paramCommandSender.sendMessage(ChatColor.YELLOW + "Commands list:");
    c[] arrayOfc;
    int j = (arrayOfc = c.values()).length;
    for (int i = 0; i < j; i++)
    {
      c localc;
      if ((localc = arrayOfc[i]).hasPermission(paramCommandSender))
        paramCommandSender.sendMessage(ChatColor.GREEN + "- /" + Ridemycraft.getPlugin().getName() + " " + localc.toString());
      else
        paramCommandSender.sendMessage(ChatColor.RED + "- /" + Ridemycraft.getPlugin().getName() + " " + localc.toString());
    }
    paramCommandSender.sendMessage(ChatColor.BLUE + "-----------------");
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.b
 * JD-Core Version:    0.6.2
 */