package org.lessons.java.security;
import java.util.Scanner;

/*INPUT: salvare in variabili: nome, cognome, colore preferito e data
di nascita nel seguente formato: 12/05/1994*/
/*OUTPUT: stampare password generata concatenando nome, cognome, colore preferito
e somma di giorno,mese e anno di nascita. es. Pinco-Pallo-magenta-2011*/



public class PasswordGenerator {

    public static void main(String[] args) {
        //importo classe Java scanner
        Scanner scanner = new Scanner(System.in);

        //dichiaro variabili dove salvo i dati inseriti dall'utente
        String name;
        String surname;
        String favcolor;
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;

        //chiedo all'utente di fornirmi i dati
        System.out.println("inserisci il tuo nome: ");
        name = scanner.next();
        System.out.println("inserisci il tuo cognome: ");
        surname = scanner.next();
        System.out.println("inserisci il tuo colore preferito: ");
        favcolor = scanner.next();
        System.out.println("inserisci il giorno di nascita: ");
        dayOfBirth = scanner.nextInt();
        System.out.println("inserisci il mese di nascita: ");
        monthOfBirth = scanner.nextInt();
        System.out.println("inserisci l'anno di nascita: ");
        yearOfBirth = scanner.nextInt();

        //creo variabile che concatena giorno,mese e anno di nascita
        String dateOfBirth = dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;

        //stampo dati in console
        System.out.println("nome: "+name);
        System.out.println("cognome: "+surname);
        System.out.println("colore preferito: "+favcolor);
        System.out.println("data di nascita: "+dateOfBirth);

        //creo la password
        int sumNumbersInDateOfBirth = dayOfBirth + monthOfBirth + yearOfBirth;
        String password = name+"-"+surname+"-"+favcolor+"-"+sumNumbersInDateOfBirth;

        System.out.println("La password generata è: "+password);




    }




}
