public class Articolo {
    protected String nome;
    protected String tipologia;
    protected String colore;
    protected String marca;
    protected int quantita;
    protected double costo;

    public Articolo(String nome, String tipologia, String colore, String marca, int quantita, double costo) {
        this.nome = nome;
        this.tipologia = tipologia;
        this.colore = colore;
        this.marca = marca;
        this.quantita = quantita;
        this.costo = costo;
    }
    public Articolo() {
        this.nome = Interazione.strput("come si chiama questo articolo?");
        this.tipologia = Interazione.strput("di che tipologia è?");
        this.colore = Interazione.strput("di che colore è?");
        this.marca = Interazione.strput("di che marca è?");
        this.quantita = Interazione.input("quanti ce ne sono in lista nozze?");
        this.costo = Interazione.doubput("quanto costa il singolo articolo?");
    }

    public String getNome() {
        return nome;
    }

    public String getTipologia() {
        return tipologia;
    }

    public String getColore() {
        return colore;
    }

    public String getMarca() {
        return marca;
    }

    public int getQuantita() {
        return quantita;
    }
    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public double getCosto() {
        return costo;
    }

    public String toString() {
        String info = "";
        info += "\tnome:\t" + nome + "\n";
        info += "\ttipologia:\t" + tipologia + "\n";
        info += "\tcolore:\t" + colore + "\n";
        info += "\tmarca:\t" + marca + "\n";
        info += "\tquantità:\t" + quantita + "\n";
        info += "\tcosto:\t" + costo + "\n";
        return info;
    }

    public boolean equals(Articolo a) {
        if(this.nome != a.nome) return false;
        if(this.tipologia != a.tipologia) return false;
        if(this.colore != a.colore) return false;
        if(this.marca != a.marca) return false;
        if(this.costo != a.costo) return false;
        return true;
    }
}