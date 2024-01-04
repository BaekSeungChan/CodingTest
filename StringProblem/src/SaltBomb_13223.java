/*
문제 : HH:MM:SS 포맷의 두 시각의 차이를 HH:MM:SS 포맷으로 출력하기
1. ':' 문자를 기준으로 시간, 분, 초를 쪼갠다.
2. 두 시간, 분, 초의 차이를 계산한다.
3. 구해진 시간을 HH:MM:SS 형태로 출력한다.
* */

import java.util.Scanner;

public class SaltBomb_13223 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String current  = scan.next();
        String drop = scan.next();

        String[] currentUnit = current.split(":");
        int currentHour = Integer.parseInt(currentUnit[0]);
        int curretMinute = Integer.parseInt(currentUnit[1]);
        int currentSecond = Integer.parseInt(currentUnit[2]);
        int currentSecondAmout = currentHour * 3600 + curretMinute * 60 + currentSecond;

        String[] dropUnit = drop.split(":");
        int dropHour = Integer.parseInt(dropUnit[0]);
        int dropMinute = Integer.parseInt(dropUnit[1]);
        int dropsecond = Integer.parseInt(dropUnit[2]);
        int dropSecondAmout = dropHour * 3600 + dropMinute * 60 + dropsecond;


        int needSecondAmount = dropSecondAmout - currentSecondAmout;
        if(needSecondAmount <= 0)
            needSecondAmount += 24 * 3600;

        int needHour = needSecondAmount / 3600;
        int needMinute = (needSecondAmount % 3600) / 60;
        int needSecond = needSecondAmount % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
    }

}
