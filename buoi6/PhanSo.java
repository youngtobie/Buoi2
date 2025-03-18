package vn.com.t3h.buoi6;

public class PhanSo {

    private int tuSo;
    private int mauSo;

    public  PhanSo(){ // contructor không tham số
        this.tuSo=1;
        this.mauSo=1;
    }
    /*
    Cộng 2 phân số:
    Chỉ được cộng khi 2 phân số có cùng mâu số
     */
    public void congPhanSo(PhanSo phanSoDuocCongVao){
        if(this.mauSo == phanSoDuocCongVao.getMauSo()){
            this.tuSo = this.tuSo + phanSoDuocCongVao.getTuSo();
            this.mauSo = phanSoDuocCongVao.getMauSo();
            return;
        }
        this.tuSo = this.tuSo * phanSoDuocCongVao.getMauSo() + this.mauSo * phanSoDuocCongVao.getTuSo();
        this.mauSo = phanSoDuocCongVao.getMauSo() * this.mauSo;
    }
    public void truPhanSo(PhanSo phanSoDuocTruVao){
        if(this.mauSo == phanSoDuocTruVao.getMauSo()){
            this.tuSo = this.tuSo - phanSoDuocTruVao.getTuSo();
            this.mauSo = phanSoDuocTruVao.getMauSo();
            return;
        }
        this.tuSo = this.tuSo * phanSoDuocTruVao.getMauSo() - this.mauSo * phanSoDuocTruVao.getTuSo();
        this.mauSo = phanSoDuocTruVao.getMauSo() * this.mauSo;
    }
    public void nhanPhanSo(PhanSo phanSoNhan){
        this.tuSo = this.tuSo * phanSoNhan.getTuSo();
        this.mauSo = this.mauSo * phanSoNhan.getMauSo();
    }
    public void chiaHaiPhanSo(PhanSo phanSoChia){
        this.tuSo = this.tuSo * phanSoChia.getMauSo();
        this.mauSo = this.mauSo * phanSoChia.getTuSo();
    }
    public void setTuSo(int tuSoTruyenVao){
        this.tuSo=tuSoTruyenVao;
    }
    public  void hienThi(){
        System.out.println(String.format("Phân số: %d / %d" , this.tuSo, this.mauSo));
    }
    public int getTuSo() {
        return this.tuSo;
    }
    public void setMauSo(int mauSoTruyenVao){
        this.mauSo=mauSoTruyenVao;
    }
    public int getMauSo() {
        return this.mauSo;
    }


}
