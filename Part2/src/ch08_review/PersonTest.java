package ch08_review;

public class PersonTest {
    public static void main(String [] args){

        Person Tomas = new Person();
        Tomas.height = 180;
        Tomas.weight = 78;
        Tomas.sex = "남성";
        Tomas.name = "Tomas";
        Tomas.age =37;

        System.out.println(Tomas.showPerson());

        Person Charlie = new Person(180, 78, "남성", "Charlie", 24);
        System.out.println(Charlie.showPerson());
    }
}
