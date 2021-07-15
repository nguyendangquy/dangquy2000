package Class;

public class SanPham {
   private String maSp,tenSP,nhaSX, maLoaiSP;

    public SanPham(String maSp, String tenSP, String nhaSX, String maLoaiSP) {
        this.maSp = maSp;
        this.tenSP = tenSP;
        this.nhaSX = nhaSX;
        this.maLoaiSP = maLoaiSP;
    }

    public SanPham(String maSp) {
        this.maSp = maSp;
    }   
    public SanPham() {
    }

    public String getMaSp() {
        return maSp;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public String getMaLoaiSP() {
        return maLoaiSP;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public void setMaLoaiSP(String maLoaiSP) {
        this.maLoaiSP = maLoaiSP;
    }
   
}
