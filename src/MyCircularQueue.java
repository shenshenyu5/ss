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
     * �����Ƿ�Ϊ��
     * @return
     */
    public boolean isEmpty() {
        return d_start>=data.size();
    }

    /**
     * �����Ƿ�����
     * @return
     */
    public boolean isFull() {
        return  d_tail-d_start == data.size()-1;
    }

    /**
     * ��ȡ����Ԫ��
     * @return
     */
    public int Front() {
        return data.get(d_start);
    }

    /**
     * ��ȡ��βԪ��
     * @return
     */
    public int Rear() {
        return data.get(d_tail);
    }


}
