package Classes;

import Enumerations.Turns;

public class Helicopter extends Vehicle {

    /**
     *
     * Controls Helicopter
     *
     * @param turn  turn of the controls
     */
    public void TurnIt(Turns turn){
        switch (turn){
            case UpTurn -> Fly();
            case RightTurn -> RightTurn();
            case LeftTurn -> LeftTurn();
        }
    }

    private void Fly(){}
    private void RightTurn(){}
    private void LeftTurn(){}
}
