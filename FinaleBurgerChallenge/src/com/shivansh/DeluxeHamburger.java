package com.shivansh;

public class DeluxeHamburger extends Hamburger {
    private String breadRollType;
    private String meat;
    private int countOfExtras;
    private int Count;

    public DeluxeHamburger(String breadRollType, String meat) {
        super(breadRollType, meat, "Fries", "Chips", "", "");
    }

    @Override
    public void getThePriceOfTheSidesAndWhatTheyAre() {
        super.getThePriceOfTheSidesAndWhatTheyAre();

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

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    @Override
    public double getPrice(int count) {
        return super.getPrice(count) + 2.00;
    }

    @Override
    public void payingTheMoney(String bankAccount) {
        super.payingTheMoney(bankAccount);
    }
}
