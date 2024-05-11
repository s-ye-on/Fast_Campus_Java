package ch08;

import java.util.ArrayList;

class Animal{

    public void move(){
        System.out.println("동물이 움직입니다");
    }

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

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        //AnimalTest 클래스의 메서드를 사용하기위해 test를 생성
        // testDownCasting() , moveAnimal()
        AnimalTest test = new AnimalTest();

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for(Animal animal : animalList){
            animal.move();
        }
        System.out.println(); //줄 바꿈
        test.testDownCasting(animalList);
    }

    //ch08

    /**
     * 다운 캐스팅
     * Animal 타입으로 만들어진 객체들 for 문 돌면서 각자 맞는 타입으로 다운캐스팅
     * Human human = (Human) animal;
     * animal이 human 타입이면 animal human 타입으로 다운캐스팅 후 human의 고유메서드 사용
     * animal instance of Tiger
     * animal이 Tiger생성자가 맞는지 확인
     */
    public void testDownCasting(ArrayList<Animal> list){
        for(int i=0; i<list.size(); i++){
            Animal animal = list.get(i);

            if(animal instanceof Human){
                Human human = (Human) animal;
                human.readBook();
            }
            else if(animal instanceof Tiger){
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }
            else if(animal instanceof  Eagle){
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            }
            else{
                System.out.println("unsupported type");
            }
        }
    }

    public void moveAnimal(Animal animal){
        animal.move();
    }
}
