package Classes;

import Classes.Сomponents.*;
import Enumerations.Turns;

import java.util.List;

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

    /**
     * @param b bmx builder instance
     */
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
     * @param turn turn of the controls
     * @return description of result of the action
     */
    public String TurnIt(Turns turn){
        String operationResult = "Nothing happens";
        switch (turn){
            case UpTurn:{
                operationResult = Stunt();
                break;
            }
            case RightTurn: {
                operationResult = RightTurn();
            break;}
            case LeftTurn : {
                operationResult = LeftTurn();
            }
        }
        return operationResult;
    }

    private String Stunt(){
        MovingAngle=0;
        return DoFun();
    }

    private String RightTurn(){MovingAngle++;  return "The right turn angle has increased";}
    private String LeftTurn(){MovingAngle--;return "The left turn angle has increased";}
    private String DoFun(){return "rides on the back wheel";}

    @Override
    public String toString(){
        return (this.CompanyName + super.getClass().getName());
    }

    @Override
    public int hashCode(){
        return (int)MovingAngle;
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

        /**
         * @param CompanyName
         * @return
         */
        public BMXBuilder setCompanyName(String CompanyName) {
            if (CompanyName != null && !CompanyName.equals("")){
                this.CompanyName = CompanyName;
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        /**
         * @param FrontWheel
         * @param BackWheel
         * @return
         */
        public BMXBuilder setWheels(Wheel FrontWheel,Wheel BackWheel) {
            if (FrontWheel != null || BackWheel != null) {
                this.FrontWheel = FrontWheel;
                this.BackWheel = BackWheel;
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        /**
         * @param RightPedal
         * @param LeftPedal
         * @return
         */
        public BMXBuilder setPedals(Pedal RightPedal, Pedal LeftPedal) {
            if (RightPedal != null || LeftPedal != null) {
                this.RightPedal = RightPedal;
                this.LeftPedal = LeftPedal;
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        /**
         * @param Handlebar
         * @return
         */
        public BMXBuilder setHandlebar(Handlebar Handlebar) {
            if (Handlebar != null) {
                this.Handlebar = Handlebar;
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        /**
         * @param Seat
         * @return
         */
        public BMXBuilder setSeat(Seat Seat) {
            if (Seat != null) {
                this.Seat = Seat;
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        /**
         * @param Frame
         * @return
         */
        public BMXBuilder setFrame(Frame Frame) {
            if (Frame != null) {
                this.Frame = Frame;
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        /**
         * @param BearingBalls
         * @return bmx buider instance
         */
        public BMXBuilder setBearingBalls(List<BearingBall> BearingBalls) {
            if (BearingBalls.stream().count() != 0) {
                this.BearingBalls = BearingBalls;
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        /**
         * @return instance of BMX
         */
        public BMX CreateInstance()
        {
            return new BMX(this);
        }
    }
}

