package ss1_introduction_to_java.exercise;

import java.util.Scanner;

class ReadNumberToLetter {
    //Đọc số thành chữ
    public static void main(String[] args) {

        System.out.print("Nhập số: ");
        Scanner numberInput = new Scanner(System.in);
        int number = numberInput.nextInt();

        if (number < 100) {
            numberLessThan100(number);
        } else if (number < 1000) {
            int hundreds = number / 100;
            int tens = number % 100;
            switch (hundreds) {
                case 1:
                    System.out.print("One hundred and ");
                    numberLessThan100(tens);
                    break;
                case 2:
                    System.out.print("Two hundred and ");
                    numberLessThan100(tens);
                    break;
                case 3:
                    System.out.print("Three hundred and ");
                    numberLessThan100(tens);
                    break;
                case 4:
                    System.out.print("Four hundred and ");
                    numberLessThan100(tens);
                    break;
                case 5:
                    System.out.print("Five hundred and ");
                    numberLessThan100(tens);
                    break;
                case 6:
                    System.out.print("Six hundred and ");
                    numberLessThan100(tens);
                    break;
                case 7:
                    System.out.print("Seven hundred and ");
                    numberLessThan100(tens);
                    break;
                case 8:
                    System.out.print("Eight hundred and ");
                    numberLessThan100(tens);
                    break;
                case 9:
                    System.out.print("Nine hundred and ");
                    numberLessThan100(tens);
                    break;
            }
        } else {
            System.out.println("Out of ability");
        }
    }

    public static void numberLessThan100(int number) {
        if (number < 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else if (number < 20) {
            int ones = number % 10;
            switch (ones) {
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (number < 100) {
            int ones = number % 10;
            int tens = number / 10;
            switch (tens) {
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty ");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }
            if (ones != 0) {
                switch (ones) {
                    case 1:
                        System.out.println(" one");
                        break;
                    case 2:
                        System.out.println(" two");
                        break;
                    case 3:
                        System.out.println(" three");
                        break;
                    case 4:
                        System.out.println(" four");
                        break;
                    case 5:
                        System.out.println(" five");
                        break;
                    case 6:
                        System.out.println(" six");
                        break;
                    case 7:
                        System.out.println(" seven");
                        break;
                    case 8:
                        System.out.println(" eight");
                        break;
                    case 9:
                        System.out.println(" nine");
                        break;
                }
            }

        }
    }
}
