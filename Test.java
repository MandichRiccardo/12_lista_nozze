public class Test{
    public static void main(String[] args) {
        Sposi coniugi = new Sposi();
        ListaNozze l1 = new ListaNozze(coniugi);
        boolean ListaAttiva = true;
        do{
            Interazione.output(l1.toString());
            switch(Interazione.input("inserisci il numero rispettivo all'azione che vuoi eseguire:\n1\taggiungere un elemento alla lista nozze\n2\tcomprare un elemento dalla lista nozze\n3\tterminare il programma")){
                case 1 -> l1.aggiungiDesiderata(new Articolo());
                case 2 -> l1.compraRegalo();
                case 3 -> ListaAttiva = false;
            }
        }while(ListaAttiva);
    }
}