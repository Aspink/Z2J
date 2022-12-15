import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Integer n1 = 2;
        ArrayList<Integer> listOfInt1 = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 1, 2, 3));
        System.out.println("\nPierwotna lista: " + listOfInt1 + ", N = " + n1);
        System.out.println("Lista zwrócona przez \"filter\": " + filter(listOfInt1, n1));

        Integer n2 = 1;
        ArrayList<Integer> listOfInt2 = new ArrayList<>(Arrays.asList(20,37,20,21));
        System.out.println("\nPierwotna lista: " + listOfInt2 + ", N = " + n2);
        System.out.println("Lista zwrócona przez \"filter\": " + filter(listOfInt2, n2));

        Integer n3 = 4;
        ArrayList<Integer> listOfInt3 = new ArrayList<>(Arrays.asList(5,12,5,15,124,15,12,5,124,5,12,15,5,124,124,15,12,15,12,124,5));
        System.out.println("\nPierwotna lista: " + listOfInt3 + ", N = " + n3);
        System.out.println("Lista zwrócona przez \"filter\": " + filter(listOfInt3, n3));
    }

    public static ArrayList<Integer> filter(ArrayList<Integer> unfiltered, Integer maxRepeats) {
        ArrayList<Integer> filtered = new ArrayList<>();
        Map<Integer, Integer> countNumbers = new HashMap<>();
        for(Integer number : unfiltered) {
            countNumbers.merge(number, 1, Integer::sum);
            if(countNumbers.get(number) <= maxRepeats) {
                filtered.add(number);
            }
        }
        System.out.println("countNumbers: " + countNumbers);
        return filtered;
    }
}