package com.quequiere.ridemycraft.b;

import com.quequiere.ridemycraft.Ridemycraft;
import java.io.File;
import java.io.PrintStream;

public final class b
{
  public static String a = "plugins/" + Ridemycraft.getPlugin().getName() + "/cars";
  public static String b = "plugins/" + Ridemycraft.getPlugin().getName() + "/players";

  public static boolean a()
  {
    File localFile;
    if (!(localFile = new File(b)).exists())
      localFile.mkdirs();
    return ((localFile = new File(a)).exists()) && (localFile.isDirectory());
  }

  public static void b()
  {
    File localFile;
    (localFile = new File(a)).mkdirs();
    System.out.println("\033[33m[" + Ridemycraft.getPlugin().getName() + "] Cars folder created !\033[0m");
  }

  public static boolean a(String paramString)
  {
    return ((paramString = new File(a + "/" + paramString + ".json")).exists()) && (!paramString.isDirectory());
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.b.b
 * JD-Core Version:    0.6.2
 */