package com.msa4java.edu.error;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println("트라이 시작");
            double result = 10 / 0 ;
            
            System.out.println("트라이 끝");
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException 에러");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("캐치 들어옴");
            System.out.println(e.getMessage());
            System.out.println("캐치 나감");
        } // Exception이 ArithmeticException이 상위클래스기 때문에 아리스매틱보다 익셉션이 상위에 올수없음
        
        finally {
            System.out.println("파이널리");
        }
    }
}
