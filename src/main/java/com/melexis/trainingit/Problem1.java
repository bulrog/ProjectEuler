package com.melexis.trainingit;

/**
 * Created with IntelliJ IDEA.
 * User: jem
 * Date: 9/24/12
 * Time: 10:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Problem1 {
    public static void main (String[] args){
        int sum=0;
        for (int i=0;i<1000;i++){
            if (i%3==0||i%5==0)
            {
                sum+=i;
            }
        }
        System.out.println("the sum of modulo 3 and 5 numbers below 1000 is:"+sum);
    }

}
