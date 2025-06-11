package com.hanh.util.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //chuẩn bị bộ data để riêng - DD - Data Driven
    //lát hồi fill vào hàm so sánh T: Testing
    //Fill vào qua tham số hàm - hàm làm việc với nhiều data
    //DDT còn gọi tên khác: parameterized testing -> kiểm thử theo kiểu tham số hóa

    //Bộ data nằm trong hàm static
    //Bộ data thường là mảng 2 chiều, giá trị đầu vào và giá trị kỳ vọng
    public static Object[][] initData(){
        //int[] a = {5, 10, 15, 30};
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}};
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgsRunWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}