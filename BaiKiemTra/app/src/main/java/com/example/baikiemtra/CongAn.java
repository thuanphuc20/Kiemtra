package com.example.baikiemtra;

public class CongAn {
    private String ten, capbac, noicongtac;
    private String quocgia;
    private int hinh;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCapbac() {
        return capbac;
    }

    public void setCapbac(String capbac) {
        this.capbac = capbac;
    }

    public String getNoicongtac() {
        return noicongtac;
    }

    public void setNoicongtac(String noicongtac) {
        this.noicongtac = noicongtac;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public CongAn(String ten, String capbac, String noicongtac, String quocgia, int hinh) {
        this.ten = ten;
        this.capbac = capbac;
        this.noicongtac = noicongtac;
        this.quocgia = quocgia;
        this.hinh = hinh;
    }
}
