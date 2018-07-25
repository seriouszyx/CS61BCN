package Flik;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @ClassName testFliker
 * @Description TODO
 * @Author Yixiang Zhao
 * @Date 2018/7/25 20:23
 * @Version 1.0
 */
public class testFliker {
    @Test
    public void testFlik() {
        Integer a = 1;
        Integer b = 1;
        assertTrue(Flik.isSameNumber(a, b));

        a = 128;
        b = 128;
        assertTrue(Flik.isSameNumber(a, b));

        a = 500;
        b = 500;
        assertTrue(Flik.isSameNumber(a, b));
    }
}
