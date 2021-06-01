package com.shivansh;

import java.util.ArrayList;

public class  Contacts {
    private ArrayList<String> contacts = new ArrayList<String >();

    public void addAMember(String contact){
        if (findAPosition(contact) < 0){
            contacts.add(contact);
            System.out.println(contact + " added to the app.");
        }else{
            System.out.println(contact + " is already in your list.");
        }

    }

    public void removeAMember(String Member){
        int index = findAPosition(Member);
        if (index > 0){
            contacts.remove(Member);
            System.out.println(Member + " has been removed from the app.");
        }else{
            System.out.println("Sorry couldn't find that member.");
        }

    }

    public void modifyMember(String member, String newMember){
        int index = findAPosition(member);
        if (index > 0){
            contacts.set(index, newMember);
            System.out.println(member + " has been modified to " + newMember + ".");
        }else{
            System.out.println("Sorry couldn't find that member.");
        }
    }

    private int findAPosition(String Member){ return contacts.indexOf(Member); }

    public void findContact(String name){
        int position = findAPosition(name);
        if (position > 0){
            System.out.println("We have found " + name + " in your contacts list.");
        }else{
            System.out.println("We couldn't find " + name + " in your contact list.");
        }
    }

    public void printContactsList() {
        System.out.println("You have " + contacts.size() + " items in your contact list");
        for(int i=0; i< contacts.size(); i++) {
            System.out.println((i+1) + ". " + contacts.get(i));
        }
    }
}
