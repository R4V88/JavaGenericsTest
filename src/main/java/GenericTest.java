import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class GenericTest {

    public static void main(String[] args) throws IOException {
        Pair<String, String> stringStringPair = new Pair<String, String>();
        stringStringPair.setLeftContent("Kurwa, ");
        stringStringPair.setRightContent("no nie");

        Pair<String, Integer> stringIntegerPair = new Pair<String, Integer>();
        stringIntegerPair.setLeftContent("Licze do ");
        stringIntegerPair.setRightContent(3);

        Pair<String, Double[]> stringDoubleArrPair = new Pair<String, Double[]>();
        stringDoubleArrPair.setLeftContent("1 ");
        Double[] doubles = new Double[2];
        int j = 0;
        for(int i = 2; i < 4; i++){
            doubles[j] = (double) i;
            j++;
        }
        stringDoubleArrPair.setRightContent(doubles);

        System.out.println(stringStringPair.getLeftContent() + "" + stringStringPair.getRightContent());
        System.out.println(stringIntegerPair.getLeftContent() + "" + stringIntegerPair.getRightContent());
        System.out.println(stringDoubleArrPair.getLeftContent() + "" + Arrays.toString(stringDoubleArrPair.getRightContent()));
    }
}
