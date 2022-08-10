package com.uni.method.section01;

public class Application7 {

   public static void main(String[] args) {

      int first = 20;
      int second = 10;
      Application7 app7 = new Application7();
         
      System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumbers(first, second));
      System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNumbers(first, second));
      System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNumbers(first, second));
      System.out.println("두 수를 나눈 결과 : " + app7.divideTwoNumbers(first, second));
   }
   public int plusTwoNumbers (int first , int second) { // plusTwoNumbers : 메소드명 
      
      return first + second;
      
   }
   public int minusTwoNumbers (int first , int second) { // int로 던져도 string으로 받기때문에 int로 한다(연산을 위해)
      
      return first - second;
            
   }
   public int multipleTwoNumbers (int first , int second) {
      
      return first * second;
            
   }
   // non static 메소드
   public int divideTwoNumbers (int first , int second) {
      
      return first / second;
            
   }

}