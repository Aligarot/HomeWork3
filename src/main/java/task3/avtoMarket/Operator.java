package task3.avtoMarket;

/**
 * Created by Dima on 30.05.2016.
 */
public class Operator {

    public String name;


    public Operator() {
        this.name = "User";
    }

    public Operator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCar(Driver driver, Car car){
        driver.setCar(car);
    }
    public void setTrip(Driver driver,Trip trip){
        driver.setTrip(trip);
    }

    public void debarDriver(Driver driver, Trip trip){
        driver.setCar(null);
        driver.setTrip(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operator operator = (Operator) o;

        return name != null ? name.equals(operator.name) : operator.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
