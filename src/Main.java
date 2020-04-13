public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueque(5);
        queue.enQueque(3);
        if (queue.isEmpty()==false) {
            System.out.println(queue.Front());
        }
        queue.deQueue();
        if (queue.isEmpty()==false) {
            System.out.println(queue.Front());
        }
        queue.deQueue();
        if (queue.isEmpty()==false) {
            System.out.println(queue.Front());
        }

    }
}
