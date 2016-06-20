package XML.HomeWork.Task3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ihor Solohub.
 */
@XmlRootElement(name = "rate")
public class Rate {
    private String name;
    private float rate;
    private String date;
    private String time;
    private float ask;
    private float bid;

    public Rate(){}

    public Rate(String name, float rate, String date, String time, float ask, float bid){
        this.name = name;
        this.rate = rate;
        this.date = date;
        this.time = time;
        this.ask = ask;
        this.bid = bid;
    }

    public String getName() {
        return name;
    }
@XmlElement(name = "Name")
    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }
@XmlElement(name = "Rate")
    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getDate() {
        return date;
    }
@XmlElement(name = "Date")
    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }
@XmlElement(name = "Time")
    public void setTime(String time) {
        this.time = time;
    }

    public float getAsk() {
        return ask;
    }
@XmlElement(name = "Ask")
    public void setAsk(float ask) {
        this.ask = ask;
    }

    public float getBid() {
        return bid;
    }
@XmlElement(name = "Bid")
    public void setBid(float bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return  "\n Name: " + name +
                "\n Rate: " + rate +
                "\n Date: " + date +
                "\n Time: " + time +
                "\n Ask:  " + ask +
                "\n Bid:  " + bid + '\n';
    }
}
