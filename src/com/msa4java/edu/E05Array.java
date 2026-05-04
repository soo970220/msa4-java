package com.msa4java.edu;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
        // 길이 5의 int 배열 생성 및 초기화, 내부 값 설정 안할 시 0부터 시작
        int[] arrInt = new int[5];
        arrInt[3]=50;
        System.out.println(Arrays.toString(arrInt));
        // 길이 4의 char 배열 생성 및 초기화( 요소의 값도 셋팅)
        char[] arrChar = {'a','b','c','d'};
        System.out.println(Arrays.toString(arrChar));
    }
}
