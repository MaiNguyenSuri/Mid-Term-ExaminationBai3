/*
Câu 3
Viết chương trình nhập vào một số nguyên dương (n >= 0), kiểm tra số đó có là một tháng trong năm không. Nếu có thì in ra tháng đó có bao nhiêu ngày.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên dương n: ");
        int n = scanner.nextInt();

        if (checkMonth(n)) {
            System.out.format("Tháng %d có trong năm", n);
        } else {
            System.out.println("Tháng không có trong năm");
        }
        scanner.close();
    }

    public static boolean checkMonth(int month) {


        switch (month) {
            case 2:
                System.out.println("Tháng hai có 28 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng có 31 ngày");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng có 30 ngày");
                break;
            default:
                return false;

        }
        return true;
    }
}
