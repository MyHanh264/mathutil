package com.hanh.util;

import com.hanh.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        verifyFactorialGivenRightArg0RunsWell();
        verifyFactorialGivenRightArg1RunsWell();
        verifyFactorialGivenRightArg2RunsWell();
        verifyFactorialGivenRightArg3RunsWell();
    }
    //Test case #3, 4, 5, 6: verify the getFactorial() with  n = 3, 4, 5, 6....
    public static void verifyFactorialGivenRightArg3RunsWell() {
        int n = 3;
        long expected = 6; //hi vọng 1 trả về nếu 1!
        long actual = MathUtility.getFactorial(n);
        System.out.println("3! = expected: " + expected + ", actual: " + actual);
    }
    //Test case #2: verify the getFactorial() with  n = 1
    public static void verifyFactorialGivenRightArg1RunsWell() {
        int n = 1;
        long expected = 1; //hi vọng 1 trả về nếu 1!
        long actual = MathUtility.getFactorial(n);
        System.out.println("1! = expected: " + expected + ", actual: " + actual);
    }
    //Test case #1: verify the getFactorial() with  n = 2
    public static void verifyFactorialGivenRightArg2RunsWell() {
        int n = 2;
        long expected = 2; //hi vọng 2 trả về nếu 2!
        long actual = MathUtility.getFactorial(n);
        System.out.println("2! = expected: " + expected + ", actual: " + actual);
    }

    //Test thử hàm tính giai thừa, gọi trong main()
    //muốn test gì đó thì phải có test case;
    //test case #1: verify the getfactorial() with N= 0;
    //Step:
    //Given n= 0
    //call getfectorial(n=0)
    //EXPECTED RESULT:
    //THE MOTHOD must return 1 as the result of 0! = 1
    //Status: pass/fail
    public static void verifyFactorialGivenRightArg0RunsWell() {
        int n = 0;
        long expected = 1; //hi vọng 1 trả về nếu 0!
        long actual = MathUtility.getFactorial(n);
        System.out.println("0! = expected: " + expected + ", actual: " + actual);
    }

}