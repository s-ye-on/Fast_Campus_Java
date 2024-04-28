package ch02;

public class VIPCustomer extends Customer{
        //Customer 클래스 확장
        // 담당상담원 + 할인율 더 큼

    private String agentID;
    double saleRatio;

    public VIPCustomer(){

        bonusRatio = 0.05;
        saleRatio = 0.01;
        customerGrade = "VIP";
    }
    public String getAgentID(){
        return agentID;
    }

}
