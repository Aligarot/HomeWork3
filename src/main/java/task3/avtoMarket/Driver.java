package task3.avtoMarket;

/**
 * Created by Dima on 30.05.2016.
 */
public class Driver {
    private String name;

    public Driver() {
        this.name = "Andre";
        this.id = 11111;
        this.car=new Car();
        this.trip=new Trip();
    }

    public Driver(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Driver(String name, int id, Car car, Trip trip) {
        this.name = name;
        this.id = id;
        this.car = car;
        this.trip = trip;
    }

    private int id;
    private Car car;
    private Trip trip;

    public void zayava(){
        car.setPerfomence(false);
    }
    public void tripHaveDone(){
        this.trip.setFinisshTrip(true);
    }
    public void setCar(Car car){
        this.car=car;
    }
    public void setTrip(Trip trip){
        this.trip=trip;
    }

    public Trip getTrip() {
        return trip;
    }

    public Car getCar() {

        return car;
    }

    public boolean getFinishTrip() {
        return trip.isFinisshTrip();
    }

    public boolean showPerfomance(){

        return car.isPerfomence();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;

        Driver driver = (Driver) o;

        if ((!this.car.equals(driver.car))||(!this.trip.equals(driver.trip))||(id!=driver.id)||(name!=driver.name))   return false;
        return true;
    }
}
