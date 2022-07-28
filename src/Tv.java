import java.util.ArrayList;

public class Tv {

    private String boyut;
    private String marka;
    private ArrayList<Kanal> kanallar;

    public Tv(String marka,String boyut){
        this.marka = marka;
        this.boyut = boyut;

        kanalOlustur();
    }

    private void kanalOlustur() {
        HaberKanali cnn = new HaberKanali("CNN",1,"Genel Haber");
        kanallar.add(cnn);
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
