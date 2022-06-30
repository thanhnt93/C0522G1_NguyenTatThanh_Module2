package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class ReadNumberToLetter {
    //Đọc số thành chữ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int importInteger = sc.nextInt();
        if (importInteger > 0 && importInteger < 10) {
            switch (importInteger) {
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
                case 10:
                    System.out.print("Ten");
                    break;
            }
        } else if (importInteger >= 10 && importInteger < 20) {
            switch (importInteger) {
                case 10:
                    System.out.print("Ten");
                    break;
                case 11:
                    System.out.print("Eleven");
                    break;
                case 12:
                    System.out.print("Twelve");
                    break;
                case 13:
                    System.out.print("Thirteen");
                    break;
                case 14:
                    System.out.print("Fourteen");
                    break;
                case 15:
                    System.out.print("Fiveteen");
                    break;
                case 16:
                    System.out.print("Fifteen");
                    break;
                case 17:
                    System.out.print("Seventeen");
                    break;
                case 18:
                    System.out.print("Eightteen");
                    break;
                case 19:
                    System.out.print("Nineteen");
                    break;
            }
        } else if (importInteger >= 20 && importInteger < 100) {

        }

    }

    public static void checkSoNguyen() {

    }
}
