package ch03;

public class CustomerTest {
    public static void main(String[] args){

        /*
        Customer customerLee = new Customer();
        customerLee.setCustomerName("Lee");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());
         */


        // VIPCustomer() 가 생기기전에 Customer()가 먼저 생김
        // 그렇기에 Customer()에 있는 customerName과 customerID 사용 가능

        /*
        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("Kim");
        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;

        //디폴트 컨스트럭터
         */
        Customer customerLee = new Customer(10010, "Lee");
        VIPCustomer customerKim = new VIPCustomer(10020, "Kim");

        System.out.println(customerLee.showCustomerInfo());

        //이 메서드는 customer 메서드지만 상속을 받았기때문에 사용가능
        System.out.println(customerKim.showCustomerInfo());

        //업캐스팅
        Customer vc = new VIPCustomer(12345, "noname");
        //VIPCustomer로 생성했지만 Customer타입으로 대입함 -> 형변환
        //Customer로 형변환이 됐기에 Customer의 메서드만 사용할 수 있다
        // 변수는 자기 타입것만 사용한다!!

    }
}
