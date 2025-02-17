package esercizi_compito.week5.colloquio1.gr;

/*
Quando una sottoclasse eredita da una superclasse, eredita anche i suoi metodi;
tuttavia, può anche sovrascrivere i metodi della superclasse (oltre a dichiararne e implementarne di nuovi).
Considera la seguente classe Sports:

class Sport {
    int n;

    public Sport(int n) {
        this.n = n;
    }

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Ogni squadra ha n giocatori in " + getName() );
    }
}

Successivamente, creiamo una classe Calcio che eredita dalla classe Sport.
Possiamo sovrascrivere il metodo getName e restituire una stringa diversa, specifica della sottoclasse:

class Calcio extends Sport {
    @Override
    String getName(){
        return "Soccer Class";
    }
}

Nota: quando sovrascrivi un metodo, dovresti farlo precedere dall'annotazione @Override.
I parametri e il tipo di ritorno di un metodo sovrascritto devono essere esattamente gli stessi del metodo ereditato dal supertipo.

Attività
Completa il codice scrivendo un metodo getNumberOfTeamMembers sovrascritto che stampa la stessa istruzione del metodo getNumberOfTeamMembers della superclasse, tranne per il fatto che sostituisce
con n (il numero di giocatori in una squadra di calcio) con 11.

Formato di output

Quando eseguito, il tuo codice completato dovrebbe stampare quanto segue:

Sport generici
Ogni squadra ha n giocatori in Sport generici

Classe di calcio
Ogni squadra ha 11 giocatori in Classe in calcio
 */

abstract class Sport {
    int n;

    public Sport(int n) {
        this.n = n;
    }

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Ogni squadra ha " +
            // usare il getter per il numero n
            " giocatori in " + getName() );
    }
}

class Calcio extends Sport {
    public Calcio() {
        super(11);
    }

    @Override
    String getName(){
        return "Soccer Class";
    }

    // scrivere un get n per n
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Ogni squadra ha " +
            getN() + " giocatori in " + getName() );
    }
    int getN(){
        return n;
    }
}
class Tennis extends Sport {
    public Tennis() {
        super(1);
    }

    @Override
    String getName(){
        return "Tennis Class";
    }

    // scrivere un getter getNumberOfTeamMembers per n
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Cada squadra ha " +
            1 + " giocatori in " + getName() );
    }
}

// scrivere una classe Tennis che estende Sport
// scrivere il costruttore di Tennis che accetta un parametro int n = 1
// fare override del metodo getNumberOfTeamMembers per stampare la stringa "Cada squadra ha n giocatori in Tennis Class"

public class GestioneSport {
    public static void main(String[] args) {
        // creare un array di Sport con due elementi Calcio e uno Tennis
        // chiamare i metodi getNumberOfTeamMembers per ciascuno
        Sport[] sport = new Sport[3];
        sport[0] = new Calcio();
        sport[1] = new Calcio();
        sport[2] = new Tennis();
        sport[0].getNumberOfTeamMembers();
        sport[1].getNumberOfTeamMembers();
        sport[2].getNumberOfTeamMembers();

    }
}
