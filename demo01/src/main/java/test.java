/**
 * @author 胡金龙
 * @create 2022-03-15 16:22
 */
public class test {
    class Super {

        int flag = 1;

        Super() {
            test();
        }

        void test() {
            System.out.println("Super.test() flag=" + flag);
        }
    }
    class Sub extends Super {

        Sub(int i) {
            flag = i;
            System.out.println("Sub.Sub()flag=" + flag);
        }
        void test() {
            System.out.println("Sub.test()flag=" + flag);
        }
    }
    public static void main(String[] args) {
        new test().new Sub(5);
        boolean result = false;
        System.out.println(result);
    }
}