package ch06;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    //protected 하위 클래스에서는 접근가능하지만 외부 클래스에선 접근 불가

    int bonusPoint;
    double bonusRatio;

    /*
    public Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        //하위 클래스가 사용되기전에 상위 클래스가 불리나 보기 위한 코드
        System.out.println("Customer() call");

    }

     */
    //디폴트 컨스트럭터 안만들고 컨스트럭터 하나 만듬
    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;

    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
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

    public String showCustomerInfo(){
        return customerName + "님의 등급은" + customerGrade + "이며 보너스 포인트는" + bonusPoint +"입니다";

    }
}
