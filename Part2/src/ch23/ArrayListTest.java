package ch23;


import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){

        ArrayList<Book> library = new ArrayList<Book>();


        //.add 명령어로 넣고 객체 생성해서 넣기 (new)
        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥2", "조정래"));
        library.add(new Book("태백산맥3", "조정래"));
        library.add(new Book("태백산맥4", "조정래"));
        library.add(new Book("태백산맥5", "조정래"));

        for(int i=0; i<library.size(); i++){
            library.get(i).showInfo();
        }



    }
}
