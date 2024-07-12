public class Car {
    String name;
    static int carCnt;

    public Car(String name){
        this.name = name;
        carCnt++; // 카 개체 생성 시 카운트 추가
    }

    public static void main(String[] args) {

        System.out.println("현재 자동차의 대수 : " + Car.carCnt);

        Car a = new Car("현대");
        Car b = new Car("기아");

        System.out.println("현재 자동차의 대수 : " + Car.carCnt);
        System.out.println(a.carCnt); // 객체를 통해서도 접근이 가능하나 클래스를 통한 접근이 원칙
        carCnt = 4;
        System.out.println(a.carCnt); // static 변수의 값을 변경하고 다른 객체에 접근했을때 변경된 값을 확인할 수 있음
    }
}
/*
현재 자동차의 대수 : 0
현재 자동차의 대수 : 2
2
4
*/
