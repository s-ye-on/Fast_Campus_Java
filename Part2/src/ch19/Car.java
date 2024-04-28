package ch19;

public class Car {

    private static int serialNum = 10000;
    // 다른곳에서 접근 못하는 시리얼번호 + 정적변수로 사용하여 공통으로 사용할수있게함
    // 다음번호 부여하기 위해 필요하기떄문

    private int carNum;

    public Car (){
        carNum = serialNum;
        serialNum++;
    }
    public int getCarNum(){
        return carNum;
    }
}
