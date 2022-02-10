package com.company;

public class Koi {

    private String aty;
    private byte jaschy;
    private int salmagy;

    public Koi(String aty, byte jaschy, int salmagy) {
        this.aty = aty;
        this.jaschy = jaschy;
        this.salmagy = salmagy;
    }

    public String getAty()
    {return aty; }


    public void setAty(String aty)
    {
        this.aty = aty;
    }

    public byte getJaschy()
    {
        return jaschy;
    }
    public void setJaschy(byte jaschy)
    {this.jaschy = jaschy;    }

    public double getSalmagy()
    {
        return salmagy;
    }

    public void setSalmagy(int salmagy)
    {
        this.salmagy = salmagy;
    }
}

