package prac;

public class Order {
    String orderNum;
    String phoneNum;
    String address;
    int orderDate;
    int orderTime;
    int orderPrice;
    String menuNum;

    public Order(String orderNum, String phoneNum, String address, int orderDate, int orderTime,int orderPrice, String menuNum){
        this.orderNum = orderNum;
        this.phoneNum = phoneNum;
        this.address = address;
        this.orderDate = orderDate;
        this. orderTime = orderTime;
        this. orderPrice = orderPrice;
        this.menuNum = menuNum;
    }

    public void showInfo(){
        System.out.println("주문 접수 번호: " +orderNum);
        System.out.println("주문 핸드폰 번호: " + phoneNum);
        System.out.println("주문 집 주소: " + address);
        System.out.println("주문 날짜: "+orderDate);
        System.out.println("주문 시간: "+ orderTime);
        System.out.println("주문 가격: "+orderPrice);
        System.out.println("메뉴 번호: " + menuNum);
    }
    public static void main(String [] args){
        Order order1 = new Order("202011020003", "01023450001", "서울시 강남구 역삼동 111-333", 20201102, 130258, 35000, "0003");
        order1.showInfo();
    }
}
