package com.quequiere.ridemycraft.a.a.a.a;

import com.quequiere.ridemycraft.b.a.a;
import me.xhawk87.PopupMenuAPI.MenuItem;
import me.xhawk87.PopupMenuAPI.PopupMenu;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.entity.Player;
import org.bukkit.material.MaterialData;

final class c extends MenuItem
{
  c(b paramb, String paramString, MaterialData paramMaterialData, PopupMenu paramPopupMenu, com.quequiere.ridemycraft.c.b.b paramb1)
  {
    super(paramString, paramMaterialData);
  }

  public final void onClick(Player paramPlayer)
  {
    this.a.closeMenu(paramPlayer);
    if (!this.b.c().equals(paramPlayer))
    {
      a.g.a(paramPlayer);
      return;
    }
    this.b.getBukkitEntity().setPassenger(paramPlayer);
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.a.a.a.a.c
 * JD-Core Version:    0.6.2
 */