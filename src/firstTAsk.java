public class firstTAsk {
    public static void main(String[] args) {
        String sentence = "Hello world!";
        reverse(sentence);
    }

    public static void reverse(String row){
        for (int i = row.length() - 1; i >= 0; i--) {
            System.out.print(row.charAt(i));
        }
    }
}
