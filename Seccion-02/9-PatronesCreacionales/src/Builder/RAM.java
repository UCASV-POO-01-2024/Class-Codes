package Builder;

import Builder.Padres.Component;

public class RAM  extends Component{
    private int freq;
    private boolean rgb;

    public RAM() {

    }

    public RAM(int freq, boolean rgb) {
        this.freq = freq;
        this.rgb = rgb;
    }

    public RAM(String brand, String model, int freq, boolean rgb) {
        
        setBrand(brand);
        setModel(model);
        this.freq = freq;
        this.rgb = rgb;

    }

    public int getFreq() {
        return freq;
    }
    public void setFreq(int freq) {
        this.freq = freq;
    }
    public boolean isRgb() {
        return rgb;
    }
    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    
}
