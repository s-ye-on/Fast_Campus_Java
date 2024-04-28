package ch10;

public class BirthDayTest {
    public static void main(String args[]){
        BirthDay date = new BirthDay();
        date.setYear(2019);
        date.setMonth(12); //존재하지않은 월
        date.setDay(30);

        // date.month = 100;
        // private으로 데이터 사용을 막아 잘못된 데이터를 막아줌
        //객체를 사용할 때 오류를 막을 수있다.

        date.showDate();
    }
}
