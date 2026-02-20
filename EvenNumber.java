import java.util.ArrayList;

public class EvenNumber {
    public static void main(String[] args) {

        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                evens.add(i);
            } else {
                odds.add(i);
            }
        }

        System.out.println("Even Numbers: " + evens);
        System.out.print("Minimum Three Even Numbers: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(evens.get(i) + " ");
        }
        System.out.println();

        System.out.print("Maximum Three Even Numbers: ");
        for (int i = evens.size() - 3; i < evens.size(); i++) {
            System.out.print(evens.get(i) + " ");
        }
        System.out.println();

        int evenSum = 0;
        for (int num : evens) {
            evenSum += num;
        }
        double evenAvg = (double) evenSum / evens.size();
        System.out.println("Average of Even Numbers: " + evenAvg);

        System.out.println();

        System.out.println("Odd Numbers: " + odds);
        System.out.print("Minimum Three Odd Numbers: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(odds.get(i) + " ");
        }
        System.out.println();

        System.out.print("Maximum Three Odd Numbers: ");
        for (int i = odds.size() - 3; i < odds.size(); i++) {
            System.out.print(odds.get(i) + " ");
        }
        System.out.println();

        int oddSum = 0;
        for (int num : odds) {
            oddSum += num;
        }
        double oddAvg = (double) oddSum / odds.size();
        System.out.println("Average of Odd Numbers: " + oddAvg);
    }
}