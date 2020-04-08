package L3;

public class ReverseString {
    public static String reverse(String string){
        char[]  chars = new char[string.length()];
        string.getChars(0, string.length(), chars, 0);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
