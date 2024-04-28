package ch08_review;

public class Order {

    String OrderNum;
    String PhoneNumber;
    String Address;
    String OrderDate;
    String OrderTime;
    int Price;
    String MenuNum;

    public Order(String OrderNum, String PhoneNumber, String Address, String OrderDate, String OrderTime, int Price, String MenuNum){
        this.OrderNum = OrderNum;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
        this.OrderDate = OrderDate;
        this.OrderTime = OrderTime;
        this.Price = Price;
        this.MenuNum = MenuNum;
    }

    public void showOrder(){
        System.out.println("주문 접수 번호: " + OrderNum);
        System.out.println("주문 핸드폰 번호: " + PhoneNumber);
        System.out.println("주문 집 주소: " + Address);
        System.out.println("주문 날짜: " + OrderDate);
        System.out.println("주문 시간: " + OrderTime);
        System.out.println("주문 가격: " + Price);
        System.out.println("메뉴 번호: " + MenuNum);
    }
}
