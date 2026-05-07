    package com.msa4java.edu.oop.abstraclass;

    public class Whale extends Mammal{
        public Whale(String name){
            super(name, "바다");
        }
    @Override
        public void residence(){
        String result = String.format("%s %s 에삽니다.",this.name,this.residence);
        System.out.println(result);
    }
        @Override
        public void breath(){
            System.out.println("고래쪽에서 오버라이드");
        }
        public void swimming(){
        System.out.println( this.name + "육중하게 헤엄칩니다.");
    }

    }
