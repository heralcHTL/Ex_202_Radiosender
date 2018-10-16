/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
 * @author Alex
 */
public class Sender {
    private String sender;
    private Double frequenz;
    private String band;

    public Sender(String sender, Double frequenz, String band) {
        this.sender = sender;
        this.frequenz = frequenz;
        this.band = band;
    }

    public String getSenderName() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Double getFrequenz() {
        return frequenz;
    }

    public void setFrequenz(Double frequenz) {
        this.frequenz = frequenz;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }
}
