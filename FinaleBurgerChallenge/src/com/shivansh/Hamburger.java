package com.shivansh;

public class Hamburger {
    private String breadRollType;
    private String meat;
    private int countOfExtras;
    private String E1;
    private String E2;
    private String E3;
    private String E4;
    private int Count;

    public Hamburger(String breadRollType, String meat, String E1, String E2, String E3,
                         String E4) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.countOfExtras = countOfExtras;
        this.E1 = E1;
        this.E2 = E2;
        this.E3 = E3;
        this.E4 = E4;
        this.Count = 0;
        if (E1 != "" && E2 != "" && E3 != "" && E4 != ""){
            Count += 4;
        }else if (E1 != "" && E2 != "" && E3 != ""){
            Count += 3;
        }else if (E1 != "" && E2 != ""){
            Count += 2;
        }else if (E1 != ""){
            Count += 1;
        }
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void getThePriceOfTheSidesAndWhatTheyAre(){
        if (E1 != "") {
            System.out.println("Item One = " + this.E1 + " price = 0.50 .");
        }else System.out.println("Item One = " + this.E1 + " price = 0.00 .");
        if (E2 != "") {
            System.out.println("Item Two = " + this.E2 + " price = 0.50 .");
        }else System.out.println("Item Two = " + this.E2 + " price = 0.00 .");
        if (E3 != "") {
            System.out.println("Item Three = " + this.E3 + " price = 0.50 .");
        }else System.out.println("Item Three = " + this.E3 + " price = 0.00 .");
        if (E4 != "") {
            System.out.println("Item Four = " + this.E4 + " price = 0.50 .");
        }else System.out.println("Item Four = " + this.E4 + " price = 0.00 .");
    }

    public double getPrice(int count) {
        double burgerValue = 5.00;
        double extraValue = 0.50;
        return (burgerValue + (count * extraValue));
    }

    public int getCount() {
        return Count;
    }

    public void payingTheMoney(String bankAccount) {
        double price = getPrice(Count);
        System.out.println("Thank you for shopping with us we have charged " + price + " on \non the bank acount of " +
                bankAccount + " .");
    }

}
