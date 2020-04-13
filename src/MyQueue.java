import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<Integer> data;
    private int p_start;

    public MyQueue() {
       data = new ArrayList<Integer>();
       p_start = 0;
    }

    /**
     * ����Ƿ�Ϊ��
     * @return
     */
    public boolean isEmpty() {
        return p_start>=data.size();
    }

    /**
     *
     * @param x
     * @return
     */
    public boolean enQueque(int x){
        data.add(x);
        return true;
    }

    public boolean deQueue(){
        if (isEmpty()==true) {
            return  false;
        }
        p_start++;
        return  true;
    }

    /**
     * ���ض�Ӧλ�õ�Ԫ��
     * @return
     */
    public int Front() {
        return data.get(p_start);
    }
}
