/**
 *@author Jude Kallista-Fitzpatrick
 * @date 11/4/2017
 */

import MathPack.*;

public class CalculatorActivity {
    public static void main(String[] args){
        double [] num = new double[5];
        num[0] = 20.0;
        num[1] = 14.0;
        num[2] = 24.4;
        num[3] = 16.4;
        num[4] = 19.4;

        //Get average
        System.out.println(Calculator.getAverage(num));
        System.out.println(Calculator.getAverage(5.0, 3.0));
        System.out.println(Calculator.getAverage(5.0,3.0,6.0));
        //Get sum
        System.out.println(Calculator.getSum(num));
        System.out.println(Calculator.getSum(12.0, 18.0));
        System.out.println(Calculator.getSum(12.0,18.0,24.0));
        //Get Product
        System.out.println(Calculator.getProduct(num));
        System.out.println(Calculator.getProduct(18.0,15.0));
        System.out.println(Calculator.getProduct(18.0,15.0,12.0));
    }
}