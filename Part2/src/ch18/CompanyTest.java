package ch18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String args[]){

        Company company = Company.getInstance();
        //일반 메서드로 선언해놨으면 호출하기위해 메서드를 생성해야함
        //static으로 만들어놨기에 인스턴스 만들지않고 바로 가져다쓸수 있음

        Company company2 = Company.getInstance();
        //static인 경우에는 클래스 이름을 가져다 써야함

        System.out.println(company);
        System.out.println(company2);
        //같은 주소가 찍힘

        //Company 외부에서 생성불가 내부에 private으로 하나 생성되어있음
        //getInstance() 메서드 하나만 제공되어있기 때문에 그 메서드로 Company하나만을 사용할 수 있따
        // ==> 싱글톤 패턴

        Calendar calendar = Calendar.getInstance();
        //new가 안됨 달력은 유일한 객체이기에 싱글톤 패턴으로 써야함
        // 유일한 객체를 제공할 때 싱글톤 패턴을 쓴다!!
    }
}
