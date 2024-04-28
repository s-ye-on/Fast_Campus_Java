package ch12;

public class Person {

    //12. 객체 자신을 가리키는 this

    String name;
    int age;

    public Person(){
        //디폴트 생성자
        //아무런 값이 안들어왔을 땐 초기화를 시켜주고싶음
        this("이름없음", 1);
        //생성자에서 다른 생성자 호출 (아래 생성자를 호출함)
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void showPerson(){
        System.out.println(name + ", " + age);
    }
    public Person getPerson(){
        return this;
    }

    public static void main(String args[]){
        Person person = new Person(); // 디폴트 생성자 불림

        person.showPerson();

        //클래스 이름과 jvm이 정해준 인스턴스의 주소
        System.out.println(person);

        System.out.println(person.getPerson());

        //사람 하나 더 추가하지만 처음 사람의 값을 넣어줌
        Person person2 = person.getPerson();
        System.out.println(person2); // 첫번째 주소랑 똑같이 나옴
    }
}
