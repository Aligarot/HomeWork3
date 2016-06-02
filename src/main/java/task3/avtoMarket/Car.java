package task3.avtoMarket;

/**
 * Created by Dima on 30.05.2016.
 */
public class Car {
    private String nameCar;
    private boolean perfomence;

    public Car() {
        this.nameCar = "Audi";
        this.perfomence = true;
    }

    public Car(String nameCar, boolean perfomence) {
        this.nameCar = nameCar;
        this.perfomence = perfomence;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public boolean isPerfomence() {
        return perfomence;
    }

    public void setPerfomence(boolean perfomence) {
        this.perfomence = perfomence;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if ((getNameCar() != car.getNameCar())||(isPerfomence() != car.isPerfomence())) return false;
        return true;
    }
}
