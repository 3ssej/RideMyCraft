package com.quequiere.ridemycraft.b.a;

import com.quequiere.ridemycraft.Ridemycraft;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public enum a
{
  private ArrayList<String> af = new ArrayList();
  private ChatColor ag;

  private a(ChatColor arg3, String[] arg4)
  {
    Object localObject1;
    this.ag = localObject1;
    Object localObject2;
    String[] arrayOfString = (localObject2 = localObject2).length;
    for (paramArrayOfString = 0; paramArrayOfString < arrayOfString; paramArrayOfString++)
    {
      paramChatColor = localObject2[paramArrayOfString];
      this.af.add(paramChatColor);
    }
  }

  public final ArrayList<String> a()
  {
    return this.af;
  }

  public final void a(List<String> paramList)
  {
    this.af.clear();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (String)localIterator.next();
      this.af.add(paramList);
    }
  }

  private String e()
  {
    if (this.ag == null)
      return "";
    return this.ag;
  }

  public final void a(Player paramPlayer)
  {
    Object localObject = this;
    Iterator localIterator = this.af.iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      paramPlayer.sendMessage(ChatColor.AQUA + "[" + ae.c() + "] " + ChatColor.WHITE + e() + (String)localObject);
    }
  }

  public final void a(Player paramPlayer, String paramString)
  {
    Object localObject = this;
    Iterator localIterator = this.af.iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      paramPlayer.sendMessage(ChatColor.AQUA + "[" + ae.c() + "] " + e() + (String)localObject + " " + paramString);
    }
  }

  public final void b()
  {
    Object localObject = this;
    Iterator localIterator = this.af.iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      System.out.println("\033[31m[" + Ridemycraft.getPlugin().getName() + "] " + e() + (String)localObject + "\033[0m");
    }
  }

  public final void a(String paramString)
  {
    Object localObject = this;
    Iterator localIterator = this.af.iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      System.out.println("\033[31m[" + Ridemycraft.getPlugin().getName() + "] " + e() + (String)localObject + " " + paramString + "\033[0m");
    }
  }

  public final String c()
  {
    a locala = this;
    return (String)this.af.get(0);
  }

  public static a[] d()
  {
    a[] arrayOfa;
    System.arraycopy(ah, 0, arrayOfa = new a[57], 0, 57);
    return arrayOfa;
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.b.a.a
 * JD-Core Version:    0.6.2
 */