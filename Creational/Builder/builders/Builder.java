package builders;

import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

public interface Builder {
    Builder setCarType(CarType type);
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setTransmission(Transmission transmission);
    Builder setTripComputer(TripComputer tripComputer);
    Builder setGPSNavigator(GPSNavigator gpsNavigator);
    
}