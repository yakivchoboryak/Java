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
    public void TurnIt(Turns turn){
        switch (turn){
            case RightTurn -> RightTurn();
            case LeftTurn -> LeftTurn();
        }
    }

    private void RightTurn(){MovingAngle++;}
    private void LeftTurn(){MovingAngle--;}
}
