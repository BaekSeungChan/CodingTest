import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int[] getAlphabetCount(String str){
        int[] count = new int[26];
        for(int i = 0; i < str.length(); i++){
            char ch =  str.charAt(i);
            if( 'A' <= ch && ch <= 'Z')
                count[ch - 'A']++;
            else count[ch - 'a']++;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] count = getAlphabetCount(str);

        for(int i = 0; i < 26; i++)
            if (count[i] > 0)
            System.out.println((char)('A' + i) + ": " + count[i]);

        int maxCount = -1;
        char maxAlphabet = '?';
        for(int i = 0; i < 26; i++){
            if(count[i] > maxCount){
                maxCount = count[i];
                maxAlphabet = (char)('A' + i);
            }
            else if(count[i] == maxCount){
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);
    }
}