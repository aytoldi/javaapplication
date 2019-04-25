package aytoldi.string_demo;

public class Demo {
    public static void main(String args[]) {
        String s1 = "hello";
        String s2 = "world";
        //add two string
        System.out.println(s1 + " " + s2);
        //convert string to uppercase چوڭ ھەرىپكە ئايلاندۇۇرش
        System.out.println(s1.toUpperCase());
        //convert string to lowercase كىچىك ھەرىپكە ئايلاندۇرۇش
        System.out.println(s2.toLowerCase());
        //سېلىشتۇرۇش
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        String s3 = "assalamu alaykum ?";
        //  ھەرىپنى ئۆزئىچىگە ئالامدۇ serach in string
        System.out.println("izdax natijisi:" + s3.contains("Alaykum"));//چۈنكى چوڭ يېزىلغان شوڭا يالغان قايتىدۇ
        // replce in string  جۈمىلنىڭ ئىچىدىكى سۆزنى ئۆزگەرتىش
        System.out.println(s3.replace("assalamu", "Assalamu"));
        //string in index جۈمىلە ئىچىدىكى ھەرىپكە ئاساسەن، ھەرىپنىڭ ئىندىكىس قىممىتىگە ئېرىشىش
        System.out.println("string index:" + s3.indexOf("alaykum"));
        //size of th string
        System.out.println("length:" + s3.length());
        //get substring ھەرىپكە ئېرىشىش
        System.out.println("set index:" + s3.substring(0, 10));
        System.out.println("set index:" + s3.substring(11, 18));
        String s4 = "     my  stirng      ";
        //remove space سۆزنىڭ ئالدى كەينىدىكى بوشلۇقنى ئېلىۋىتىش
        System.out.println(s4);
        System.out.print(s4.trim());
    }
}
