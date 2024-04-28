package ch02;

public class CustomerTest {
    public static void main(String[] args){

        Customer customerLee = new Customer();
        customerLee.setCustomerName("Lee");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("Kim");
        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;


        //이 메서드는 customer 메서드지만 상속을 받았기때문에 사용가능
        System.out.println(customerKim.showCustomerInfo());

    }
}
