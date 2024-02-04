import java.util.Scanner;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        double Sabit=10, perKm=2.20, km, result;

        System.out.print("Gidilen Mesafe KM Cinsinden: ");
        km = input.nextDouble();

        result = km * perKm + Sabit;
        // Aşağıdaki işlem, çıkan sonuç 20 den küçükse sonucu 20 yaz eğer değilse kendi değerini yaz anlamına geliyor.
        result = (result < 20) ? 20 : result;

        System.out.println(result);
    }
}
