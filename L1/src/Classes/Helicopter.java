package Classes;

import Enumerations.Turns;

public class Helicopter extends Vehicle {

    /**
     *
     * Controls Helicopter
     *
     * @param turn  turn of the controls
     */
    public String TurnIt(Turns turn){
        String operationResult = "Nothing happens";
        switch (turn){
            case UpTurn:{
                operationResult = Fly();
                break;
            }
            case RightTurn: {
                operationResult = RightTurn();
                break;}
            case LeftTurn : {
                operationResult = LeftTurn();
                break;
            }
            case DownTurn : {
                operationResult = Down();
            }
        }
        return operationResult;
    }

    private String Fly(){return "Helicopter gaining altitude";}
    private String Down(){return "Helicopter is going down";}
    private String RightTurn(){ return "The position in space has changed";}
    private String LeftTurn(){return "the position in space has changed";}
}
