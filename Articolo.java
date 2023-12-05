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
        info += "nome:\t" + nome + "\n";
        info += "tipologia:\t" + tipologia + "\n";
        info += "colore:\t" + colore + "\n";
        info += "marca:\t" + marca + "\n";
        info += "quantità:\t" + quantita + "\n";
        info += "costo:\t" + costo + "\n";
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