package SingletonPattern;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String [] args){

        // 일반 메서드로 선언해놨다면 getInstance()사용하기위해 인스턴스 하나 만들어야함
        // 만들지 않고 바로 갖다 쓰려면 static 메서드로 제공되어야함
        //static인 경우 클래스 이름으로 가져다 써야함

        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);
        //jvm이 할당해준 힙 메모리 주소 같음!!

        //company는 외부에서 생성할수 없고 내부에 private으로 선언되어있고
        //getInstance() 메서드로 company 하나만 사용할 수 있다

        //유일한 객체를 제공할 때 싱글톤 패턴을 쓴다

        // calendar도 new해서 인스턴스 생성이 아닌 getInstance로 유일한거 부름
        Calendar calendar = Calendar.getInstance();
    }
}
