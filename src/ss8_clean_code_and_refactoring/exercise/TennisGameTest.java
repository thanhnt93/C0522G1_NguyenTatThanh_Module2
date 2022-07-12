package ss8_clean_code_and_refactoring.exercise;

import java.util.Scanner;

public class TennisGameTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Score: ");
        int firstPoint = sc.nextInt();

        System.out.print("Enter Second Score: ");
        int secondPoint = sc.nextInt();

        String getScore = TennisGame.getScore(firstPoint, secondPoint);
        System.out.print(getScore);
    }


}
