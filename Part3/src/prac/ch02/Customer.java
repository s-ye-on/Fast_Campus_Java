package prac.ch02;

public class Customer {
    /**
     * 하위 클래스에서 접근할 수 있게 private이 아닌 protected 사용
     */
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }
    public int calculatePrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }
    public String showCustomerInformation(){
        return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint +"입니다";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
