package ch04;


public class CustomerTest {
    public static void main(String[] args){


        Customer customerLee = new Customer(10010, "Lee");
        VIPCustomer customerKim = new VIPCustomer(10020, "Kim");

        Customer vc = new VIPCustomer(12345, "noname");
        //VIPCustomer로 생성했지만 Customer타입으로 대입함 -> 형변환
        //Customer로 형변환이 됐기에 Customer의 메서드만 사용할 수 있다
        // 변수는 자기 타입것만 사용한다!!


        customerKim.bonusPoint = 10000;
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + price);
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo() + price);

        vc.calcPrice(1000);
        System.out.println(vc.calcPrice(1000)); //900;
        //타입은 Customer 인스턴스는VIP 계산은 어떤걸로 되느냐?
        // 인스턴스타입인 VIP로 계산됨
        // -> 자바의 모든 메서드는 가상 메서드이기 떄문
    }
}
