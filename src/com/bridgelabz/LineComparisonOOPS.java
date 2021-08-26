package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonOOPS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1:");
        int x1 = sc.nextInt();

        Scanner scd = new Scanner(System.in);
        System.out.print("Enter x2:");
        int x2 = scd.nextInt();

        Scanner scs = new Scanner(System.in);
        System.out.print("Enter y1:");
        int y1 = scs.nextInt();

        Scanner sca = new Scanner(System.in);
        System.out.print("Enter y2:");
        int y2 = sca.nextInt();

        LineComparisonOOPS obj = new LineComparisonOOPS();
        obj.calculate(x1, x2, y1, y2);
    }

    public void calculate(int x1, int x2, int y1, int y2) {
        int a = x2 - x1;
        int b = y2 - y1;
        System.out.println("Distance between the given coordinates are : " + Math.sqrt((a * a) + (b * b)));
    }
}
