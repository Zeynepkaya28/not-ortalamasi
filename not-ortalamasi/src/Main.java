import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("not ortalamasına göre sınıf geçme ve kalma durumunu,en düşük notu ve en yüksek notu bulan uygulama");
        Scanner klavye=new Scanner(System.in);
        double not1;
        double not2;
        //vize notunu giriniz
        System.out.println("Vize notunu giriniz:");
        not1= klavye.nextDouble();
        //final notunu giriniz
        System.out.println("final notnunu giriniz:");
        not2=klavye.nextDouble();

        double notOrtalamasi=(not1*0.4)+(not2*0.6);
        System.out.println(notOrtalamasi);

       if (notOrtalamasi>=50 && not2>=50){
           System.out.println("geçtiniz.");}
           else {
               System.out.println("kaldınız.");
           }

       double enyuksekNot= Math.max(not1,not2 );
        System.out.println("en yuksek not:"+enyuksekNot);
        double endusukNot = Math.min(not1,not2 );
        System.out.println("en dusuk not:"+endusukNot);
    }
}






