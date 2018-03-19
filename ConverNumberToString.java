import java.util.Scanner;

public class ConverNumberToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào một số có 2 chữ số: ");
        int n = input.nextInt();
        int ch = (n % 100) / 10;
        int dv = ((n % 100) % 10);

        if ((ch == 1) && (dv == 0))
            System.out.print(" Muoi ");
        else if ((ch == 2) && (dv == 0))
            System.out.print("Hai muoi ");
        else if ((ch == 3) && (dv == 0))
            System.out.print("Ba muoi ");
        else if ((ch == 4) && (dv == 0))
            System.out.print("Bon muoi ");
        else if ((ch == 5) && (dv == 0))
            System.out.print("Nam muoi ");
        else if ((ch == 6) && (dv == 0))
            System.out.print("Sau muoi ");
        else if ((ch == 7) && (dv == 0))
            System.out.print("Bay muoi ");
        else if ((ch == 8) && (dv == 0))
            System.out.print("Tam muoi ");
        else if ((ch == 9) && (dv == 0))
            System.out.print("Chin muoi ");

        else if ((ch == 0) && (dv == 0))
            System.out.print(" Khong ");
        else if ((ch == 0) && (dv == 1))
            System.out.print(" Mot ");
        else if ((ch == 0) && (dv == 2))
            System.out.print("Hai ");
        else if ((ch == 0) && (dv == 3))
            System.out.print("Ba ");
        else if ((ch == 0) && (dv == 4))
            System.out.print("Bon ");
        else if ((ch == 0) && (dv == 5))
            System.out.print("Nam ");
        else if ((ch == 0) && (dv == 6))
            System.out.print("Sau ");
        else if ((ch == 0) && (dv == 7))
            System.out.print("Bay ");
        else if ((ch == 0) && (dv == 8))
            System.out.print("Tam ");
        else if ((ch == 0) && (dv == 9))
            System.out.print("Chin ");

        else {
            switch (ch) {
                case 0:
                    System.out.print("Le ");
                    break;
                case 1:
                    System.out.print("Muoi ");
                    break;
                case 2:
                    System.out.print("Hai muoi ");
                    break;
                case 3:
                    System.out.print("Ba muoi ");
                    break;
                case 4:
                    System.out.print("Bon muoi ");
                    break;
                case 5:
                    System.out.print("Nam muoi ");
                    break;
                case 6:
                    System.out.print("Sau muoi ");
                    break;
                case 7:
                    System.out.print("Bay muoi ");
                    break;
                case 8:
                    System.out.print("Tam muoi ");
                    break;
                case 9:
                    System.out.print("Chin muoi ");
                    break;
            }
            switch (dv) {

                case 1:
                    System.out.print("Mot ");
                    break;
                case 2:
                    System.out.print("Hai ");
                    break;
                case 3:
                    System.out.print("Ba ");
                    break;
                case 4:
                    System.out.print("Bon ");
                    break;
                case 5:
                    System.out.print("Nam ");
                    break;
                case 6:
                    System.out.print("Sau ");
                    break;
                case 7:
                    System.out.print("Bay ");
                    break;
                case 8:
                    System.out.print("Tam ");
                    break;
                case 9:
                    System.out.print("Chin");
                    break;
            }
        }
    }
}
