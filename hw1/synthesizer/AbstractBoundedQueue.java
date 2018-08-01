package synthesizer;

/**
 * @ClassName AbstractBoundedQueue
 * @Description TODO
 * @Author Yixiang Zhao
 * @Date 2018/8/1 18:44
 * @Version 1.0
 */
public abstract class AbstractBoundedQueue<T> implements BoundedQueue<T> {
    protected int fillCount;
    protected int capacity;
    public abstract T peek();
    public abstract T dequeue();
    public abstract void enqueue(T x);
}
