public class zerothtask {
    public static void main(String[] args) {
        String sentence = "Hello, my name is IDEA";
        countWords(sentence);
    }
    public static void countWords(String sentence){
        String[] words = sentence.split(" ");
        System.out.println("Count of words: " + words.length);
    }
}
