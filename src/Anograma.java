import java.util.Arrays;

public class Anograma {
    public static void main(String[] args) {
        Anograma anograma = new Anograma();

        System.out.println(anograma.areAnagrams("абвг" , "габв"));
    }
    public boolean areAnagrams(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
}
