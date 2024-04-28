package ch08_review;

public class Person {

    public int height;
    public int weight;
    public String sex;
    public String name;
    public int age;

    public Person(){} // 기본 생성자

    public Person(int height, int weight, String sex, String name, int age){
        this.height = height;
        this. weight = weight;
        this. sex = sex;
        this. name = name;
        this. age = age;


    }
    public String showPerson(){
        return "키가" + height + "이고 몸무게가 " + weight +"킬로인 " + sex +"이 있습니다. 이름은"
                + name +"이고 나이는" + age +"세 입니다";
    }
}
