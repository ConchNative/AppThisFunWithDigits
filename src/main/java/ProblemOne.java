import java.util.Arrays;
import java.util.Collections;

/**
 * @author stacydecker
 *
 */
public final class ProblemOne {

    private ProblemOne() {
        /*
         * Notes here. So I'm looking at this from a perspective where conversion of an inbound int array that could be really large
         * and the conversion of it to a List<Integer> for stream processing with a lambda function could have a large overhead.
         * 
         * moved over to Integer as the input to leverage the potential for 8 and lambda processing.
         */
    }

    /**
     * @param digits
     * @return sum of two highest numbers from the given digits
     * @throws an IllegalArgumentException if you pass in a null array.
     */
    public static long solve(Integer[] digits) {
        if (digits == null) {
            throw new IllegalArgumentException("Null digits are not allowed");
        }

        long a = 0;
        long b = 0;

        Arrays.parallelSort(digits, Collections.reverseOrder());

        for (Integer i = 0; i < digits.length; i++) {

            if ((i & 1) == 1) {
                a = a * 10 + digits[i];
            } else {
                b = b * 10 + digits[i];
            }
            
        }
        return a + b;
    }
}