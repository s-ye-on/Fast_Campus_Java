package prac.ch02;

public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;

    public VIPCustomer(){
        bonusRatio =0.05;
        saleRatio = 0.1;
        customerGrade = "VIP";
    }
    public int getAgentID(){
        return agentID;
    }
}
