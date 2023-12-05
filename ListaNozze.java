public class ListaNozze{
    protected Sposi coniugi;
    protected int maxArticoli;
    protected String negozio;
    protected Articolo[] articoliDesiderati;
    protected int prezzoTot;
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

    public void setNegozio(String negozio) {
        this.negozio = negozio;
    }

    public Articolo[] getArticoliDesiderati() {
        return articoliDesiderati;
    }

    public void setArticoliDesiderati(Articolo[] articoliDesiderati) {
        this.articoliDesiderati = articoliDesiderati;
    }

    public int getPrezzoTot() {
        return prezzoTot;
    }

    public void setPrezzoTot(int prezzoTot) {
        this.prezzoTot = prezzoTot;
    }

    public Articolo[] getArticoliRegalati() {
        return articoliRegalati;
    }

    public void setArticoliRegalati(Articolo[] articoliRegalati) {
        this.articoliRegalati = articoliRegalati;
    }
}
