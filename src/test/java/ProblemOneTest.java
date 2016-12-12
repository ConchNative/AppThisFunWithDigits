import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemOneTest {

    @Test
    public void testSolve() {

        assertEquals(ProblemOne.solve(new int[] {9,4,2,7,9,0}), 1912);
        
        assertEquals(ProblemOne.solve(new int[] {0,0,0,0,0,0}), 0);

        assertEquals(ProblemOne.solve(new int[] {1,2,1,2,1,2}), 432);
        
        assertEquals(ProblemOne.solve(new int[] {1,1,1,1,1,1}), 222);

        assertEquals(ProblemOne.solve(new int[] {9,1,8,2,7,3}), 1803);
        
        assertEquals(ProblemOne.solve(new int[] {3,2,1,3,2,1,3,2,1}), 36432);
        
        assertEquals(ProblemOne.solve(new int[] {5,1,2,6,8,0}), 1471);
        
        assertEquals(ProblemOne.solve(new int[] {1}), 1);
        
    }

    @Test
    public void testEmptySolve() {
        // default will be zero with initiated variables.
        assertEquals(ProblemOne.solve(new int[] {} ), 0);
    }
    
    @Test
    public void testNullSolve() {
        // added logic to make sure null was caught.
        assertEquals(ProblemOne.solve(null), 0);
    }
}
