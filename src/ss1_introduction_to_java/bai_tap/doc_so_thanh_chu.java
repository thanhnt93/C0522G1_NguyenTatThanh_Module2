package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int nhapSoNguyen = sc.nextInt();
        if(nhapSoNguyen >= 10 && nhapSoNguyen < 20){
//
        }
        switch (nhapSoNguyen) {
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
            default:
                System.out.print("Out of ability");
        }
    }

    public static void checkSoNguyen(){

    }
}
