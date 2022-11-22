public class SubString {
    public static String subString(String text, int start, int end) {
        if(start > end) {
            int temp = end;
            end = start;
            start = temp;
        }
        if(start >= text.length()) start = text.length() - 1;
        //if(end > text.length()) end = text.length();
        char[] textArray = text.toCharArray();
        String textSub = "";
        for(int i = 0; i < end - start; i++) textSub = textSub + textArray[i + start];
        return textSub;
    }
}
