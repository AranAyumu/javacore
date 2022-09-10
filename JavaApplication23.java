/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author hatsu
 */
public class JavaApplication23 {

    public static void sortASC(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static int climbStairs(int n) {

        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tong so bac thang");
        int totalStair = sc.nextInt();
        System.out.print("Nhap so bac thang bi hu");
        int totalBreakStair = sc.nextInt();
        if(totalBreakStair == 0){
        System.out.println( "Tong so truong hop la: " + climbStairs(totalStair));
        }
        else{
        System.out.print("Nhap cac bac thang bi hu");
        int[] breakStair = new int[totalBreakStair];
        for (int i = 0; i < totalBreakStair; i++) {
            breakStair[i] = sc.nextInt();

        }
        sortASC(breakStair);

        int wayToClimb = 1;
        if (breakStair[0] != 1) {
            wayToClimb = climbStairs(breakStair[0] - 1);
        }
        if (totalBreakStair == 1) {
            wayToClimb = wayToClimb * climbStairs(totalStair - breakStair[0] - 1);
        }
        if (breakStair.length > 1) {
            for (int i = 0; i < breakStair.length - 1; i++) {
                if (breakStair[i + 1] - breakStair[i] > 2) {
                    wayToClimb = wayToClimb * climbStairs(breakStair[i + 1] - breakStair[i] - 2);
                }
                if (breakStair[i + 1] - breakStair[i] < 2) {
                    wayToClimb = wayToClimb * 1;
                }
            }

        }
        if(totalStair - breakStair[breakStair.length -1] > 1){
        wayToClimb = wayToClimb * climbStairs(totalStair - breakStair[breakStair.length - 1] - 1);}
        else{
            wayToClimb = wayToClimb * climbStairs(totalStair - breakStair[breakStair.length - 1]);
        }

        System.out.println("Tong so truong hop la: " + wayToClimb);

    }
}
}
