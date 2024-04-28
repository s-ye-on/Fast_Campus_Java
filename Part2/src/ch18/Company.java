package ch18;

public class Company {

    private static Company instance = new Company(); //유일한 객체

    private Company(){ //private으로 생성자를 만들면 컴파일러 생성자 제공 안함

    }
    public static Company getInstance(){ //일반 메서드면 인스턴스를 생성하고 호출해야함
        // static 으로 선언해주면 외부에서 클래스 이름으로 호출해서 사용할 수 있음
        // 싱글톤 패턴
        if(instance == null){ // 만약 인스턴스가 없는경우 만들어주는 방어적 코드
            instance = new Company();
        }
        return instance;
    }
}
