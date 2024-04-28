package ch07;

public class UserInfo {

    // 생성자를 구현해서 사용할 수 있음
    // 클래스에 생성자를 따로 구현하면 기본 생성자는 제공되지 않음
    // 생성자를 호출하는 코드에서 여러 생성자중 필요에 따라 호출해서 사용할 수 있음

    public String userId;
    public String userPassWord;
    public String userName;
    public String userAddress;
    public String phoneNumber;


    public UserInfo(){}  //기본 생성자

    //만든 생성자
    public UserInfo(String userId, String userPassword, String userName){
        this.userId = userId;
        this.userPassWord = userPassword;
        this.userName = userName;
        // this.멤버 변수 = 매개변수;
    }

    public String showUserInfo(){
        return "고객님의 아이디는" + userId + "이고, 등록된 이름은" + userName + "입니다";
    }
}
