import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        System.out.println("----Tinh So Ngay Trong Thang ------");

        System.out.println("Let's Start");

        Scanner input = new Scanner(System.in);

        int nam;

        System.out.println("Enter year: ");
        nam = input.nextInt();

        System.out.println("----- Year: " + nam);

        int thang;
        System.out.println("Nhap vao thang: ");
        thang = input.nextInt();


        while (thang > 0 && thang < 13) {
            switch (thang) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Thang co 31 ngay ");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Thang co 30 ngay");
                    break;
                default:
                    if (nam % 4 == 0)
                        System.out.println("Nam nhuan! Co 29 ngay nhe");
                    else
                        System.out.println("Nam thuong! Co 28 ngay nhe");
                    break;
            }
            break;
        }
    }
}
