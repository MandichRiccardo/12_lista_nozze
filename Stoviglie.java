public class Stoviglie extends Articolo{
    protected String materiale;
    protected int quantita;
    protected double costoTot;

    public Stoviglie(String nome, String tipologia, String colore, String marca, int quantita, double costo, String materiale, int quantita1, double costoTot) {
        super(nome, tipologia, colore, marca, quantita, costo);
        this.materiale = materiale;
        this.quantita = quantita1;
        this.costoTot = costoTot;
    }

    public Stoviglie(String materiale) {
        super();
        this.materiale = Interazione.strput("di che materiale è fatto questa stoviglia?");
        this.quantita = Interazione.input("quanti ce ne sono in lista nozze?");
        this.costoTot = costo * quantita;
    }

    public String getMateriale() {
        return materiale;
    }

    public double getCostoTot() {
        return costoTot;
    }

    public void setCostoTot(double costoTot) {
        this.costoTot = costo * quantita;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
}