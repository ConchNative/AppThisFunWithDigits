import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemOneTest {

    @Test
    public void testSolve() {

        assertEquals(ProblemOne.solve(new Integer[] {9,4,2,7,9,0}), 1912);
        
        assertEquals(ProblemOne.solve(new Integer[] {0,0,0,0,0,0}), 0);

        assertEquals(ProblemOne.solve(new Integer[] {1,2,1,2,1,2}), 432);
        
        assertEquals(ProblemOne.solve(new Integer[] {1,1,1,1,1,1}), 222);

        assertEquals(ProblemOne.solve(new Integer[] {9,1,8,2,7,3}), 1803);
        
        assertEquals(ProblemOne.solve(new Integer[] {3,2,1,3,2,1,3,2,1}), 36432);
        
        assertEquals(ProblemOne.solve(new Integer[] {5,1,2,6,8,0}), 1471);
        
        assertEquals(ProblemOne.solve(new Integer[] {1}), 1);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testNullSolve() {
        ProblemOne.solve(null);
    }
}