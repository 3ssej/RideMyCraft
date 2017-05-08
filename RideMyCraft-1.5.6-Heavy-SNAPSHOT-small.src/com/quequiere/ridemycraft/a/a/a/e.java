package com.quequiere.ridemycraft.a.a.a;

import me.xhawk87.PopupMenuAPI.MenuItem;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import org.bukkit.entity.Player;
import org.bukkit.material.MaterialData;

final class e extends MenuItem
{
  e(String paramString, MaterialData paramMaterialData, h paramh, PopupMenu paramPopupMenu, com.quequiere.ridemycraft.c.a.b paramb)
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
    b.a(paramPlayer, this.c);
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.e
 * JD-Core Version:    0.6.2
 */