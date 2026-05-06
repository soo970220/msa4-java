package com.msa4java.edu.oop;

public class MainOOP {
   public static void main(String[] args) {
//   Whale 클래스로 인스턴스 생성
//   Whale whale = new Whale();
//   클래스이름 , 변수이름(소문자) = Whale클래스의 객체를 생성함
//   System.out.println(whale.name);
//   whale.swimming();
//   System.out.println(Whale.age);
   Whale.breath("테스트"); // 여기서 테스트가 인수(아큐먼투), 메소드 호출시 전달되는 값
      //접근 제어 지시자 확인용
       AccessModifier accessModifier = new AccessModifier();
      // accessModifier.numPublic(){}

       //오버로딩 테스트
       Overloading overloading = new Overloading();
       overloading.print('c');
       overloading.print(1,2 );
   }
}
