package Classes;

import Classes.Сomponents.*;
import Enumerations.Turns;
import Interfaces.IControlable;
import Interfaces.IRideable;
import groovy.transform.ToString;

import java.util.List;
import java.util.function.DoubleToIntFunction;

public class BMX extends Vehicle{

    private float MovingAngle = 0;

    public String CompanyName;

    private Wheel FrontWheel;
    private Wheel BackWheel;
    private Seat Seat;
    private Pedal RightPedal;
    private Pedal LeftPedal;
    private Handlebar Handlebar;
    private Frame Frame;
    private List<BearingBall> BearingBalls;

    private BMX(BMXBuilder b)
    {
        this.CompanyName = b.CompanyName;
        this.FrontWheel = b.FrontWheel;
        this.BackWheel = b.BackWheel;
        this.Seat = b.Seat;
        this.RightPedal = b.RightPedal;
        this.LeftPedal = b.LeftPedal;
        this.Handlebar = b.Handlebar;
        this.Frame = b.Frame;
        this.BearingBalls = b.BearingBalls;
    }

    /**
     *
     * Controls BMX
     *
     * @param turn  turn of the controls
     */
    public void TurnIt(Turns turn){
        switch (turn){
            case UpTurn -> Stunt();
            case RightTurn -> RightTurn();
            case LeftTurn -> LeftTurn();
        }
    }

    private void Stunt(){
        MovingAngle=0;
        DoFun();
    }

    private void RightTurn(){MovingAngle++;}
    private void LeftTurn(){MovingAngle--;}
    private void DoFun(){};

    @override public String ToString(){
        return this.CompanyName + super.getClass().getName();
    }

    @override public int hashCode(){
        return MovingAngle.DoubleToIntFunction() || 0;
    }

    public static class BMXBuilder {
        public String CompanyName;

        private Wheel FrontWheel;
        private Wheel BackWheel;
        private Seat Seat;
        private Pedal RightPedal;
        private Pedal LeftPedal;
        private Handlebar Handlebar;
        private Frame Frame;
        private List<BearingBall> BearingBalls;

        public BMXBuilder setCompanyName(String CompanyName) {
            if (CompanyName != null && CompanyName.equals("")){
                this.CompanyName = CompanyName;
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        public BMXBuilder setWheels(Wheel FrontWheel,Wheel BackWheel) {
            if (FrontWheel != null || BackWheel != null) {
                this.FrontWheel = FrontWheel;
                this.BackWheel = BackWheel;
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        public BMXBuilder setPedals(Pedal RightPedal, Pedal LeftPedal) {
            if (RightPedal != null || LeftPedal != null) {
                this.RightPedal = RightPedal;
                this.LeftPedal = LeftPedal;
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        public BMXBuilder setHandlebar(Handlebar Handlebar) {
            if (Handlebar != null) {
                this.Handlebar = Handlebar;
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        public BMXBuilder setSeat(Seat Seat) {
            if (Seat != null) {
                this.Seat = Seat;
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        public BMXBuilder setFrame(Frame Frame) {
            if (Frame != null) {
                this.Frame = Frame;
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        public BMXBuilder setBearingBalls(List<BearingBall> BearingBalls) {
            if (BearingBalls.stream().count() != 0) {
                this.BearingBalls = BearingBalls;
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        public BMX CreateInstance()
        {
            return new BMX(this);
        }
    }
}

