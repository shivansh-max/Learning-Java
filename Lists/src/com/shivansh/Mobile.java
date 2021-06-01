package com.shivansh;

import java.util.Scanner;

public class Mobile {
    private Scanner inputGetter = new Scanner(System.in);
    private Contacts contactApp = new Contacts();

    public void initializePhone (){
        System.out.println("This is a contact phone ! \n");
        printInstructions();
        boolean quit = false;

        while (!quit){
            String todo =  inputGetter.nextLine();
            switch (todo){
                case "0":
                    printInstructions();
                    break;
                case "1":
                    printOutListOfContacts();
                    break;
                case "2":
                    addAContact();
                    break;
                case "3":
                    modifyAContact();
                    break;
                case "4":
                    removeAContact();
                    break;
                case "5":
                    searchAContact();
                    break;
                case "6":
                    quit = true;
                    break;
            }
        }

    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts items.");
        System.out.println("\t 2 - To add an contact to the list.");
        System.out.println("\t 3 - To modify an contact in the list.");
        System.out.println("\t 4 - To remove an contact from the list.");
        System.out.println("\t 5 - To search for an contact in the list.");
        System.out.println("\t 6 - To shutdown.");
    }

    private void addAContact() {
        System.out.println("Please enter the name of your contact : ");
        String Member = inputGetter.nextLine();
        contactApp.addAMember(Member);
    }
    private void removeAContact() {
        System.out.println("Please enter the name of your contact : ");
        String Member = inputGetter.nextLine();
        contactApp.removeAMember(Member);
    }
    private void modifyAContact() {
        System.out.println("Please enter the name of your contact : ");
        String Member = inputGetter.nextLine();
        System.out.println("Please enter the name of your new content : ");
        String NewMember = inputGetter.nextLine();
        contactApp.modifyMember(Member, NewMember);
    }
    private void searchAContact() {
        System.out.println("Please enter the name of your contact : ");
        contactApp.findContact(inputGetter.nextLine());
    }
    private void printOutListOfContacts(){
        contactApp.printContactsList();
    }

}
