import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Test {
    @Test
    public void testRemoveDuplicates() {
        int[][] inputs = {
                // DO NOT REMOVE OR CHANGE THE GIVEN TEST CASES!
                {0, 0, 1, 1, 1, 2, 2, 4, 4, 6},
                {1, 1, 1, 3, 3, 3, 9, 10},
                {-6, -3, -2, -2, -2, -2, 1},
                {7},
                {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE},
                {1, 2},
                {1, 1},
                {}
        };

        int[][] expects = {
                {0, 1, 2, 4, 6},
                {1, 3, 9, 10},
                {-6, -3, -2, 1},
                {7},
                {Integer.MIN_VALUE, Integer.MAX_VALUE},
                {1, 2},
                {1},
                {}
        };

        assertEquals(expects.length, inputs.length);

        for (int i = 0; i < inputs.length; i++) {
            int actualLength = Problem2.remove(inputs[i]);
            String caseId = "case " + i;
            assertEquals(caseId + " output length FAILED", expects[i].length, actualLength);
            for (int j = 0; j < actualLength; j++) {
                assertEquals(caseId + " element comparison FAILED", expects[i][j], inputs[i][j]);
            }
        }
    }
}
