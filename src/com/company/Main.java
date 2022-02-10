package com.company;

public class Main {
    public static void main(String[] args) {

        Ui ui1 = new Ui("Зоя", (byte) 3, (int) 200);
        Ui ui2 = new Ui("Курон", (byte) 1, 223);
        Ui ui3 = new Ui("Кашка2", (byte) 6, 350);
        Ui ui4 = new Ui("Тамара", (byte) 2, 470);
        Ui ui5 = new Ui("Вера", (byte) 2, 398);

        At at1 = new At("Aккула", (byte) 2, 480);
        At at2 = new At("Телтору", (byte) 5, 554);

        Koi koi1 = new Koi("Ала", (byte) 1, 95);
        Koi koi2 = new Koi("Сары жон", (byte) 2, 92);
        Koi koi3 = new Koi("Чаар", (byte) 4, 95);
        Koi koi4 = new Koi("Курон", (byte) 3, 84);
        Koi koi5 = new Koi("Узун  кулак", (byte) 6, 74);
        Koi koi6 = new Koi("Мааракеч", (byte) 7, 68);
        Koi koi7 = new Koi("Дос", (byte) 1, 64);
        Koi koi8 = new Koi("Дос", (byte) 1, 72);

        Ui[] uis = {ui1, ui2, ui3, ui4, ui5};
        At[] ats = {at1, at2};
        Koi[] kois = {koi1, koi2, koi3, koi4, koi5, koi6, koi7, koi8};

        int uschet =1;
        int aschet =1;
        int kschet =1;


        Jailoo1 jailoo1 = new Jailoo1("Ийри  Суу  ;", "Кочкор  району ;", ";  Таалайбек", uis, kois, ats);
        System.out.println("Жайлоонун  аты - " + jailoo1.getJaiaty() + " Дареги  - " + jailoo1.getDaregi() +
                " Чабандын  аты  -  " + jailoo1.getChaban());
        System.out.println("Бул жайлоодо " + uis.length + " уй, " + ats.length + " ат, " + kois.length + " кой" + "  кайтарылат");
        System.out.println("Уйлар :");
        for (Koi a : kois) {
            System.out.println(uschet+ " - уйдун  аты -   " + a.getAty() + ";   Жашы - " + a.getJaschy() + " Салмагы -  " + a.getSalmagy()+" кг.");
            uschet=uschet + 1;
        }
        System.out.println("Aттар:");
        for (At a : ats) {
            System.out.println(aschet+ "- аттын  аты -   " + a.getAty() + "; Жашы  -  " + a.getJaschy() + "; Салмагы  " + a.getSalmagy()+ "кг.");
            aschet = aschet+1;
        }
        System.out.println("Койлор:");
        for (Koi a : kois) {
            System.out.println(kschet+ "- койдун аты -   " + a.getAty() + "; Жашы -  " + a.getJaschy() + ";  Салмагы  " + a.getSalmagy()+"кг.");
            kschet = kschet +1;
        }


    }

}





