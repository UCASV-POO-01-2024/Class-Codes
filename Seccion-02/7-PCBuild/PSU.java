import Classes.Component;

public class PSU extends Component{
    private double voltage;
    private double current;
    private String certification;

    public double getVoltage() {
        return voltage;
    }
    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }
    public double getCurrent() {
        return current;
    }
    public void setCurrent(double current) {
        this.current = current;
    }
    public String getCertification() {
        return certification;
    }
    public void setCertification(String certification) {
        this.certification = certification;
    }
    
}
