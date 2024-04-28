package chap2ch19;

public class CarFactory {

    private static CarFactory instance = new CarFactory();

    //디폴트 생성자 생기지 않게 private으로 만들어줌
    private CarFactory(){

    }

    public static CarFactory getInstance(){
        if(instance == null){
            instance = new CarFactory();
        }

        return instance;
    }
    public Car createCar(){
        Car car = new Car();
        return  car;
    }
}
