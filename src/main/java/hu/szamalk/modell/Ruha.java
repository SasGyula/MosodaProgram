package hu.szamalk.modell;

public class Ruha {
    private String tulajdonos;
    private boolean tiszta;


    public Ruha(String tulajdonos) {
        this.tulajdonos = tulajdonos;
        this.tiszta = false;
    }

    public String getTulajdonos() {
        return tulajdonos;
    }

    public boolean isTiszta() {
        return tiszta;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }
}
