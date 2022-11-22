public class Main {
    public static void main(String[] args) {
        String message = "Zero To Junior";
        int length = message.length();

        System.out.println(SubString.subString(message, 0, 4));
        System.out.println(SubString.subString(message, length-5, length));
    }
}