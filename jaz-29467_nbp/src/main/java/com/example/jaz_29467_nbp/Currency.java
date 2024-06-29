package com.example.jaz_29467_nbp;
import jakarta.persistence.Id;
import java.util.Date;


public class Currency {
@Id
    private int id;
    private String currencyName;
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date startDate;
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date endDate;
    private float average;



public Currency (int id, String currencyName, Date startDate, Date endDate, float average ){
    this.id = id;
    this.currencyName = currencyName;
    this.startDate = startDate;
    this.endDate = endDate;
    this.average = average;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }
}





























// id autoincrement, jaka waluta, data poczatkowa, data koncowa, jaki sredni kurs, godzina wyslania zapytania