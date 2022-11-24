public class Main {
    public static void main(String[] args) {
        String message = "Zero To Junior";
        int length = message.length();
        System.out.println(message  + "\n");
        System.out.println("Cztery pierwsze znaki: " + SubString.subString(message, 0, 4));
        System.out.println("Pięć ostatnich znaków: " + SubString.subString(message, length-5, length));
        int whereToIs = 0;
        String text;
        do {
            text = SubString.subString(message, whereToIs, whereToIs+2);
            whereToIs++;
        }
        while(!text.equals("To"));
        System.out.println("Od \"To\" do końca: " + SubString.subString(message, whereToIs-1, length));
        System.out.println("Znaki od 3 do 8: " + SubString.subString(message, 3-1, 8));
    }
}