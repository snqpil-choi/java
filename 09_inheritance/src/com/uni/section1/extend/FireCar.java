package com.uni.section1.extend;

public class FireCar extends Car {

   public FireCar() {
      // 묵시적으로 super(); 가 호출되어 있다. 명시적으로 해도되고 안해도 된다.
      System.out.println("FireCar 클래스 기본생성자가 호출됨");

   }

   /*
    * @Override 어노테이션 JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를
    * 발생시킨다. (오버라이딩이 정상적으로 작성된 것인지를 체크해주는 기능)
    */

   // 평소에는 car에서 작성해놓은 메소드를 바라보고 있다가 override를 만나면 동적으로 override한 내역을 바라보게 된다.
   // 실행했을때 재정의 된 것을 바라보게 된다.!
   @Override
   public void soundHorn() {
      // TODO Auto-generated method stub
      if (isRunning()) {
         System.out.println("빠아아아아아아아아앙!");
      } else {
         System.out.println("소방차가 앞으로 갈 수 없습니다. 비키세요!!");
      }
   }
   public void sprayWater() {
      System.out.println("불이난 곳을 발견했습니다. 물을 뿌립니다!!");
   }

}