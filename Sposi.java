public class Sposi{
    protected String sposo;
    protected String sposa;
    protected String dataMatrimonio;
    protected String luogoMatrimonio;

    public Sposi(String sposo, String sposa) {
        this.sposo = sposo;
        this.sposa = sposa;
    }

    public Sposi() {
        this.sposo = Interazione.strput("come si chiama lo sposo?");
        this.sposa = Interazione.strput("come si chiama la sposa?");
    }

    public String getSposo() {
        return sposo;
    }

    public String getSposa() {
        return sposa;
    }

    public String getDataMatrimonio() {
        return dataMatrimonio;
    }

    public void setDataMatrimonio(String dataMatrimonio) {
        this.dataMatrimonio = dataMatrimonio;
    }

    public String getLuogoMatrimonio() {
        return luogoMatrimonio;
    }

    public void setLuogoMatrimonio(String luogoMatrimonio) {
        this.luogoMatrimonio = luogoMatrimonio;
    }

    public String toString() {
        String info = "";
        info += "\tsposo:\t" + sposo + "\n";
        info += "\tsposa:\t" + sposa + "\n";
        info += "\tdata del matrimonio:\t" + dataMatrimonio + "\n";
        info += "\tluogo del matrimonio:\t" + luogoMatrimonio + "\n";
        return info;
    }
}