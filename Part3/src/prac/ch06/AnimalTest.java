package prac.ch06;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다");
    }
}
class Human extends Animal{
    @Override
    public void move(){
        System.out.println("사람이 두 발로 걷습니다");
    }
    public void readBook(){
        System.out.println("사람이 책을 읽습니다");
    }
}
class Tiger extends Animal{
    @Override
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다");
    }
    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다");
    }
}
class Eagle extends Animal{
    @Override
    public void move(){
        System.out.println("독수리가 하늘을 날아 다닙니다");
    }
    public void flying(){
        System.out.println("독수리가 양 날개를 쭉 펴고 날아다닙니다");
    }
}
public class AnimalTest {
    public static void main(String [] args){
        Animal humanAnimal = new Human();
        Animal tigerAnimal = new Tiger();
        Animal eagleAnimal = new Eagle();

        /**
         * AnimalTest의 메서드를 사용하기 위해 AnimalTest 인스턴스를 만듬
         */
        AnimalTest test = new AnimalTest();
        test.moveAnimal(humanAnimal);
        test.moveAnimal(tigerAnimal);
        test.moveAnimal(eagleAnimal);

        /**
         * 타입을 Animal로 선언
         * 생성자는 각자 Human Tiger Eagle 사용
         * 각각 move는 오버라이드 됨
         * -> 매개변수 타입이 Animal로 받아서 move를 찍으면 각각 오버라이드 된 메서드가 출력
         * 같은 이름의 메서드지만 출력 값이 다르다
         * moveAnimal 코드는 한 줄이지만 어떤 인스턴스가 들어가느냐에 따라 move의 실행 결과가 달라짐
         * -> 다형성
         * 상속 -> 메서드 오버라이딩 -> 상위 클래스로 형변환 일어남
         * 상속이 일어나면 하위클래스들을 상위 클래스의 타입으로 핸들링가능
         * 클래스가 결합도가 타이트해지므로 신중하게 하자
         */
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(humanAnimal);
        animalList.add(tigerAnimal);
        animalList.add(eagleAnimal);

        for(Animal animal : animalList){
            animal.move();
        }
    }
    public void moveAnimal(Animal animal){
        animal.move();
    }
}
