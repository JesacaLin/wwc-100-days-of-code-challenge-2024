package org.JesacaLin;
public class Main {
    public static void main(String[] args) {

System.out.println(makeBricks(3, 2, 8)); //true
System.out.println(makeBricks(3, 1, 8)); //true
System.out.println(makeBricks(3, 1, 9)); //false
System.out.println(makeBricks(3, 2, 10)); //true
System.out.println(makeBricks(3, 2, 9)); //false
System.out.println(makeBricks(1, 4, 11)); //false
    }
    public static boolean makeBricks(int small, int big, int goal) {
        int bigBrickSize = big * 5;
        int totalBricks = small + bigBrickSize;

        if ((small >= goal) || (bigBrickSize == goal)) return true;

        if (totalBricks >= goal) {
            int remainder = 0;

            if (bigBrickSize > goal) {
                remainder = goal % 5;
            } else {
                remainder = goal % bigBrickSize;
            }

            return small >= remainder;
        }
        return false;
    }
}