public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Auto1", "auto1", 100, 3, 4,3000.0);
        Auto auto2 = new Auto("Auto2", "auto2", 200, 2, 2,10000.0);

        Auto[] autoArray = {auto1, auto2};

        Concessionario concessionario = new Concessionario(autoArray);
        concessionario.rangePrezzo(autoArray);

        int[] numeri = {2,4,5,8,9,3};
        String[] colori = {"nero", "blu", "verde", "viola", "rosso", "dorato"};
        char[] caratteri = {'a', 'b', 'c', 'a', 'd', 'e', 'a'};

        mediaDispari(numeri);
        mediaPari(numeri);
        mediaNumeri(numeri);
        numeriCompresi(numeri, 7, 8);
        lunghezzaStringhe(colori, 5);
        sommaNumeriPari(numeri);
        rangeNumeri(numeri, 3,4);
        stringheLunghezza(colori, 6);
        stringheComprese(colori);
        stampaOccorrenza(caratteri, 'a');

    }
    //Scrivere un metodo che calcoli la media di tutti i numeri dispari presenti
    //nell'array e stampi l'informazione a video.
    public static void mediaDispari(int[] numeri) {
        int somma = 0;
        double media = 0;
        int numeriDispari = 0;
        for(int i = 0; i < numeri.length; i++) {
            if(numeri[i] % 2 != 0) {
                somma += numeri[i];
                numeriDispari++;
            }
        }
        media = (double) somma / numeriDispari;
        System.out.println("La media dei numeri dispari è: " + media);
    }
    //uguale ma pari
   public static void mediaPari(int[] numeri) {
        int somma = 0;
        int counterPari = 0;
        int media = 0;
        for(int i = 0; i < numeri.length; i++) {
            if(numeri[i] % 2 == 0) {
                somma += numeri[i];
                counterPari++;
            }
        }
        media = somma / counterPari;
       System.out.println("Media numeri pari: " + media);
   }
   //media degli elementi dell'array
    public static void mediaNumeri(int[] numeri) {
        double media = 0;
        int somma = 0;
        //int numero = 0;
        for (int numero : numeri) {
            somma += numero;
            //numero++;

        }
        media = (double) somma / numeri.length;
        System.out.println("Media numeri: " + media);
    }
    //Scrivere un metodo che, dato un array di interi
    //e due valori aggiuntivi, stampi tutti i valori dell'array compresi tra questi due estremi.
    public static void numeriCompresi(int[] numeri, int min, int max) {
        for (int numero : numeri) {
            if (numero >= min && numero <= max) {
                System.out.println("Valori dell'array compresi tra il valore min " + min + " e il valore max " + max + ": " + numero);
            }
        }
    }
    //Creare una classe con un metodo che, accettando un array di stringhe e una dimensione
    //stabilita dall'utente, stampi tutte le stringhe che hanno una lunghezza maggiore o
    //uguale alla dimensione passata nel costruttore del metodo.
   public static void lunghezzaStringhe(String[] colori, int dimensione) {
        for(String colore : colori) {
            if(colore.length() >= dimensione) {
                System.out.println("Le stringhe più lunghe di 5 caratteri sono: " + colore);
            }
        }
   }
   //Scrivere un metodo che, dato un array di interi,
   //calcoli la somma di tutti gli elementi pari e stampi l'informazione a video.
   public static void sommaNumeriPari(int[] numeri) {
        int somma = 0;
        for(int numero : numeri) {
            if(numero % 2 == 0) {
                somma += numero;
            }
        }
       System.out.println("Somma numeri pari: " + somma);
   }
   //Scrivere un metodo che, dato un array di numeri interi e due valori aggiuntivi,
   //stampi solo i numeri compresi tra questi due estremi.
    public static void rangeNumeri(int[] numeri, int valMin, int valMax) {
        for(int numero : numeri) {
            if(numero >= valMin && numero <= valMax) {
                System.out.println("Valori compresi tra " + valMin + " e " + valMax + " sono: " + numero);
            }
        }
    }
    //Scrivere un metodo che, accettando un array di stringhe e una lunghezza minima stabilita
    // dall'utente, stampi tutte le stringhe che hanno una lunghezza maggiore o uguale
    // alla dimensione passata nel costruttore del metodo.
    public static void stringheLunghezza(String[] colori, int dimensione) {
        for(String colore : colori) {
            if(colore.length() >= dimensione) {
                System.out.println("Le stringhe lunghe: " + dimensione + " sono: " + colore);
            }
        }
    }
    //Scrivere un metodo che, accettando un array di stringhe, identifichi e stampi
    //la stringa più lunga e quella più corta.
    public static void stringheComprese(String[] colori) {
        String corta = colori[0];
        String lunga = colori[0];
        for(String colore : colori) {
            if(colore.length() <= corta.length()) {
                corta = colore;
            }
            if(colore.length() >= lunga.length()) {
                lunga = colore;
            }
        }
        System.out.println("String più corta: " + corta + ". Stringa più lunga: " + lunga);
    }
    public static void stampaOccorrenza(char[] caratteri, char occorrenzaA) {
        int contatore = 0;
        for(char carattere : caratteri) {
            if(carattere == occorrenzaA) {
                contatore++;
            }
        }
        System.out.println("Occorrenza del carattere " + occorrenzaA + " è: " + contatore);
    }
}