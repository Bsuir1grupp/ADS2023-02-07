package by.it.group251001.zhidkov.lesson01;

import java.math.BigInteger;
import java.util.ArrayList;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи с вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {

        //вычисление чисел простым быстрым методом
        FiboB fibo = new FiboB();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    BigInteger fastB(Integer n) {
        BigInteger[] MasForFiboCount = new BigInteger[n + 1];
        MasForFiboCount[0] = BigInteger.ZERO;
        MasForFiboCount[1] = BigInteger.ONE;
        int i = 2;
        while (i <= n){
            MasForFiboCount[i] = MasForFiboCount[i - 1].add(MasForFiboCount[i - 2]);
            i++;
        }
        //здесь нужно реализовать вариант с временем O(n) и памятью O(n)
        return MasForFiboCount[n];
    }

}

