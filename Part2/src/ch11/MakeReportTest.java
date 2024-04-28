package ch11;

public class MakeReportTest {
    public static void main(String args[]){
        MakeReport builder = new MakeReport();
        String report = builder.getReport();

        System.out.println(report);

        //MakeReport 클래스에 다른 메서드들이 있지만
        //획일적인 출력을 위해서는 하나하나 순서대로해줘야함
        // getReport() 메서드로 정형화해주고 다른것들은 private으로 선언하여
        // 접근할 수 없게함 -> 캡슐화
        //이 메서드나 필드를 외부에 제공할 것이냐 말것이냐 생각
        
    }
}
