import java.util.Arrays;

/**
 * @author stacydecker
 *
 */
public class ProblemOne {

    /**
     * 
     */
    private ProblemOne() {
    }

    /**
     * @param digits
     * @return sum of two highest numbers from the given digits
     */
    public static long solve(int[] digits) {

        long a = 0;
        long b = 0;

        if (digits != null) {
            // error check thoughts
            // negative numbers ?
            // empty array
            // 1 element in array
    
            Arrays.sort(digits);
            
    
            for (int i = digits.length - 1; i >= 0; i--) {
                
                if ((i & 1) == 1) {
                    // TODO this can be a function.
                    a = a * 10 + digits[i];
                } else {
                    b = b * 10 + digits[i];
                }
            }
        }
        return a + b;
    }
}
