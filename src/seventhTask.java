public class seventhTask {
    public static void main(String[] args) {
        String sentence = "hello world!";
        toUpperCaseWord(sentence);
    }
    public static void toUpperCaseWord(String sentence){
        String[] sentenceSplit = sentence.split(" ");
        for (int i = 0; i < sentenceSplit.length; i++) {
            System.out.print(sentenceSplit[i].substring(0, 1).toUpperCase() + sentenceSplit[i].substring(1)+" ");
        }
    }
}
