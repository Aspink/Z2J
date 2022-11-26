public class Main {
    public static void main(String[] args) {
        String message = "Zero To Junior";
        int length = message.length();
        System.out.println(message  + "\n");
        System.out.println("Cztery pierwsze znaki: " + subString(message, 0, 4));
        System.out.println("Pięć ostatnich znaków: " + subString(message, length-5, length));
        int whereToIs = 0;
        String text;
        do {
            text = subString(message, whereToIs, whereToIs+2);
            whereToIs++;
        }
        while(!text.equals("To"));
        System.out.println("Od \"To\" do końca: " + subString(message, whereToIs-1, length));
        System.out.println("Znaki od 3 do 8: " + subString(message, 3-1, 8));
    }

    public static String subString(String text, int start, int end) {
        //metoda zastępująca metodę "substring" klasy String
        char[] textArray = text.toCharArray();
        String textSub = "";
        for(int i = 0; i < end - start; i++) textSub = textSub + textArray[i + start];
        return textSub;
    }
}