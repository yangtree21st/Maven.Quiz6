package rocks.zipcode.io.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
//import org.apache.commons.net.ftp.FTPClient;
/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        int [] myArray = new int[end - start  ];

        myArray = IntStream.range(start, end+1).toArray();
        Integer[] what = Arrays.stream( myArray ).boxed().toArray( Integer[]::new );
        return what;

    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {

        char[] newArray = new char[array.length];
        for (int i = 0; i <array.length ; i++) {
            newArray[i] = array[i];
        }
        return newArray;

    }


    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        Character [] newArray = new Character[array.length];
        for (int i = 0; i <array.length ; i++) {
            newArray[i] = array[i];
        }
        return newArray;


    }
}
