package Lab0;

import ILaboratory.ILaboratory;

import java.util.*;


public class Variant24 implements ILaboratory {
    //done
    public int intFunc(int yearDay) {
        return yearDay % 7;
    }
    //done
    public boolean boolFunc(int a, int b, int c){
        //D = B^2 – 4·A·C
        return b*b-4*a*c > 0;
    }
    //done
    public double ifFunc(double x) {
        return x > 0 ? 2* Math.sin(x) : 6-x;
    }
    //done
    public int switchFunc(int monthNumber) {
        return switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            default -> 28;
        };
    }
    //done
    public double forFunc(double x, int n) {
        double sum = 0;
        for (int i = 0; i < n ; i++) {
            int a = i % 2 == 0 ? 1 : -1;
            x*=x;
            sum += a * x / factorial(i*2);
        }
        return sum;
    }

    public static int factorial(int number){
        int i,fact=1;
        for(i=1;i <= number;i++)
            {
                fact=fact*i;
            }
        return fact;
    }

    //done
    public boolean whileFunc(int n) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        do{
            n2=n0+n1;
            n0=n1;
            n1=n2;
        }while (n > n0);
        return n == n0;
    }
    //done
    public int minmaxFunc(int[] arr) {
        int sum=arr[0]+arr[1];
        for(int i=0; i < arr.length-1;i++){
            int localsum = arr[i]+arr[i+1];
            sum = Math.max(localsum,sum);
        }
        return sum;
    }
    //done
    public int arrayFunc(int[] arr) {
        arr = Arrays.stream(arr).sorted().toArray();
        int d = arr[1]-arr[0];
        for(int i=0; i+1 < arr.length;i++){
            if( arr[i+1] - arr[i] != d){return 0;}
        }
        return d;
    }
    //done
    public double[] matrixFunc(double[][] mtx) {
        double[] max = null;
        for (double[] i :mtx){
            if(max==null)
                {
                    max = i;
                }
            else
                {
                    for(int j=0;j<i.length;j++)
                        {
                            max[j] = Math.max(max[j],i[j]);
                        }
                }
        }
       return max;
    }
}

