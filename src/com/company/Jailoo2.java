package com.company;

public class Jailoo2 {

    private String jaiaty;
    private String daregi;
    private String chaban;
    Ui[] ui;
    Koi[] koi;
    At[] at;

    public Jailoo2(String jaiaty, String daregi, String chaban, Ui[] ui, Koi[] koi, At[] at) {
        this.jaiaty = jaiaty;
        this.daregi = daregi;
        this.chaban = chaban;
        this.koi = koi;
        this.ui = ui;
        this.at = at;
    }

    public String getJaiaty() {
        return jaiaty;
    }

    public void setJaiaty(String jaiaty) {
        this.jaiaty = jaiaty;
    }

    public String getDaregi() {
        return daregi;
    }

    public void setDaregi(String daregi)
    {this.daregi = daregi;}

    public String getChaban() {
        return chaban;
    }

    public void setChaban(String chaban) {
        this.chaban = chaban;
    }

    public Ui[] getUi() {
        return ui;
    }

    public void setUi(Ui[] ui) {
        this.ui = ui;
    }

    public Koi[] getKoi() {
        return koi;
    }

    public void setKoi(Koi[] koi) {
        this.koi = koi;
    }

    public At[] getAt() {
        return at;
    }

    public void setAt(At[] at) {
        this.at = at;
    }
}


