package ch21;

public class ObjectCopyTest {
    public static void main(String[] args){


        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        //배열 복사
        System.arraycopy(library, 0, copyLibrary, 0, 5);


//        System.out.println("=======library========");
//        for(Book book : library){
//            System.out.println(book);
//            book.showInfo();
//        }
//
//        System.out.println("=====copy library=====");
//        for(Book book : copyLibrary){
//            System.out.println(book);
//            book.showInfo();
//        }
        //배열 얕은 복사라 주소랑 값 둘 다 같음


        //본 배열뿐만 아니라 복사배열도 바뀜


        //얕은 복사

        library[0].setAuthor("박완서");
        library[0].setTitle("나목");

        System.out.println("=======library========");
        for(Book book : library){
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("=====copy library=====");
        for(Book book : copyLibrary){
            System.out.println(book);
            book.showInfo();
        }
    }
}
