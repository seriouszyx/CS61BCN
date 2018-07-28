/**
 * @ClassName OffByOne
 * @Description TODO
 * @Author Yixiang Zhao
 * @Date 2018/7/28 20:27
 * @Version 1.0
 */
public class OffByOne implements CharacterComparator{

    @Override
    public boolean equalChars(char x, char y) {
        int diff = x - y;
        return Math.abs(diff) == 1 ? true : false;
    }
}
