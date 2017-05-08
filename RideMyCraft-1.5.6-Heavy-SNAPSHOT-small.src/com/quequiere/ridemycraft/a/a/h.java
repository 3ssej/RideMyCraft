package com.quequiere.ridemycraft.a.a;

import me.xhawk87.PopupMenuAPI.MenuItem;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import org.bukkit.entity.Player;
import org.bukkit.material.MaterialData;

final class h extends MenuItem
{
  h(String paramString, MaterialData paramMaterialData, com.quequiere.ridemycraft.a.a.a.a parama, PopupMenu paramPopupMenu, com.quequiere.ridemycraft.car.a parama1)
  {
    super(paramString, paramMaterialData);
  }

  public final void onClick(Player paramPlayer)
  {
    if (this.a.a())
    {
      this.b.closeMenu(paramPlayer);
      this.a.a(this.c, paramPlayer);
      return;
    }
    this.a.a(this.c, paramPlayer);
    g.a(paramPlayer, this.c);
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.h
 * JD-Core Version:    0.6.2
 */