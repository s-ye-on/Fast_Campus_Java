package ch19prac;

public class CarFactoryTest {
    public static void main(String args[]){

        CarFactory factory = CarFactory.getInstance();

        Car Sonata = factory.createCar();
        Car Genesis = factory.createCar();

        System.out.println(Sonata.getCarNum());
        System.out.println(Genesis.getCarNum());
    }
}
