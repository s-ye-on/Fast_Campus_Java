package chap2ch19;

public class CarFactoryTest {
    public static void main(String [] args){

    CarFactory factory = CarFactory.getInstance();
    Car sonata1 = factory.createCar();
    Car sonata2 = factory.createCar();
    Car sonata3 = factory.createCar();
    System.out.println(sonata1.getCarNum());
    System.out.println(sonata2.getCarNum());
    System.out.println(sonata3.getCarNum());

    }
}
