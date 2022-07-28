import java.util.Scanner;

public class Tv_Simulation {
    static Scanner tara = new Scanner(System.in);
    static Tv tv;

    public static void main(String[] args){

        menuGoster();
        boolean cikis = false;

        while ((cikis == false )){
            System.out.println("Seciminiz : Menuyu görmek için 8'i tuslayıın");
            int secim = tara.nextInt();

            switch (secim){
                case 1:
                    tvKurveKanallariOlustur();
                    break;
                
                case 8:
                    menuGoster();
                    break;
                case 0:
                    System.out.println("Sistemden cikiliyor");
                    cikis = true;
                    break;
                default:
                    System.out.println("0 ile 8 arasinda bir deger giriniz");
                    break;

            }
        }
    }

    private static void tvKurveKanallariOlustur() {

        if (tv == null){
            tara.nextLine();

            System.out.println("Tv markasını giriniz:");
            String marka = tara.nextLine();
            System.out.println("Tv boyutunu giriniz:");
            String boyut = tara.nextLine();

            tv = new Tv(marka,boyut);
            System.out.println(tv);
        } else{
            System.out.println(tv);
        }
    }

    private static void menuGoster(){
        System.out.println(" --- Menu --- \n");
        System.out.println(
                "0 -- Cıkıs\n" +
                "1 -- Televizyonu Kur \n"+
                "2 -- Televizyonu Ac \n"+
                "3 -- Sesi Ac \n"+
                "4 -- Sesi Kapat \n"+
                "5 -- Kanal Degistir \n"+
                "6 -- Kanal Bilgisi Goster \n"+
                "7 -- Televizyonu Kapat \n"+
                "8 -- Menuyu Goster \n");
    }
}
