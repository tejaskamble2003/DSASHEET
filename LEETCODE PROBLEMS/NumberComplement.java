
public class NumberComplement {

    public static int complemntNum(int n) {
        int length = Integer.toBinaryString(n).length();
        int helper = (1 << length)-1;
        return n ^ helper;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(complemntNum(num));
    }
}