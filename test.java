import java.util.Scanner;

public class test {

    static boolean asal(int n, int i) {
        if (i == n) {
            return true;  // Eğer i, n'e kadar geldiyse, bu demektir ki böleni yoktur, asal.
        } else if (n % i == 0) {
            return false; // Eğer n, i'ye tam bölünüyorsa asal değildir.
        } else {
            return asal(n, i + 1); // Bir sonraki sayıya geç ve tekrar kontrol et.
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen Bir Sayi Giriniz: ");
        int n = scan.nextInt();

        // Asal sayıyı kontrol eden recursive metodu çağırma
        if (n > 1 && asal(n, 2)) {
            System.out.println(n + " Sayisi Bir Asal Sayidir.");
        } else {
            System.out.println(n + " Sayisi Bir Asal Sayi Degildir.");
        }
    }
}










