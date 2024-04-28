package ch06;

public class VIPCustomer extends Customer {
        //Customer 클래스 확장
        // 담당상담원 + 할인율 더 큼

    private String agentID;
    double saleRatio;

    public VIPCustomer(int customerID, String customerName){
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

    }

    //오버라이드된 메서드라 메서드 이름이 다르면 안됨
    @Override
    public int calcPrice(int price) {
        bonusPoint += price*bonusRatio;
        price -= (int)(price * saleRatio);
        return price;
    }

    public String getAgentID(){
        return agentID;
    }

}
