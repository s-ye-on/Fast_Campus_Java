package SingletonPattern;

//싱글톤 패턴
// - 프로그램에서 인스턴스가 단 한개만 생성되어야 하는 경우 사용하는 디자인 패턴
// - static 변수, 메서드를 활용하여 구현할 수 있음

public class Company {


    //유일한 인스턴스 (하나만 있을거라 static) 유일한 객체
    private static Company instance= new Company();



    //싱글톤 패턴에서는 외부에서 컴퍼니를 마음대로 생성할 수 없도록
    // 생성자를 하나 제공 (private 으로) (생성자 만들어줘서 컴파일러가 생성자 제공x)
    private Company(){

    }

    // 유일한 객체 외부에서 쓸 수 있도록하기위한
    // 일반 메서드면 인스턴스를 생성하고 그 다음에 이 메서드를 호출 할 수 있음
    // 그렇기에 static으로 선언
    // 그래야 외부에서 클래스 이름으로 이 메서드를 호출 할 수 있음
    public static Company getInstance(){
        if(instance ==null){
            instance = new Company();
        }

        return instance;
    }
}
