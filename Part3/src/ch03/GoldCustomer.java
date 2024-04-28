package ch03;

public class GoldCustomer extends Customer {

    public GoldCustomer(int customerID, String customerName){
        super(customerID, customerName);
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "GOLD";
    }
}
