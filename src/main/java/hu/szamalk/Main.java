package hu.szamalk;


import hu.szamalk.modell.Mosoda;
import hu.szamalk.modell.Ruha;

public class Main {
    static Mosoda mosoda;
    public static void main(String[] args) {
        mosoda = new Mosoda(5);
        mosoda.bevesz(new Ruha("asd"));
        mosoda.bevesz(new Ruha("asd1"));
        mosoda.bevesz(new Ruha("asd2"));
        mosoda.bevesz(new Ruha("asd3"));
        mosoda.bevesz(new Ruha("asd4"));
        System.out.println(mosoda.toString());
        mosoda.kiadas("asd4");
        System.out.println(mosoda.toString());
    }

}