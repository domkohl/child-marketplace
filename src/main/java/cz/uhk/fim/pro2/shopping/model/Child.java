package cz.uhk.fim.pro2.shopping.model;

import java.util.Date;

public class Child {
    private String personalId;
    private String displayName;
    private double price;
    private double weight;
    private Date birthDate;
    private GenderType gender;
    private boolean race;
    private int skinTone;

    public Child() {
    }

    public Child(String personalId, String displayName, double price, double weight, Date birthDate, GenderType gender, boolean race, int skinTone) {
        this.personalId = personalId;
        this.displayName = displayName;
        this.price = price;
        this.weight = weight;
        this.birthDate = birthDate;
        this.gender = gender;
        this.race = race;
        this.skinTone = skinTone;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public boolean isRace() {
        return race;
    }

    public void setRace(boolean race) {
        this.race = race;
    }

    public int getSkinTone() {
        return skinTone;
    }

    public void setSkinTone(int skinTone) {
        this.skinTone = skinTone;
    }

    @Override
    public String toString() {
        return "Child{" +
                "personalId='" + personalId + '\'' +
                ", displayName='" + displayName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", race=" + race +
                ", skinTone=" + skinTone +
                '}';
    }
}
