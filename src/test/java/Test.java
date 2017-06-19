import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;

/**
 * Created by fmkam on 19.06.2017.
 */
public class Test {

    private static StringReverse stringReverse;

    @BeforeClass
    public static void setUp(){
        stringReverse = new StringReverse();
    }

    @org.junit.Test
    public void test0(){
        String sentence = "123 456 78 910";
        String testResult = stringReverse.reversal(sentence);
        assertEquals("321 654 87 019",testResult );
    }

    @org.junit.Test
    public void test1(){
        String sentence = "Hello my world";
        String testResult = stringReverse.reversal(sentence);
        assertEquals("olleH ym dlrow",testResult );
    }

    @org.junit.Test
    public void test2(){
        String sentence = "";
        String testResult = stringReverse.reversal(sentence);
        assertEquals("",testResult );
    }

    @org.junit.Test
    public void test3(){
        String sentence = "abcdEfG";
        String testResult = stringReverse.reversal(sentence);
        assertEquals("GfEdcba",testResult );
    }

    @org.junit.Test
    public void test4(){
        String sentence = "Say hello to IG";
        String testResult = stringReverse.reversal(sentence);
        assertEquals("yaS olleh ot GI",testResult );
    }
}
