package com.msa4java.edu;

public class E01Variable {
    public static void main(String[] args) {
        //변수선언
        int age;
        age = 1;
        String name = "홍길동";
        char ch ='a';

        // 상수 :  변수 앞에 final 키워드를 붙여서 선언
        final String USER_NAME = "길동이";

        //Underscore 표기법
        int num2 = 200_000_000;

        //두 변수의 값을 스와핑 해보자
        int swap1 = 1;
        int swap2 = 2;
        int tmp;

        tmp = swap2;
        swap2 = swap1;
        swap1 = tmp;

        //데이터 타입 기본형 이 외에는 다 reference type(참조형)
        boolean boo = false;
        byte bt = -128;
        short st = 32767;
        int integer = 2147483647;
        long longer = 2L;

        double db = 3.141592;
        float ft = 3.141592f;

        char ch2 = '1';

    //스트링의 비교
    String str1 = "홍길동";
    String str2 = "홍길동";
    System.out.println(str1.equals(str2));
    }

 }
