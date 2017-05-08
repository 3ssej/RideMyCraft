package me.xhawk87.PopupMenuAPI;

import java.util.ArrayList;
import java.util.List;

public class StringUtil
{
  public static List<String> wrapWords(String paramString, int paramInt)
  {
    paramString = paramString.split("\\n");
    ArrayList localArrayList = new ArrayList();
    String str1 = paramString;
    int j = paramString.length;
    for (int i = 0; i < j; i++)
    {
      paramString = (paramString = str1[i]).split(" ");
      StringBuilder localStringBuilder = new StringBuilder();
      String str2 = paramString;
      int m = paramString.length;
      for (int k = 0; k < m; k++)
        if ((paramString = str2[k]).length() >= paramInt)
        {
          if (localStringBuilder.length() != 0)
            localArrayList.add(localStringBuilder.toString());
          localArrayList.add(paramString);
          localStringBuilder = new StringBuilder();
        }
        else
        {
          if (localStringBuilder.length() + paramString.length() >= paramInt)
          {
            localArrayList.add(localStringBuilder.toString());
            localStringBuilder = new StringBuilder();
          }
          if (localStringBuilder.length() != 0)
            localStringBuilder.append(' ');
          localStringBuilder.append(paramString);
        }
      localArrayList.add(localStringBuilder.toString());
    }
    return localArrayList;
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     me.xhawk87.PopupMenuAPI.StringUtil
 * JD-Core Version:    0.6.2
 */