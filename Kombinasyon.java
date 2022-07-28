import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r, total = 1, total2 = 1, total3 = 1, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Toplam Eleman Sayısını Giriniz (n) : ");
        n = input.nextInt();
        System.out.print("Kombinasyon Eleman Sayısını Giriniz (r) : ");
        r = input.nextInt();
        // Kombinasyon formulu = n! / (r! *(n-r)!)

        for (int a = 1; a<=n; a++){
            total *= a;
        }
        for (int a = 1; a<=r; a++){
            total2 *= a;
        }
        for (int a = 1; a<=(n-r); a++){
            total3 *= a;
        }

        c = total / (total2 * total3);
        System.out.println("Kombinasyon : "+c);
    }
}
