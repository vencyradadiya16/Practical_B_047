public class HalfPyramid {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}