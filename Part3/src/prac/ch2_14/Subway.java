package prac.ch2_14;

public class Subway {

    int lineNum;
    int income;
    int passenger;

    public Subway(int lineNum){
        this.lineNum = lineNum;
        income =0;
        passenger =0;
    }
    public void take(int money){
        income += money;
        passenger++;
    }
    public void showSubwayInfo(){
        System.out.println(lineNum +"호선의 수입은" + income + "이고 승객수는" +passenger);
    }
}
