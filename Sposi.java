public class Sposi{
    protected String sposo;
    protected String sposa;
    protected String dataMatrimonio;
    protected String luogoMatrimonio;

    public Sposi(String sposo, String sposa) {
        this.sposo = sposo;
        this.sposa = sposa;
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
        info += "sposo:\t" + sposo + "\n";
        info += "sposa:\t" + sposa + "\n";
        info += "data del matrimonio:\t" + dataMatrimonio + "\n";
        info += "luogo del matrimonio:\t" + luogoMatrimonio + "\n";
        return info;
    }
}