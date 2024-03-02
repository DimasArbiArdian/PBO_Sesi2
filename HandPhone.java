
public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHandPhone(String jenis, int tahun){
        jenis_hp = jenis;
        tahun_pembuatan = tahun;
    }
    
    public String getJenisHP(){
        return jenis_hp;
    }
    
    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }
    
    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setDataHandPhone("Iphone 15 Pro Max", 2023);
        System.out.println(hp.getJenisHP());
        System.out.println(hp.getTahunPembuatan());
    }
}