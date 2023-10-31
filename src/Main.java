public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 30; j++) {
                System.out.printf("%-2s", "*");
            }
            System.out.println("");
        }
        for (int d = 0; d <= 20; d++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}