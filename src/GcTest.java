import java.lang.ref.SoftReference;

public class GcTest {
    /**
     * testGC()����ִ�к�objA��objB�᲻�ᱻGC��
     */
    public Object instance = null;
    public static final int _1MB=1024*1024;
    /**
     * �����Ա���Ե�Ψһ�������ռ���ڴ棬�Ա���GC��־�п�����Ƿ񱻻��չ�
     */
    private byte[] bigSize = new byte[2*_1MB];
    public static  void testGC(){
        GcTest objA = new GcTest();
        GcTest objB = new GcTest();
        objA.instance = objB;
        objB.instance = objA;

        objA =null;
        objB =null;
        //���������з�����GC����ôobjA��objB�Ƿ��ܱ�������
        System.gc();
    }

    public static void main(String[] args) {

    }
}
