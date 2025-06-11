package com.hanh.util.mathutil.core;

public class MathUtility {

    // class này dùng cung câp các hàm tính toán học
    // bắt trước class math. trong jdk
    //do đó ta thiết kế nó dạng STATIC

    //ta làm hàm tính N! = 1.2.3.4....N
    // quy ước:
    //0! =1 (của bên toán học)
    //Không có giai thừa số âm, -5! không hợp lệ
    //20! vừa đủ kiểu long, 21! khong dùng long được.
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must between 0 and 20");
            //nếu đưa data n cà chớn, ném ra ngoại lệ, ném câu thông báo, ko có giá trị trả về
        }
        if (n == 0) {
            return 1;
        }
        //cpu chạy đến đây tức là n = 1, 2, 3, ... 19, 20
        //Tính n! =  1.2.3.4.... thuật toán con heo đất, ốc bu nhồi thịt
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

