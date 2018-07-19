public class LinkedListDeque <T> {
    private class TNode {
        public T item;
        public TNode prev;
        public TNode next;
        public TNode(T x, TNode p, TNode n) {
            item = x;
            prev = p;
            next = n;
        }
    }

    private TNode sentinel;
    private int size;

    public LinkedListDeque () {
        sentinel = new TNode((T)"null", null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }

    public LinkedListDeque(T item) {
        sentinel = new TNode((T)"null", null, null);
        sentinel.next = new TNode(item, sentinel, sentinel);
        sentinel.prev = sentinel.next;
        size = 1;
    }

    public int size() {
        return size;
    }

    public void addFirst(T item) {
        sentinel.next = new TNode(item, sentinel, sentinel.next);
        sentinel.next.next.prev = sentinel.next;
        size += 1;
    }

    public void addLast(T item) {
        sentinel.prev = new TNode(item, sentinel.prev, sentinel);
        sentinel.prev.prev.next = sentinel.prev;
        size += 1;
    }

    public boolean isEmpty() {
        if (0 == size) {
            return true;
        }
        return false;
    }

    public void printDeque() {
        TNode ptr = sentinel;
        while (ptr.next != sentinel) {
            ptr = ptr.next;
            System.out.print(ptr.item);
            System.out.print(" ");
        }
        System.out.println();

    }

    public T removeFirst() {
        if (0 == size) {
            return null;
        }
        size -= 1;
        T res = sentinel.next.item;
        sentinel.next = sentinel.next.next;
        sentinel.next.prev = sentinel;
        return res;
    }

    public T removeLast() {
        if (0 == size) {
            return null;
        }
        size -= 1;
        T res = sentinel.prev.item;
        sentinel.prev.prev.next = sentinel;
        sentinel.prev = sentinel.prev.prev;
        return res;
    }

    public T get(int index) {
        int count = 0;
        TNode ptr = sentinel;
        while (ptr.next != sentinel) {
            ptr = ptr.next;
            if (count == index) {
                return ptr.item;
            }
            count++;
        }
        return null;
    }

    public T getRecursiveHelper(int index, int count, TNode ptr) {
        if (index == count) {
            return ptr.item;
        }
        return getRecursiveHelper(index, count+1, ptr.next);
    }

    public T getRecursive(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        int count = 0;
        TNode ptr = sentinel.next;
        return getRecursiveHelper(index, count, ptr);
    }

}