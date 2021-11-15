package Classes;

import Enumerations.Turns;

public class Car extends Vehicle{
    private float MovingAngle = 0;

    /**
     *
     * Controls Car
     *
     * @param turn  turn of the controls
     */
    public String TurnIt(Turns turn){
        String operationResult = "Nothing happens";
        switch (turn){
            case RightTurn: {
                operationResult = RightTurn();
            break;}
            case LeftTurn : {
                operationResult = LeftTurn();}
        }
        return operationResult;
    }

    private String RightTurn(){MovingAngle++;  return "The right turn angle has increased";}
    private String LeftTurn(){MovingAngle--;return "The left turn angle has increased";}
}
