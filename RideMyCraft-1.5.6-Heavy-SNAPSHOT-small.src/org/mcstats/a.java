package org.mcstats;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;

final class a
  implements Runnable
{
  private boolean a = true;

  a(Metrics paramMetrics)
  {
  }

  public final void run()
  {
    try
    {
      synchronized (Metrics.access$100(this.b))
      {
        if ((this.b.isOptOut()) && (Metrics.access$200(this.b) != null))
        {
          Metrics.access$200(this.b).cancel();
          Metrics.access$202(this.b, null);
          Iterator localIterator = Metrics.access$300(this.b).iterator();
          while (localIterator.hasNext())
          {
            Metrics.Graph localGraph;
            (localGraph = (Metrics.Graph)localIterator.next()).onOptOut();
          }
        }
      }
      Metrics.access$400(this.b, !this.a);
      this.a = false;
      return;
    }
    catch (IOException localIOException)
    {
      if (Metrics.access$500(this.b))
        Bukkit.getLogger().log(Level.INFO, "[Metrics] " + localIOException.getMessage());
    }
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     org.mcstats.a
 * JD-Core Version:    0.6.2
 */