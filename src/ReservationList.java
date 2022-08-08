import java.io.Serializable;
import java.util.ArrayList;

public class ReservationList implements Serializable {
    ArrayList<Reservation>reservationsList;

    public ReservationList(){
        reservationsList=new ArrayList<>();

    }

    public int Size(){
     return reservationsList.size();
    }

    public void Add(Reservation reservation){
      reservationsList.add(reservation);
    }

    public Reservation get(int index){
        if (index<reservationsList.size())
        {
            return reservationsList.get(index);
        }
        else
        {
            return null;
        }

    }

    public void removePlayer(Reservation player)
    {
        ArrayList<Reservation> temp = new ArrayList<>();
        for (int i=0; i<reservationsList.size();i++)
        {
            if (!reservationsList.get(i).equals(player))
            {
                temp.add(reservationsList.get(i));
            }

        }
        reservationsList= temp;
    }

    public Reservation[] getAllReservation(){
        return  reservationsList.toArray(new Reservation[reservationsList.size()]);
    }













}
