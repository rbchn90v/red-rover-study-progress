public class PowerTwo {
    public static void main(String[] args) {
        power2(1024);
    }

    public static void power2(int num) {
        if ((num > 0) && (num & (num - 1)) == 0) {

            System.out.println("true");

        } else {
            System.out.println("false");
        }
    }
}
