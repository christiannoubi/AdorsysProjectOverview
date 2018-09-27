package de.Adorsys.projectoverview.domain;

import java.sql.Time;
import java.util.Date;

public class Description {

    private Date calenderWeeks;
    private Time time;
    private double budget;
    private double quality;
    private String clientSatisfaction;

    public Date getCalenderWeeks() {
        return calenderWeeks;
    }

    public void setCalenderWeeks(Date calenderWeeks) {
        this.calenderWeeks = calenderWeeks;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }

    public String getClientSatisfaction() {
        return clientSatisfaction;
    }

    public void setClientSatisfaction(String clientSatisfaction) {
        this.clientSatisfaction = clientSatisfaction;
    }
}
