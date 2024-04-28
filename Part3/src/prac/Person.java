package prac;

public class Person {
    int height;
    int weight;
    String name;
    String sex;
    int age;

    public Person(int height, int weight, String name, String sex, int age){
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.sex = sex;
        this.age = age;


    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void showInfo(){
        System.out.println("키가" + height +" 이고 몸무게가 "+weight +"킬로인 남성이 있습니다");
        System.out.println("이름은" + name + "이고 나이는 "+age +"입니다" );
    }
    public static void main(String [] args){
        Person personT = new Person(180, 78, "Tomas","남성",37);
        personT.showInfo();
    }
}
