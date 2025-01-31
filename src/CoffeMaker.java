public class CoffeMaker {
    //private boolean machineIsOn;
    //private boolean waterIsHot;
    //private boolean waterIsEnough;
    private ICoffeMakerState coffemakerstate;
    public void ServeCoffe(){
        coffemakerstate.ServeCoffe();
    }
    public void FinishCoffe(){
        /*if(!machineIsOn){
            System.out.println("no light");
        }*/
        coffemakerstate.FinishCoffe();

    }
    public void PressOn(){
       /* if(!machineIsOn){
            machineIsOn = true;
            System.out.println("Machine is on");
        }else{
            System.out.println("Machine is on");
        }*/
        coffemakerstate.PressOn();
    }
    public void ChangeState(ICoffeMakerState newstate){

    }
}
