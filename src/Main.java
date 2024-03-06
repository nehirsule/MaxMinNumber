import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Girilecek sayı adedini belirle ve kaydet
        System.out.print("Kaç tane sayı gireceksiniz? : ");
        int n = scanner.nextInt();

        //eğer sayı negatif ve 0 ise başa dön ve tekrar sor
        if (n <= 0) {
            System.out.println("Geçersiz giriş. Pozitif bir tam sayı giriniz.");
            return;
        }

        //min ve max değerlerini tanımla ve formülü uygula
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        // kaç adet sayı girilecekse 0 dan n'e kadar sayı sorma tekrarı
        for (int i = 0; i < n; i++) {
            System.out.print("Sayı giriniz: ");
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        // min ve max belirlenen sayıları yazdır
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);


    }
}