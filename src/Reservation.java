import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Reservation implements Serializable
{
  private Date startDate;
  private Date endDate;

  private  Borrower borrower;

  public Reservation( Date startDate, Date endDate,Borrower borrower){
    this.startDate=startDate;
    this.endDate=endDate;
    this.borrower=borrower;

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
            ", Borrower: "+ borrower;

  }
}
