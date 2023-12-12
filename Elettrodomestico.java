public class Elettrodomestico extends Articolo{
    protected String classeEnergetica;
    protected double profondita;
    protected double lunghezza;
    protected double larghezza;

    public Elettrodomestico(String nome, String tipologia, String colore, String marca, int quantita, double costo, String classeEnergetica, double profondita, double lunghezza, double larghezza) {
        super(nome, tipologia, colore, marca, quantita, costo);
        this.classeEnergetica = classeEnergetica;
        this.profondita = profondita;
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    public Elettrodomestico(){
        super();
        this.classeEnergetica = Interazione.strput("qual'è la classe energetica di questo elettrodomestico?");
        this.profondita = Interazione.doubput("qual'è la profondità di questo elettrodomestico?");
        this.lunghezza = Interazione.doubput("qual'è la lunghezza di questo elettrodomestico?");
        this.larghezza = Interazione.doubput("qual'è la larghezza di questo elettrodomestico?");
    }
}