import java.util.ArrayList;

public class Tv {

    private String boyut;
    private String marka;
    private ArrayList<Kanal> kanallar;

    private boolean acik;

    private int ses;
    public Tv(String marka,String boyut){
        this.marka = marka;
        this.boyut = boyut;
        ses =10;

        kanallar = new ArrayList<>();
        kanalOlustur();
        this.acik = false;

    }

    private void kanalOlustur() {
        HaberKanali cnn = new HaberKanali("CNN",1,"Genel Haber");
        kanallar.add(cnn);

        HaberKanali bein = new HaberKanali("BeinSpor",3,"Spor Haberi");
        kanallar.add(bein);

        MuzikKanali dreamTurk = new MuzikKanali("Dream Turk",2,"Yerli");
        kanallar.add(dreamTurk);

        MuzikKanali numberOne = new MuzikKanali("Number One",4,"Yabanci");
        kanallar.add(numberOne);

    }

    public void sesArttir(){
        if(ses<=20 && acik == true){
            ses++;
            System.out.println("Ses seviyesi : "+ses);
        }else{
            System.out.println("Ses en yüksek seviyede");
        }
    }

    public void sesAzalt(){
        if(ses>0 && acik){
            ses--;
            System.out.println("Ses seviyesi : "+ses);
        }else{
            System.out.println("Ses en düşük seviyede");
        }
    }

    public void tvAc(){
        if (acik==false){
            acik= true;
            System.out.println("Tv acildi");
        }else{
            System.out.println("Tv zaten acik");
        }
    }

    public void tvKapat(){
        if (acik==true){
            acik= false;
            System.out.println("Tv kapatildi");
        }else{
            System.out.println("Tv zaten kapali");
        }
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString(){
        return "Marka : " + marka + "Boyut : "+ boyut+ " olan tv olusturuldu";
    }
}
