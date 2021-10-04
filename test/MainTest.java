import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isBalanced(){

        String exp1="( a + b * { c / ( d – e ) } ) + [d / e]";
        boolean actual = Main.isBalanced(exp1);
        assertEquals(actual,true);

        String exp2="( a + b * { c / ( e – d ) )} + [d / e";
        boolean actual1 = Main.isBalanced(exp2);
        assertEquals(actual1,false);

        String exp3=" a + b * { c / ( e – d  )} + [d / e";
        boolean actual2 = Main.isBalanced(exp3);
        assertEquals(actual2,false);

    }
}