package prac.ch19_prac;

public class CarFactoryTest {
    public static void main(String[] args){


        CarFactory hyundai = CarFactory.getInstance();
        Car sonata1 = hyundai.createCar();
        Car sonata2 = hyundai.createCar();

        System.out.println(sonata1.getCarNum());
        System.out.println(sonata2.getCarNum());
    }
}
