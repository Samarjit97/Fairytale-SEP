package model;

import java.io.Serializable;
import java.util.Objects;

public class Date implements Serializable
{
  private int day;
  private int month;
  private int year;

  public Date( int day, int month, int year){
    this.day=day;
   this.year=year;
    if (month<=12){
      this.month=month;

    }
    else
      throw new IllegalStateException("The month is not valid");

    if (day <= daysInMonth())
      this.day = day;
    else
      throw new IllegalStateException(" The day is not valid");
  }



  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public void set(int day, int month, int year)
  {
    this.day = day;


    this.year=year;
  }

  private int daysInMonth()
  {
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
            || month == 10 || month == 12)
    {
      return 31;
    }
    else if (month == 2 && isLeapYear())
    {
      return 29;
    }
    else if (month == 2)
    {
      return 28;
    }
    else if (month == 4 || month == 6 || month == 9 || month == 11)
    {
      return 30;
    }
    else
    {
      return 0;
    }
  }

  private boolean isLeapYear()
  {
    if ((year % 4 == 0) && (year % 100 != 0))
    {
      return true;
    }
    else if (year % 400 == 0)
    {
      return true;
    }
    else
      return false;
  }
  public Date copy()
  {
    return new Date(day, month, year);
  }



  @Override public String toString()
  {
    return "model.Date: = "+ "Day: = " + day + ", Month: = " + month + ", Year: = " + year;
  }

  @Override public boolean equals(Object o)
  {
    if (!(o instanceof Objects))

      return false;
    Date date = (Date) o;
    return day == date.day && month == date.month && year == date.year;
  }


}
