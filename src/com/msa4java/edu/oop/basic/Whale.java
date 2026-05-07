package com.msa4java.edu.oop.basic;

public class Whale {
    //Class는 Field와 Method로 구성되어 있다.
    public String name = "고래"; // field
    public static int age = 20;

    public void swimming() {
        System.out.println("고래가 헤엄칩니다.");  // Method
        }
    public static void breath(String str) {
        System.out.println(str + "고래는 폐호흡을 함");
        // 여기서 str이 파라미터(매개변수), 아규먼트를 저장하는 변수
       }
    }

