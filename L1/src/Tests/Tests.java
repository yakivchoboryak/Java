package Tests;

import static org.testng.Assert.assertEquals;

import Classes.BMX;
import Classes.Car;
import Classes.Vehicle;
import static org.testng.Assert.assertEquals;

import Classes.Сomponents.*;
import Enumerations.Turns;
import org.testng.annotations.DataProvider;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("ALL")
public class Tests {
    static BMX bmx;
    static BMX.BMXBuilder builder = new BMX.BMXBuilder();
    static Car car = new Car();
    static Vehicle vehicle = new Vehicle();

    @org.testng.annotations.Test(dataProvider = "bmxTurnsProvider")
    public void bmxTurnsTest(Turns turn,String res) {
        builder.setBearingBalls(List.of(new BearingBall(),new BearingBall(),new BearingBall(),new BearingBall(),new BearingBall(),new BearingBall()));
        builder.setFrame(new Frame());
        builder.setCompanyName("NikoNikoNeee");
        builder.setHandlebar(new Handlebar());
        builder.setWheels(new Wheel(),new Wheel());
        builder.setPedals(new Pedal(),new Pedal());
        builder.setSeat(new Seat());

        bmx = builder.CreateInstance();
        assertEquals(bmx.TurnIt(turn), res);
    }

    @DataProvider
    public Object[][] bmxTurnsProvider() {
        Object[][] objects = new Object[4][];
        objects[0] = new Object[]{Turns.LeftTurn,"The left turn angle has increased"};
        objects[1] = new Object[]{Turns.RightTurn,"The right turn angle has increased"};
        objects[2] = new Object[]{Turns.UpTurn,"rides on the back wheel"};
        objects[3] = new Object[]{Turns.DownTurn,"Nothing happens"};
        return objects;
    }
}
