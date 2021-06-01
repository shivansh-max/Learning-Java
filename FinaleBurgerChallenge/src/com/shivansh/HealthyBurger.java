package com.shivansh;

public class HealthyBurger extends Hamburger{
    private String breadRollType;
    private String meat;
    private int countOfExtras;
    private int Count;
    private String E5;
    private String  E6;

    public HealthyBurger(String meat, String E1, String E2, String E3, String E4, String E5, String E6) {
        super("Brown Bread", meat, E1, E2, E3, E4);
        this.E6 = E6;
        this.E5 = E5;
        this.Count = super.getCount();
        if (E5 != "" && E6 != ""){
            Count += 2;
        }else if (E5 != ""){
            Count += 1;
        }
    }

    @Override
    public void getThePriceOfTheSidesAndWhatTheyAre() {
        super.getThePriceOfTheSidesAndWhatTheyAre();
        if (E5 != "") {
            System.out.println("Item Five = " + this.E5 + " price = 0.50 .");
        }else System.out.println("Item Five = " + this.E6 + " price = 0.00 .");
        if (E6 != "") {
            System.out.println("Item Six = " + this.E5 + " price = 0.50 .");
        }else System.out.println("Item Six = " + this.E6 + " price = 0.00 .");

//        System.out.println(this.Count);
    }

    @Override
    public double getPrice(int count) {
        double burgerValue = 5.00;
        double extraValue = 0.50;
        return (burgerValue + (count * extraValue));
    }

    @Override
    public String getBreadRollType() {
        return breadRollType;
    }

    @Override
    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    @Override
    public String getMeat() {
        return meat;
    }

    @Override
    public void setMeat(String meat) {
        this.meat = meat;
    }

    public int getCountOfExtras() {
        return countOfExtras;
    }

    public void setCountOfExtras(int countOfExtras) {
        this.countOfExtras = countOfExtras;
    }

       public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public String getE5() {
        return E5;
    }

    public void setE5(String e5) {
        E5 = e5;
    }

    public String getE6() {
        return E6;
    }

    public void setE6(String e6) {
        E6 = e6;
    }

    @Override
    public void payingTheMoney(String bankAccount) {
        double price = getPrice(this.Count);
        System.out.println("Thank you for shopping with us we have charged " + price + " on \non the bank acount of " +
                bankAccount + " .");
    }
}
