package possystem;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author tylar
 */
public class Employee implements Serializable{
    
    //various info points for each employee
    private String name, phoneNumber;
    private double payRate;
    private int pin;
    private boolean clockedIn;
    private Date lastClock;
    private boolean manager;
    
    //basic constructor setting instance variables
    public Employee (String name, String phoneNumber, double payRate, int pin, boolean manager){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.payRate = payRate;
        this.pin = pin;
        this.clockedIn = false;
        this.lastClock = new Date(Calendar.getInstance().getTimeInMillis() - (5*60*1000));
        this.manager = manager;
    }
   
    //various getters and settings for employee info

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }
    
    public boolean getClockedIn() {
        return this.clockedIn;
    }
    
    public void clockOut(Date date){
        this.clockedIn = false;
        this.lastClock = date;
    }

    public void clockIn(Date date) {
        this.clockedIn = true;
        this.lastClock = date;
    }

    public Date getLastClock() {
        return this.lastClock;
    }    
    
    public void setPin(int pin){
        this.pin = pin;
    }
    
    public int getPin(){
        return this.pin;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    
    
}
