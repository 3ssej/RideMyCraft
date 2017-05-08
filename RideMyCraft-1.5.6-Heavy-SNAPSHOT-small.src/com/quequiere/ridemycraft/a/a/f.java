package com.quequiere.ridemycraft.a.a;

import com.quequiere.ridemycraft.Ridemycraft;
import com.quequiere.ridemycraft.a.a;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public final class f extends a
{
  public final void a(Player paramPlayer, String[] paramArrayOfString)
  {
    paramPlayer.sendMessage(ChatColor.AQUA + "[" + Ridemycraft.getPlugin().getName() + "] " + ChatColor.AQUA + "RideMyCraft by quequiere");
    paramPlayer.sendMessage(ChatColor.AQUA + "[" + Ridemycraft.getPlugin().getName() + "] " + ChatColor.AQUA + "Support Skype: quequierebego");
    paramPlayer.sendMessage(ChatColor.AQUA + "[" + Ridemycraft.getPlugin().getName() + "] " + ChatColor.AQUA + "Inspired by RideThaMob plugin");
  }

  public final void a(ConsoleCommandSender paramConsoleCommandSender, String[] paramArrayOfString)
  {
    paramConsoleCommandSender.sendMessage(ChatColor.AQUA + "[" + Ridemycraft.getPlugin().getName() + "] " + ChatColor.AQUA + "RideMyCraft by quequiere");
    paramConsoleCommandSender.sendMessage(ChatColor.AQUA + "[" + Ridemycraft.getPlugin().getName() + "] " + ChatColor.AQUA + "Support Skype: quequierebego");
    paramConsoleCommandSender.sendMessage(ChatColor.AQUA + "[" + Ridemycraft.getPlugin().getName() + "] " + ChatColor.AQUA + "Inspired by RideThatMob plugin");
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.f
 * JD-Core Version:    0.6.2
 */