package org.example.csvReader;

public class Car {
    private final String name;
    private final int year;
    private final int selling_price;
    private final int km_driven;
    private final String fuel;
    private final String seller_type;
    private final String transmission;
    private final String owner;

    public Car(
            String name,
            int year,
            int selling_price,
            int km_driven,
            String fuel,
            String seller_type,
            String transmission,
            String owner
    ){
        this.name = name;
        this.year = year;
        this.selling_price = selling_price;
        this.km_driven = km_driven;
        this.fuel = fuel;
        this.seller_type = seller_type;
        this.transmission = transmission;
        this.owner = owner;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getSeller_type() {
        return seller_type;
    }

    public int getSelling_price() {
        return selling_price;
    }

    public int getYear() {
        return year;
    }

    public String getFuel() {
        return fuel;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getKm_driven() {
        return km_driven;
    }
}
