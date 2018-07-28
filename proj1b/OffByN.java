/**
 * @ClassName OffByN
 * @Description TODO
 * @Author Yixiang Zhao
 * @Date 2018/7/28 20:54
 * @Version 1.0
 */
public class OffByN implements CharacterComparator{

    private int N;

    public OffByN(int N) {
        this.N = N;
    }

    @Override
    public boolean equalChars(char x, char y) {
        int diff = x - y;
        return Math.abs(diff) == N ? true : false;
    }

}
