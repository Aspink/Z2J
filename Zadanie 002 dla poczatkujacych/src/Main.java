import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        int n1 = 2;
        ArrayList<Integer> listOfInt1 = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 1, 2, 3));
        System.out.println("Pierwotna lista: " + listOfInt1 + ", N = " + n1);
        System.out.println("Lista zwrócona przez \"filter\": " + filter(listOfInt1, n1));
        System.out.println("Pierwotna lista po wywołaniu  \"filter\": " + listOfInt1 +"\n");

        int n2 = 1;
        ArrayList<Integer> listOfInt2 = new ArrayList<>(Arrays.asList(20,37,20,21));
        System.out.println("Pierwotna lista: " + listOfInt2 + ", N = " + n2);

        System.out.println("Lista zwrócona przez \"filter\": " + filter(listOfInt2, n2));
        System.out.println("Pierwotna lista po wywołaniu  \"filter\": " + listOfInt2 +"\n");

        int n3 = 4;
        ArrayList<Integer> listOfInt3 = new ArrayList<>(Arrays.asList(5,12,5,15,124,15,12,5,124,5,12,15,5,124,124,15,12,15,12,124,5));
        System.out.println("Pierwotna lista: " + listOfInt3 + ", N = " + n3);
        System.out.println("Lista zwrócona przez \"filter\": " + filter(listOfInt3, n3));
        System.out.println("Pierwotna lista po wywołaniu  \"filter\": " + listOfInt3 +"\n");
    }

    public static ArrayList<Integer> filter(ArrayList<Integer> unfiltered, int maxRepeats) {
        ArrayList<Integer> filtered = new ArrayList<>(unfiltered);
        int size = filtered.size(), i = 0, j, repeats;
        while (i < size - 1) {
            j = i + 1;
            repeats = 1;
            while (j<size) {
                if(filtered.get(j).equals(filtered.get(i))) {
                    if(repeats >= maxRepeats) {
                        filtered.remove(j);
                        j--;
                        size--;
                    } else {
                        repeats++;
                    }
                }
                j++;
            }
            i++;
        }
        return filtered;
    }
}