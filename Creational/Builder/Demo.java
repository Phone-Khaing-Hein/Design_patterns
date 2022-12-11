import builders.CarBuilder;
import cars.Car;
import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;
import director.Director;

public class Demo {

    public static void main(String[] args) {
        var director = new Director();
        var builder = new CarBuilder();

        director.constructSportsCar(builder);
        var car = builder.getResult();
        System.out.println(car.print());

        var car2 = new Car(CarType.CITY_CAR, 2, new Engine(3.0, 0), Transmission.AUTOMATIC, new TripComputer(), new GPSNavigator());
        System.out.println("Car2 built:\n" + car2.print());
    }
}
