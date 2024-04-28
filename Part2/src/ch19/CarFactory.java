package ch19;

public class CarFactory {


    private static CarFactory instance = new CarFactory();
    //예를 들어 현대는 전세계 하나뿐인 회사, 정적으로 만들어줘서
    // ==> 인스턴스가 단 하나만 생성되어야하는 경우
    //싱글톤 패턴 사용하기 위함

    private CarFactory(){
        //다른 생성자 생성되지 않도록 private으로 하나 만들어줌
    }


    //private static 으로 만들어줬으니 불러올수 있는 메서드 하나 만들어줌
    //위에서 static으로 만들었으니 static은 유지 public으로 공개만
    public static CarFactory getInstance(){
        if(instance == null){
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar(){
        Car car = new Car();
        return car;
    }
}
