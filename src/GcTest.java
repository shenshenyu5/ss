import java.lang.ref.SoftReference;

public class GcTest {
    /**
     * testGC()方法执行后objA和objB会不会被GC呢
     */
    public Object instance = null;
    public static final int _1MB=1024*1024;
    /**
     * 这个成员属性的唯一意义就是占点内存，以便能GC日志中看清楚是否被回收过
     */
    private byte[] bigSize = new byte[2*_1MB];
    public static  void testGC(){
        GcTest objA = new GcTest();
        GcTest objB = new GcTest();
        objA.instance = objB;
        objB.instance = objA;

        objA =null;
        objB =null;
        //假设在这行发生的GC，那么objA和objB是否能被回收呢
        System.gc();
    }

    public static void main(String[] args) {

    }
}
