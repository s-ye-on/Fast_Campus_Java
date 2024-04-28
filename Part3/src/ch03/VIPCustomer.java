package ch03;

public class VIPCustomer extends Customer {
        //Customer 클래스 확장
        // 담당상담원 + 할인율 더 큼

    private String agentID;
    double saleRatio;


    // 상위클래스의 디폴트컨스트럭터 없고 다른 컨스트럭터가 있음
    // 상위 클래스를 내가 명시적으로 호출해야함 ( 직접 호출해야함)
    /*
    public VIPCustomer(){

        // super(0, null); 내가 VIPCustomer 디폴트 컨스트럭터 사용하고싶은 경우 씀
        bonusRatio = 0.05;
        saleRatio = 0.01;
        customerGrade = "VIP";

        //상속을 받기때문에 상위 클래스 생성자 호출하는 코드 없어도 컴파일러가
        // super(); 코드를 넣어줌
        // super(); 키워드는 하위클래스가 상위 클래스의 인스턴스 참조값을 가지게 됨

        System.out.println("VIPCustomer() call");
    }

     */

    //상위 클래스 컨스트럭터랑 모양 맞춰주기
    public VIPCustomer(int customerID, String customerName){
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

        System.out.println("VIPCustomer(int, String) call");
    }
    public String getAgentID(){
        return agentID;
    }

}
