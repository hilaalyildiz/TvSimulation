public class Kanal {
    private int kanalNo;
    private String adi;

    public Kanal(String adi, int kanalNo){
        this.kanalNo = kanalNo;
        this.adi = adi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getKanalNo() {
        return kanalNo;
    }

    public void setKanalNo(int kanalNo) {
        this.kanalNo = kanalNo;
    }

    public String kanalBilgisiGoster(){
        return "Adi : " + adi+" numarasi : "+kanalNo;
    }
}
