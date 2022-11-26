public class Main {
    public static void main(String[] args) {
        String message = "Zero To Junior"; //obrabiany tekst
        int length = message.length(); //długość tekstu - przyda się kilka razy

        //Odpowiedzialność reszty metody main ograniczono do wydrukowania wyszukanych substringów
        System.out.println(message  + "\n");
        System.out.println("Cztery pierwsze znaki: " + subString(message, 0, 4));
        System.out.println("Pięć ostatnich znaków: " + subString(message, length-5, length));
        System.out.println("Od \"To\" do końca: " + subString(message, whereToIs(message, "To"), length));
        System.out.println("Znaki od 3 do 8: " + subString(message, 3-1, 8));
    }

    public static String subString(String text, int start, int end) {
        //metoda zastępująca metodę "substring" klasy String
        char[] textArray = text.toCharArray();
        String textSub = "";
        for(int i = 0; i < end - start; i++) textSub = textSub + textArray[i + start];
        return textSub;
    }

    public static int whereToIs(String text, String partText) {
        //metoda znajduje partText w text i zwraca pozycję jego początku
        int whereToIs = -1;
        String currentText;
        do {
            whereToIs++;
            currentText = subString(text, whereToIs, whereToIs+2);

        }
        while(!currentText.equals(partText));
        return whereToIs;
    }
}