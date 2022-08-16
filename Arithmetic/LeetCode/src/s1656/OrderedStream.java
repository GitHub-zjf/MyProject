package s1656;

import java.util.ArrayList;
import java.util.List;

class OrderedStream {

    String[] elements;
    int ptr;

    public OrderedStream(int n) {
        elements = new String[n];
        ptr = 0;
    }

    public List<String> insert(int idKey, String value) {
        elements[idKey - 1] = value;
        List<String> list = new ArrayList<>();
        for (int i = idKey - 1; i < elements.length; i++) {
            if (i == ptr && elements[i] != null) {
                list.add(elements[i]);
                ptr = i + 1;
            } else {
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        OrderedStream obj = new OrderedStream(5);
        List<String> param_1 = obj.insert(3, "ccccc");
        System.out.println(param_1.get(0));
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */