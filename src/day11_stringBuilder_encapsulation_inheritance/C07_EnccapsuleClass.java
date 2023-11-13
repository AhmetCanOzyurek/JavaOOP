package day11_stringBuilder_encapsulation_inheritance;

public class C07_EnccapsuleClass {
    private int satisGirisi;
    private int toplamSatisTutari;
    public String sirketISmi = "Yildiz Triko";
private int kapiNumarasi = 20;
    public void setSatisGirisi(int satisGirisi) {
        this.satisGirisi = satisGirisi;
        toplamSatisTutari += this.satisGirisi;
    }

    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }

    public int getKapiNumarasi() {
        return kapiNumarasi;
    }

    public void setKapiNumarasi(int kapiNumarasi) {
        this.kapiNumarasi = kapiNumarasi;
    }
}
