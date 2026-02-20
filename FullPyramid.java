public class FullPyramid {
    public static void main(String[] args) {

        int rows = 5;

        
        for (int i = 1; i <= rows + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j < i) {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }

      
        int num = 1;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;

                if (num > 9) {
                    num = 1;
                }

                if (j < i) {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }
}