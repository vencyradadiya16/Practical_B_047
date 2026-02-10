import java.util.ArrayList;

public class EvenNumber{
    public static void main(String[] args) {

        ArrayList<Integer> evens = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evens.add(i);
            }
        }

        System.out.println("Even Numbers: " + evens);
        System.out.println("Minimum Even Number: " + evens.get(0));
        System.out.println("Maximum Even Number: " + evens.get(evens.size() - 1));

        int sum = 0;
        for (int num : evens) {
            sum += num;
        }

        System.out.println("Sum of Even Numbers: " + sum);
    }
}
