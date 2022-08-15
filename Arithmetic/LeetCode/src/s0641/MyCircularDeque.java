package s0641;

class MyCircularDeque {
/*
    public int[] elements;
    public int size = 0, head = 0, tail;

    public MyCircularDeque(int k) {
        elements = new int[k];
        tail = k - 1;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        elements[head = head == 0 ? elements.length - 1 : head - 1] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        elements[tail = tail == elements.length - 1 ? 0 : tail + 1] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        head = head == elements.length - 1 ? 0 : head + 1;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        tail = tail == 0 ? elements.length - 1 : tail - 1;
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return elements[head];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return elements[tail];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }
*/

    int[] nums;
    int he, ta, cnt, k;

    public MyCircularDeque(int _k) {
        k = _k;
        nums = new int[k];
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        he = (he + k - 1) % k;
        nums[he] = value;
        cnt++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        nums[ta++] = value;
        cnt++;
        ta %= k;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        he = (he + 1) % k;
        cnt--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        ta = (ta + k - 1) % k;
        cnt--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : nums[he];
    }

    public int getRear() {
        return isEmpty() ? -1 : nums[(ta + k - 1) % k];
    }

    public boolean isEmpty() {
        return cnt == 0;
    }

    public boolean isFull() {
        return cnt == k;
    }

    public static void main(String[] args) {
        int k = 10;
        MyCircularDeque obj = new MyCircularDeque(k);
        boolean param_1 = obj.insertFront(1);
        obj.insertFront(2);
        obj.insertFront(3);
        boolean param_2 = obj.insertLast(4);
        obj.insertLast(5);
        obj.insertLast(6);
        boolean param_3 = obj.deleteFront();
        boolean param_4 = obj.deleteLast();
        int param_5 = obj.getFront();
        int param_6 = obj.getRear();
        boolean param_7 = obj.isEmpty();
        boolean param_8 = obj.isFull();
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */