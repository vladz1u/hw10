import java.util.ArrayList;

public class fourthTask {
    public static void main(String[] args) {
        String row = "Hello world!!!";
        isDublicate(row);
    }
    public static void isDublicate(String row){
        char[] characters = row.toCharArray();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < characters.length - 1; i++) {
            if (characters[i] == characters[i+1]){
                //
            } else
                result.add(String.valueOf(characters[i]));
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }
        System.out.print(characters[characters.length - 1]);
    }
}
