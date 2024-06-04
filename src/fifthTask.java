public class fifthTask {
    public static void main(String[] args) {
        String sentence = "Hello World!";
        String[] splitSentence = toMassive(sentence);
        printMassive(splitSentence);
    }
    public static String[] toMassive(String sentence){
        String[] splitSentence = sentence.split(" ");
        return splitSentence;
    }
    public static void printMassive(String[] sentence){
        System.out.print("[");
        for (int i = 0; i < sentence.length; i++) {
            System.out.print(sentence[i]+",");
        }
        System.out.print("]");
    }

}
