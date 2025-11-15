public class ResetIthBIt {
    public static void main(String[] args) {
        int num = 0b10110110;
        int n = 3;

        int mask = 1 << (n-1);

        num = num & ~mask;
        System.out.println("The number has been reset");
        System.out.println(Integer.toBinaryString(num));
    }
}
