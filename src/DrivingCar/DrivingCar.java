package DrivingCar;

public interface DrivingCar {
    public default void breakk(SetDrivingCar setDrivingCar) {};
    public default void accelerate( SetDrivingCar setDrivingCar) {};
    public default void handleEmergency(SetDrivingCar setDrivingCar){};
}
