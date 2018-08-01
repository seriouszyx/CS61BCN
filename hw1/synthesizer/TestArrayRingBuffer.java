package synthesizer;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the ArrayRingBuffer class.
 *  @author Yixiang Zhao
 */

public class TestArrayRingBuffer {
    @Test
    public void someTest() {
        ArrayRingBuffer<Double> arb = new ArrayRingBuffer<Double>(4);
        arb.enqueue(33.1);
        arb.enqueue(44.8);
        arb.enqueue(62.3);
        arb.enqueue(-3.4);
        assertEquals(new Double(33.1), arb.peek());
        assertEquals(new Double(33.1), arb.dequeue());
        assertEquals(new Double(44.8), arb.peek());

        arb.enqueue(1.1);
        assertEquals(new Double(44.8), arb.peek());

    }

    /** Calls tests for ArrayRingBuffer. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestArrayRingBuffer.class);
    }
} 
