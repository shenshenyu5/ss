import java.util.ArrayList;
import java.util.List;

public class MyCircularQueue {
    private List<Integer> data;
    private int d_start;
    private int d_tail;
    public MyCircularQueue(int x) {
        data = new ArrayList<Integer>(x);
        d_start = 0;
        d_tail = 0;
    }

    /**
     * 队列是否为空
     * @return
     */
    public boolean isEmpty() {
        return d_start>=data.size();
    }

    /**
     * 队列是否已满
     * @return
     */
    public boolean isFull() {
        return  d_tail-d_start == data.size()-1;
    }

    /**
     * 获取队首元素
     * @return
     */
    public int Front() {
        return data.get(d_start);
    }

    /**
     * 获取队尾元素
     * @return
     */
    public int Rear() {
        return data.get(d_tail);
    }


}
