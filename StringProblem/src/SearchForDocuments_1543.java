import java.util.Scanner;

/*
문제 : 주어진 단어가 문서에 등장하는 횟수
1. 문서의 첫 글자부터 순회한다.
2. 문서의 지금 글자부터 주어진 단어와 한글자씩 비교한다.
3-1 단어와 완전히 일치하면 개수를 올린다. 해당 단어가 등장한 이후부터 2를 반복한다.
3-2 단어와 매치되지 않았다면 다음 글자에서 2를 반복한다.
* */

public class SearchForDocuments_1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        // indexOf
        int count = 0;
        int startIndex = 0;
        while(true){
            int findIndex = doc.indexOf(word, startIndex);
//            System.out.println(findIndex);
            if(findIndex < 0){
                break;
            } count++;
            startIndex = findIndex + word.length();
        }
        System.out.println(count);

        // replace
//        String replaced = doc.replace(word, "");
//        int length = doc.length() - replaced.length();
//        int count = length / word.length();
//        System.out.println(count);
    }
}
