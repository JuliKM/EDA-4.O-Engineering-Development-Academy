
package Shogi;

import java.util.ArrayList;


public class Capturas {

    private ArrayList <Integer> SenteCap = new ArrayList();
    private ArrayList <Integer> GoteCap = new ArrayList();

    public ArrayList <Integer> getSenteCap() {
        return SenteCap;
    }

    public void setSenteCap(ArrayList <Integer> SenteCap) {
        this.SenteCap = SenteCap;
    }

    public ArrayList <Integer> getGoteCap() {
        return GoteCap;
    }

    public void setGoteCap(ArrayList <Integer> GoteCap) {
        this.GoteCap = GoteCap;
    }

    public Capturas() {
    }
    
    private void GuardarCapturada(){
        SenteCap.add(Integer.SIZE);
    }
}
