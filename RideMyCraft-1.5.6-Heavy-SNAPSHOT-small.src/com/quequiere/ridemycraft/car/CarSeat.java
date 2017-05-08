package com.quequiere.ridemycraft.car;

import java.util.ArrayList;
import java.util.Iterator;

public class CarSeat
{
  private int distance = 60;
  private int angle = 90;

  public CarSeat(int paramInt1, int paramInt2)
  {
    this.distance = paramInt1;
    this.angle = paramInt2;
  }

  public int getDistance()
  {
    return this.distance;
  }

  public void setDistance(int paramInt)
  {
    this.distance = paramInt;
  }

  public int getAngle()
  {
    return this.angle;
  }

  public void setAngle(int paramInt)
  {
    this.angle = paramInt;
  }

  public String getName(a parama)
  {
    int i = 0;
    Iterator localIterator = parama.u().iterator();
    while (localIterator.hasNext())
    {
      if ((parama = (CarSeat)localIterator.next()).equals(this))
        return "Seat " + i;
      i++;
    }
    return "null";
  }
}

/* Location:           C:\Users\keith\Desktop\RideMyCraft-1.5.6-Heavy-SNAPSHOT-small.jar
 * Qualified Name:     com.quequiere.ridemycraft.car.CarSeat
 * JD-Core Version:    0.6.2
 */