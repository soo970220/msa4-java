package com.msa4java.edu.oop;

public class AccessModifier {
    //접근 제어 지시자 : 외부에서의 접근을 통제하기위해 필드나 메소드 앞에 작성
   public int numPublic = 1; // 클래스 내외부 어디에서나 접근 가능
   protected int numProtected = 2; // 같은패키지 & class내부 & 자식클래스에서 접근가능
   int numDefault = 3; // 같은 패키지에 소속된 클래스에서 접근 가능
   private int numPrivate = 4; // 클래스 내부에서만 접근 가능
}
// accessModifier. 패키지 안 다른 클레스에 이거 적으면 int빼고 나오고 다른 패키지 클래스에 적으면 public만 뜸
// private는 이 클래스안에서만 가능