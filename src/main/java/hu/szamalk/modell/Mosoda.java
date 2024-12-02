package hu.szamalk.modell;


import java.util.Arrays;

public class Mosoda {
    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i<ruhak.length; i++){
            if(ruhak[i] != null) {
                s += ruhak[i].getTulajdonos() + " " + ruhak[i].isTiszta() + "\n";
            }
        }
        return s;
    }

    private Ruha [] ruhak;
    private int ruhakHossza;

    public Mosoda() {
        this.ruhak = new Ruha[5];
        ruhakHossza = 0;
    }

    public Mosoda(int db) {
        this.ruhak = new Ruha[db];
        ruhakHossza = 0;
    }

    public void bevesz(Ruha ruha){
        if(ruhakHossza< ruhak.length){
            ruhak[ruhakHossza] = ruha;
            ruhakHossza++;
        }else if(ruhakHossza>=ruhak.length){
            System.out.println("Több ruha nem fér el a mosodába");
        }
    }

    public void kiadas(String tulaj){
        for(int i=0; i<ruhak.length; i++){
                if (ruhak[i].getTulajdonos() == tulaj) {
                    ruhak[i] = null;
                }
        }
    }
    public void mos(){
        for(int i = 0; i<=ruhak.length; i++){
            ruhak[i].setTiszta(true);
        }
    }

}
