public class secondTask {
    public static void main(String[] args) {
        String sym = "Hello world!";
        count(sym);
    }
    public static void count(String sym){
        char[] letters = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        char[] characters = sym.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (letters[j] == characters[i]){
                    count ++;
                }
            }
        }
        System.out.println("В реченні "+ count + " гласних букв");
    }
}
