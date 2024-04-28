package ch22;

public class TwoDimensionTest {
    public static void main(String[] args){


        //2차원 배열


        int [][] arr = {{1,2,3}, {1,2,3,4}};

        for(int i=0; i<arr.length; i++){
            //행의 길이
            for(int j=0; j<arr[i].length; j++){
                //열 출력
                System.out.print(arr[i][j] + ",");
            }
            System.out.println("\t"+ arr[i].length);
        }
    }
}
