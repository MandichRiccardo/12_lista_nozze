import java.util.Arrays;

public class ListaNozze{
    protected Sposi coniugi;
    protected int maxArticoli;
    protected String negozio;
    protected Articolo[] articoliDesiderati;
    protected double prezzoTot;
    protected Articolo[] articoliRegalati;

    public ListaNozze(Sposi coniugi, int maxArticoli, String negozio, Articolo[] articoliDesiderati) {
        this.coniugi = coniugi;
        this.maxArticoli = maxArticoli;
        this.negozio = negozio;
        this.articoliDesiderati = new Articolo[maxArticoli];
        for(int i=0;i<articoliDesiderati.length;i++){
            if(articoliDesiderati[i] != null) this.articoliDesiderati[i] = articoliDesiderati[i];
        }
    }

    public String getConiugi() {
        return coniugi.toString();
    }

    public int getMaxArticoli() {
        return maxArticoli;
    }

    public String getNegozio() {
        return negozio;
    }

    public String getArticoliDesiderati() {
        String info = "";
        for(int i=0;i<articoliDesiderati.length;i++){
            info = info.concat(articoliDesiderati[i].toString());
        }
        return info;
    }

    public String aggiungiDesiderata(Articolo nuovoArticolo) {
        if(articoliDesiderati[maxArticoli-1] != null) return "la lista nozze è piena";
        int i=0;
        while(articoliDesiderati[i]!=null){
            if(articoliDesiderati[i].equals(nuovoArticolo)) return "questo articolo è già presente";
            i++;
        }
        articoliDesiderati[i] = nuovoArticolo;
        setPrezzoTot();
        return "ho aggiunto questo articolo";
    }

    public double getPrezzoTot() {
        return prezzoTot;
    }

    protected void setPrezzoTot() {
        prezzoTot = 0;
        for(int i=0;i<articoliDesiderati.length;i++){
            if(articoliDesiderati[i] != null) prezzoTot += articoliDesiderati[i].costo;
        }
    }

    public String getArticoliRegalati() {
        String info = "";
        for(int i=0;i<articoliRegalati.length;i++){
            info = info.concat(articoliRegalati[i].toString());
        }
        return info;
    }

    public String toString() {
        String info = "";
        info += "coniugi:\t" + coniugi + "\n";
        info += "articoli massimi:\t" + maxArticoli + "\n";
        info += "negozio:\t" + negozio + "\n";
        info += getArticoliDesiderati();
        info += "prezzo totale:\t" + prezzoTot + "\n";
        info += getArticoliRegalati();
        return info;
    }
}