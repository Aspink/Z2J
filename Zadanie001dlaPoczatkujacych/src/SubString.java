public class SubString {
    public static String subString(String text, int start, int end) {
        char[] textArray = text.toCharArray();
        String textSub = "";
        for(int i = 0; i < end - start; i++) textSub = textSub + textArray[i + start];
        return textSub;
    }
}
