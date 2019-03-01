import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDup {

    @Test
    public void testDup(){
        Dup dup = new Dup();
        int[] numbers = {1,2,3,3};
        assertEquals("[3]",dup.duplicate(numbers) );
    }

    @Test
    public void testDup2(){
        Dup dup = new Dup();
        int[] numbers = {4,2,3,6,6,2};
        assertEquals("[2, 6]",dup.duplicate(numbers) );
    }

    @Test
    public void testDup3(){
        Dup dup = new Dup();
        int[] numbers = {1};
        assertEquals("[]",dup.duplicate(numbers) );
    }



}
