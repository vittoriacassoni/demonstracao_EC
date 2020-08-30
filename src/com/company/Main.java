package com.company;
import classes.*;
import java.util.Scanner;

public class Main {

    private static boolean exitChat;

    public static void main(String[] args) {
        Person vittoria = new Person("Vittoria", 19);
        Person victor = new Person("Victor", 21);
        Person giuliana = new Person("Giuliana", 19);
        Blogger alice = new Blogger("Alice", 18);

        vittoria.sayHello(victor);
        vittoria.sayHello(alice);

        vittoria.introduceYourself();
        victor.introduceYourself();
        alice.introduceYourself();

        vittoria.lie(giuliana);

        //Caso seja um bate papo "real" so tirar o código abaixo de comentário abhahha
        // Bate papo entre uma pessoa e uma blogueirinha
        /* Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Pessoa 1 digite seu nome e em seguida a idade: ");

        String namePerson1 = myScanner.nextLine();
        int agePerson1 = Integer.parseInt(myScanner.nextLine());

        Person person1 = new Person(namePerson1, agePerson1);

        System.out.println("Blogueirinha digite seu nome e em seguida a idade: ");

        String namePerson2 = myScanner.nextLine();
        int agePerson2 = Integer.parseInt(myScanner.nextLine());

        Blogger person2 = new Blogger(namePerson2, agePerson2);
        exitChat = false;

        while(!exitChat){
            System.out.println(person1.getName() + " digite 1 para falar oi, 2 para se apresentar, " +
                               "3 para mentir para outra pessoa ou 4 para encerrar");

            readDecision(myScanner, person1, person2);

            if(exitChat){
                break;
            }

            System.out.println(person2.getName() + " digite 1 para falar oi, 2 para se apresentar, " +
                    "3 para mentir para outra pessoa ou 4 para encerrar");

            readDecision(myScanner, person2, person1);
        }*/
    }

    public static void readDecision(Scanner scanner, Person actionPerson, Person reactionPerson){
        switch(scanner.nextInt()){
            case 1:
                actionPerson.sayHello(reactionPerson);
                break;
            case 2:
                actionPerson.introduceYourself();
                break;
            case 3:
                actionPerson.lie(reactionPerson);
                break;
            default:
                exitChat = true;
                break;
        }
    }
}
