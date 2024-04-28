package ch07;

public class UserInfoTest {

    public static void main (String[] args){

        //기본 생성자 사용
        // 일일히 멤버 변수 설정해줌
        UserInfo userLee = new UserInfo();
        userLee.userId = "a12345";
        userLee.userPassWord = "zxcbn12345";
        userLee.userName = "Lee";
        userLee.phoneNumber = "01034556699";
        userLee.userAddress = "Seoul, Korea";
        System.out.println(userLee.showUserInfo());

        //만들어진 생성자 사용
        UserInfo userKim = new UserInfo("b12345", "0976mbvc", "kim");
        System.out.println(userKim.showUserInfo());

        // 생성자 여러개중 골라 쓰는 것 -> 생성자 오버로딩
        // 기본생성자와 만들어진 생성자중 원하는걸로 골라 씀;


    }
}
