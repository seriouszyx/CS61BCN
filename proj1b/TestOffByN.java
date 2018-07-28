import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * @ClassName TestOffByN
 * @Description TODO
 * @Author Yixiang Zhao
 * @Date 2018/7/28 20:58
 * @Version 1.0
 */
public class TestOffByN {
    static CharacterComparator offByN;

    @Test
    public void testEqualChars() {
        offByN = new OffByN(3);
        assertTrue(offByN.equalChars('a', 'd'));
        assertTrue(offByN.equalChars('g', 'd'));
        assertFalse(offByN.equalChars('a', 'a'));
    }
}
