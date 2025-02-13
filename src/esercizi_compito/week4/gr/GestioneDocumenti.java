package esercizi_compito.week4.gr;

/*
1. Creare una classe Documento, con titolo e contenuto.
2. Creare una classe FileDigitale non istanziabile, che estende Documento, aggiunge informazioni sul formato e definisce un metodo per leggere il contenuto.
3. Creare una classe DocumentoPDF che eredita da FileDigitale, ha un metodo specifico per proteggere il file (void proteggi().
4. Creare le interfacce IModificabile e IStampabile che definiscono operazioni/metodi da eseguire su dei file.
5. Creare una classe DocumentoWord che eredita da FileDigitale e implementa entrambe le interfacce.
6. In main in GestioneDocumenti creare un array di documenti, iterare con un ciclo for e manipolare qualche campo/qualche valore.
7. Uso qualche metodo di Stringhe e usare StringBuilder per concatenare stringhe
8. Impedire la lettura del contenuto se il file è protetto
*/

public class GestioneDocumenti {
    public static void main(String[] args) {
        // implementare qui punto 6 e forse anche 7
        Documento[] documenti = new Documento[3];
        documenti[0] = new DocumentoWord("word1", "ciao");
        documenti[1] = new DocumentoPDF("pdf2","hello");
        documenti[2] = new DocumentoWord("word3", "hola");
        for (Documento d: documenti) {
            if (d instanceof DocumentoWord){
                ((DocumentoWord) d).stampa();
                ((DocumentoWord) d).modifica("contenuto modificato");
                ((DocumentoWord) d).stampa();
            }
            if (d instanceof DocumentoPDF){
                ((DocumentoPDF) d).leggiContenuto();
                ((DocumentoPDF) d).proteggi();
                ((DocumentoPDF) d).leggiContenuto();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Documento d: documenti) {
            sb.append(d.titolo).append(" ");
        }
        System.out.println(sb.toString());
        System.out.println(sb.reverse().toString());

    }

}

class Documento {
    String titolo;
    String contenuto;

    public Documento(String titolo, String contenuto) {
        this.titolo = titolo;
        this.contenuto = contenuto;
    }
}

abstract class FileDigitale extends Documento{
    String formato;

    public FileDigitale(String titolo, String contenuto, String formato) {
        super(titolo, contenuto);
        this.formato = formato;
    }

    void leggiContenuto(){
        System.out.println(contenuto);
    }
}
class DocumentoPDF extends FileDigitale{

    boolean protetto;
    public DocumentoPDF(String titolo, String contenuto) {
        super(titolo, contenuto,"pdf");
        this.protetto = false;
    }
    void proteggi(){
        this.protetto = true;
    }
    @Override
    void leggiContenuto() {
        if (this.protetto){
            System.out.println("non posso leggere il file");
        }else {
            System.out.println(contenuto);
        }
    }
}
interface IModificabile {
    void modifica(String nuovoContenuto);
}
interface IStampabile{
    void stampa();
}
class DocumentoWord extends FileDigitale implements IModificabile, IStampabile{

    public DocumentoWord(String titolo, String contenuto) {
        super(titolo, contenuto, "doc");
    }

    @Override
    public void modifica(String nuovoContenuto) {
        this.contenuto = nuovoContenuto;
    }

    @Override
    public void stampa() {
        System.out.println(contenuto);
    }
}