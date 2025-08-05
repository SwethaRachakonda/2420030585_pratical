public class operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        a++;
        b--;
        System.out.println(a);
        System.out.println(b);

        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println((a > b) && (b < 10));
        System.out.println((a < b) || (b < 10));
        System.out.println(!(a == b));

        int c = (a > b) ? a : b;
        System.out.println(c);

        int x = 4, y = 7;
        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(~x);
        System.out.println(x << 1);
        System.out.println(y >> 1);
    }
}