package task3.avtoMarket;

/**
 * Created by Dima on 30.05.2016.
 */
public class Trip {
    public Trip() {
        this.number = 111111;
        this.finisshTrip = false;
    }

    public Trip(int number, boolean finisshTrip) {
        this.number = number;
        this.finisshTrip = finisshTrip;
    }

    private int number;
    private boolean finisshTrip=false;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isFinisshTrip() {
        return finisshTrip;
    }

    public void setFinisshTrip(boolean finisshTrip) {
        this.finisshTrip = finisshTrip;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trip)) return false;

        Trip trip = (Trip) o;

        if ((getNumber() != trip.getNumber())||(isFinisshTrip() != trip.isFinisshTrip())) return false;
        return true;
    }
}
