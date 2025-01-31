package DrivingCar;

public class SetDrivingCar {
    private String CurrentState;
    private DrivingCar drivingCar;
    public void breakk(){
        drivingCar.breakk(this);
    }
    public void accelerate(){
        drivingCar.accelerate(this);
    }
    public void handleEmergency(){
        drivingCar.handleEmergency(this);
    }
}
