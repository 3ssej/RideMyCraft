package com.quequiere.ridemycraft.a.a;

import me.xhawk87.PopupMenuAPI.MenuItem;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import me.xhawk87.PopupMenuAPI.PopupMenuAPI;
import me.xhawk87.PopupMenuAPI.StringUtil;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public final class g extends com.quequiere.ridemycraft.a.a
{
  public final void a(Player paramPlayer, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length != 2)
    {
      com.quequiere.ridemycraft.b.a.a.h.a(paramPlayer);
      return;
    }
    if ((paramArrayOfString = com.quequiere.ridemycraft.car.a.a(paramArrayOfString[1])) != null)
    {
      a(paramPlayer, paramArrayOfString);
      return;
    }
    com.quequiere.ridemycraft.b.a.a.D.a(paramPlayer);
  }

  public static void a(Player paramPlayer, com.quequiere.ridemycraft.car.a parama)
  {
    com.quequiere.ridemycraft.a.a.a.a[] arrayOfa = com.quequiere.ridemycraft.a.a.a.a.b();
    PopupMenu localPopupMenu = PopupMenuAPI.createMenu("Car admin modify menu", (int)Math.ceil(arrayOfa.length / 9.0D));
    for (int i = 0; i < arrayOfa.length; i++)
    {
      com.quequiere.ridemycraft.a.a.a.a locala = arrayOfa[i];
      h localh;
      (localh = new h(locala.toString(), locala.a(parama), locala, localPopupMenu, parama)).setDescriptions(StringUtil.wrapWords(locala.b(parama), 40));
      localPopupMenu.addMenuItem(localh, i);
    }
    localPopupMenu.setMenuCloseBehaviour(new i());
    localPopupMenu.openMenu(paramPlayer);
  }

  public final void a(ConsoleCommandSender paramConsoleCommandSender, String[] paramArrayOfString)
  {
    com.quequiere.ridemycraft.b.a.a.i.b();
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.g
 * JD-Core Version:    0.6.2
 */