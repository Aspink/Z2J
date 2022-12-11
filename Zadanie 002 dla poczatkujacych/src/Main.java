import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Integer n1 = 2;
        ArrayList<Integer> listOfInt1 = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 1, 2, 3));
        System.out.println("Pierwotna lista: " + listOfInt1 + ", N = " + n1);
        System.out.println("Lista zwrócona przez \"filter\": " + filter(listOfInt1, n1));
        System.out.println("Pierwotna lista po wywołaniu  \"filter\": " + listOfInt1 +"\n");

        Integer n2 = 1;
        ArrayList<Integer> listOfInt2 = new ArrayList<>(Arrays.asList(20,37,20,21));
        System.out.println("Pierwotna lista: " + listOfInt2 + ", N = " + n2);

        System.out.println("Lista zwrócona przez \"filter\": " + filter(listOfInt2, n2));
        System.out.println("Pierwotna lista po wywołaniu  \"filter\": " + listOfInt2 +"\n");

        Integer n3 = 4;
        ArrayList<Integer> listOfInt3 = new ArrayList<>(Arrays.asList(5,12,5,15,124,15,12,5,124,5,12,15,5,124,124,15,12,15,12,124,5));
        System.out.println("Pierwotna lista: " + listOfInt3 + ", N = " + n3);
        System.out.println("Lista zwrócona przez \"filter\": " + filter(listOfInt3, n3));
        System.out.println("Pierwotna lista po wywołaniu  \"filter\": " + listOfInt3 +"\n");
    }

    public static ArrayList<Integer> filter(ArrayList<Integer> unfiltered, Integer maxRepeats) {
        ArrayList<Integer> filtered = new ArrayList<>(unfiltered);
        Map<Integer, Integer> countNumbers = new HashMap<>();
        Integer count, number;
        int i = 0;
        do {
            number = filtered.get(i);
            count = countNumbers.get(number);
            if (count == null) {
                countNumbers.put(number, 1);
            } else if (count < maxRepeats) {
                    countNumbers.put(number, count+1);
            } else {
                filtered.remove(i);
                i--;
            }
            i++;
        } while (i < filtered.size());
        System.out.println("countNumbers: " + countNumbers);
        return filtered;
    }
}