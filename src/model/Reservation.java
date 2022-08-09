package model;

import java.io.Serializable;
import java.util.Objects;

public class Reservation implements Serializable
{
  private Date startDate;
  private Date endDate;

  private  Borrower borrower;
  private Items items;
  private Article article;

  public Reservation( Date startDate, Date endDate,Borrower borrower,Items items){
    this.startDate=startDate;
    this.endDate=endDate;
    this.borrower=borrower;
    this.items  = items;
  }


  public Date getStartDate()
  {
    return startDate;
  }

  public Date getEndDate()
  {
    return endDate;
  }


  public void setStartDate(Date startDate)
  {
    this.startDate = startDate;
  }

  public void setEndDate(Date endDate)
  {
    this.endDate = endDate;
  }

  public void setBorrower(Borrower borrower) {
    this.borrower = borrower;
  }

  public Borrower getBorrower() {
    return borrower;
  }



  @Override public boolean equals(Object o)
  {
    if ( !( o instanceof Objects))

      return false;
    Reservation that = (Reservation) o;
    return Objects.equals(startDate, that.startDate) && Objects.equals(endDate,
        that.endDate);
  }



  @Override
  public String toString() {
    return "Start from: "+ startDate + "" +
              ", Deadline: "+ endDate +
            ", model.Borrower: "+ borrower;

  }
}
