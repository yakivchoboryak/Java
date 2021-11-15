package Main;

import ILaboratory.ILaboratory;
import Lab0.Variant24;

public class Main {
    static ILaboratory variant24 = new Variant24();
    public static void main(String[] args) {

        System.out.println(variant24.arrayFunc(new int[]{1,4,7,10}));
        System.out.println(variant24.arrayFunc(new int[]{2,8,14,20,26,32,38}));
        System.out.println(variant24.arrayFunc(new int[]{2,8,14,20,26,31,38}));
        System.out.println();
        System.out.println(variant24.intFunc(8));
        System.out.println(variant24.intFunc(15));
        System.out.println(variant24.intFunc(123));
        System.out.println();
        System.out.println(variant24.switchFunc(4));
        System.out.println(variant24.switchFunc(7));
        System.out.println(variant24.switchFunc(2));
        System.out.println(variant24.switchFunc(6));
        System.out.println();
        System.out.println(variant24.boolFunc(3, 4, 5));
        System.out.println(variant24.boolFunc(3, 13, 5));
        System.out.println();
        System.out.println(variant24.ifFunc(-3));
        System.out.println(variant24.ifFunc(-9));
        System.out.println(variant24.ifFunc(3));
        System.out.println();
        System.out.println(variant24.forFunc(1.4,5));
        System.out.println(variant24.forFunc(2,3));
        System.out.println();
        System.out.println(variant24.minmaxFunc(new int[]{1,2,4,6,8,67,23,45,36,76,23}));
        System.out.println(variant24.minmaxFunc(new int[]{12,13,11,10,14,9,15}));
        System.out.println();
        System.out.println(variant24.whileFunc(1));
        System.out.println(variant24.whileFunc(3));
        System.out.println(variant24.whileFunc(8));
        System.out.println(variant24.whileFunc(13));
        System.out.println(variant24.whileFunc(12));
    }
}
