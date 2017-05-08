package com.quequiere.ridemycraft.d;

import java.util.ArrayList;
import org.bukkit.inventory.ItemStack;

public final class a
{
  public ItemStack a;
  public char b;

  public a(ItemStack paramItemStack, char paramChar)
  {
    this.a = paramItemStack;
    this.b = paramChar;
  }

  private static String a(ArrayList<a> paramArrayList, int paramInt)
  {
    return ((a)paramArrayList.get(paramInt)).b + ((a)paramArrayList.get(paramInt + 1)).b + ((a)paramArrayList.get(paramInt + 2)).b;
  }

  public static ArrayList<String> a(ArrayList<a> paramArrayList)
  {
    ArrayList localArrayList;
    (localArrayList = new ArrayList()).add(a(paramArrayList, 0));
    localArrayList.add(a(paramArrayList, 3));
    localArrayList.add(a(paramArrayList, 6));
    return localArrayList;
  }

  public static char a(int paramInt)
  {
    if (paramInt == 0)
      return 'a';
    if (paramInt == 1)
      return 'b';
    if (paramInt == 2)
      return 'c';
    if (paramInt == 3)
      return 'd';
    if (paramInt == 4)
      return 'e';
    if (paramInt == 5)
      return 'f';
    if (paramInt == 6)
      return 'g';
    if (paramInt == 7)
      return 'h';
    if (paramInt == 8)
      return 'i';
    if (paramInt == 9)
      return 'j';
    return 'z';
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.d.a
 * JD-Core Version:    0.6.2
 */