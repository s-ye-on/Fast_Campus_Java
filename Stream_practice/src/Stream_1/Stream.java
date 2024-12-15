package Stream_1;

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String [] args){
        var string = "1,2,3,4,5";
        var split = string.split(",");
        Arrays.stream(split)
                .map(Integer :: parseInt)
                .forEach(System.out::print);

        var strings = List.of("1","2","3","4","5");
        strings.stream()
                .map(Integer::parseInt)
                .forEach(System.out :: println);

        String [] arr = new String[]{"a","b","c"};
        Stream stream = (Stream) Arrays.stream(arr);
    }
}
