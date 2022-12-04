import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        int n = 2;
        Integer[] tabOfInt = new Integer[]{1, 2, 3, 1, 2, 1, 2, 3};

        int tabLength = tabOfInt.length;
        List<Integer> listOfInt = Arrays.asList(tabOfInt);
        printList(listOfInt);
    }
    public static void printList(List<Integer> listInt) {
        for(int i = 0; i < listInt.size(); i++) {
            System.out.print(listInt.get(i));
        }
    }
    /*public ArrayList<int> filtered(ArrayList<int> unfiltered, int repeats) {

    }*/
}