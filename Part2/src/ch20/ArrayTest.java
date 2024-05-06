package ch20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayTest {
    public static void main(String args[]){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] arr = new int[10];
        int total =0;
        int total2 =0;

        for(int i=0, num=1; i<arr.length; i++){
            arr[i] = num++;
        }
        for(int i=0; i<arr.length; i++){
            total += arr[i];
        }
        //향상된 for
        for(int num : arr){
            total2 += num;
        }
        System.out.println(total);
        System.out.println(total2);


        /**
         * 배열 크기는 5지만 배열이 다 안채워짐
         * dArr.length로 for 문을 돌리면 결과가 0된다
         * 그럴 경우 count 변수 하나 새로 두고 count로 돌리는 방법이 있다
         */
        double [] dArr = new double[5];
        int count =0;

        dArr[0] = 1.1; count ++;
        dArr[1] = 2.1; count ++;
        dArr[2] = 3.1; count ++;

        double mtotal =1;
        for(int i=0; i<count; i++){
            mtotal *=dArr[i];
        }
        System.out.println(mtotal);


        //문자 배열을 만들어 A-Z까지 배열에 저장하고 이를 다시 출력하기

        char[] alphabets = new char[26];
        char ch = 'A';
        for(int i=0; i<alphabets.length; i++){
            alphabets[i] = ch++;
        }
        for(int i=0; i<alphabets.length; i++){
            System.out.println(alphabets[i]+ ", " + (int)alphabets[i]);
        }

    }
}
