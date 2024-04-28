package ch06;

import java.util.ArrayList;

class Animal{

    public void move(){
        System.out.println("동물이 움직입니다");
    }

    //공통적으로 사용하는 메서드가 있으면 그냥 상위 클래스에 선언하면 된다
    public void eating(){
        System.out.println("뭘 먹습니다");
    }
}

class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다");
    }
    public void readBook(){
        System.out.println("사람이 책을 읽습니다");
    }
}

class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다");
    }
    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다");
    }
}

class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아 다닙니다");
    }
    public void flying(){
        System.out.println("독수리가 양날개를 펴고 날아다닙니다");
    }
}

public class AnimalTest {
    public static void main(String [] args){

        //상위클래스로 형변환 ( 업캐스팅)
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();

        //코드는 한줄인데 어떤 인스턴스형이 들어갔느냐에 따라 출력이 달라짐
        // -> 다형성
        // 상속했고, 메서드를 오버라이딩했고, 상위클래스로 형변환을 함
        //상속을 하게되면 하위클래스들을 상위 클래스타입으로 다 핸들링할 수 있음
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);


        // 객체배열 타입, 다 animal 타입이라 animal로 선언하고 다 넣을 수 있음
        // 확장때문
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for(Animal animal : animalList){
            animal.move();
            //이것도 같은 코드한 줄이지만 어떤 animal인지에 따라 출력값이 다름
            // 다형성
        }
    }

    // AnimalTest클래스의 메서드
    public void moveAnimal(Animal animal){
        animal.move();
    }
}
