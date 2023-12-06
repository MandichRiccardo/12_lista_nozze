public class ListaNozze{
    protected Sposi coniugi;
    protected int maxArticoli;
    protected String negozio;
    protected Articolo[] articoliDesiderati;
    protected double prezzoTot;
    protected Articolo[] articoliRegalati;

    public ListaNozze(Sposi coniugi) {
        this.coniugi = coniugi;
        this.maxArticoli = Interazione.input("qual'è il numero massimo di articoli diversi presenti in lista nozze?");
        this.negozio = Interazione.strput("in che negozio viene fatta questa lista nozze?");
        this.articoliDesiderati = new Articolo[maxArticoli];
        this.articoliRegalati = new Articolo[maxArticoli];
    }

    public ListaNozze(Sposi coniugi, Articolo[] articoliDesiderati) {
        this.coniugi = coniugi;
        this.maxArticoli = Interazione.input("qual'è il numero massimo di articoli diversi presenti in lista nozze?");
        this.negozio = Interazione.strput("in che negozio viene fatta questa lista nozze?");
        this.articoliDesiderati = new Articolo[maxArticoli];
        for(int i=0;i<articoliDesiderati.length;i++){
            aggiungiDesiderata(articoliDesiderati[i]);
        }
        this.articoliRegalati = new Articolo[maxArticoli];
    }

    public ListaNozze(Sposi coniugi, int maxArticoli, String negozio) {
        this.coniugi = coniugi;
        this.maxArticoli = maxArticoli;
        this.negozio = negozio;
        this.articoliDesiderati = new Articolo[maxArticoli];
        this.articoliRegalati = new Articolo[maxArticoli];
    }

    public ListaNozze(Sposi coniugi, int maxArticoli, String negozio, Articolo[] articoliDesiderati) {
        this.coniugi = coniugi;
        this.maxArticoli = maxArticoli;
        this.negozio = negozio;
        this.articoliDesiderati = new Articolo[maxArticoli];
        for(int i=0;i<articoliDesiderati.length;i++){
            aggiungiDesiderata(articoliDesiderati[i]);
        }
        this.articoliRegalati = new Articolo[maxArticoli];
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
            if(articoliDesiderati[i] != null) info = info.concat(i + ")\t" + articoliDesiderati[i].toString());
        }
        return info;
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
            if(articoliRegalati[i] != null) info = info.concat(articoliRegalati[i].toString());
        }
        return info;
    }

    public String setArticoliRegalati(Articolo a, int quantita) {
        int i=0;
        while(i<articoliRegalati.length){
            if(articoliRegalati[i]!=null){
                if(articoliRegalati[i].equals(a)){
                    articoliRegalati[i] = a;
                    return "ho aggiunto l'articolo";
                }
                i++;
            }else{
                articoliRegalati[i] = a;
                return "ho aggiunto l'articolo";
            }
        }
        return "l'elenco è pieno, non posso aggiungere altri articoli";
    }

    public String toString() {
        String info = "";
        info += "coniugi:\n" + coniugi + "\n";
        info += "articoli massimi:\t" + maxArticoli + "\n";
        info += "negozio:\t" + negozio + "\n";
        info += getArticoliDesiderati();
        info += "prezzo totale:\t" + prezzoTot + "\n";
        info += getArticoliRegalati();
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
    protected String rimuoviArticoloDesiderato(int j){
        if(j>=articoliDesiderati.length) return "sei fuori dall'elenco nozze";
        if(articoliDesiderati[j] == null) return "questo oggetto non esiste";
        int i;
        for (i=j;i<articoliDesiderati.length-1;i++) articoliDesiderati[i] = articoliDesiderati[i+1];
        articoliDesiderati[i] = null;
        return "ho eliminato l'articolo";
    }
    public void compraRegalo(){
        int i=Interazione.input(getArticoliDesiderati() + "\nquesti sono gli articoli presenti nella lista nozze di " + coniugi.getSposo() + " e " + coniugi.getSposa() + ", inserisci il numero di fianco all'articolo che gli vuoi regalare");
        int quantita = 0;
        if(articoliDesiderati[i].quantita != 1){
            while(quantita<1||quantita>articoliDesiderati[i].quantita) quantita = Interazione.input("quanti di questo articolo vuoi regalargli?\t(max " + articoliDesiderati[i].quantita + " e min 1)");
        }
        articoliDesiderati[i].quantita -= quantita;
        setArticoliRegalati(articoliDesiderati[i], quantita);
        if(articoliDesiderati[i].quantita == 0){
            rimuoviArticoloDesiderato(i);
        }
        setPrezzoTot();
    }
}