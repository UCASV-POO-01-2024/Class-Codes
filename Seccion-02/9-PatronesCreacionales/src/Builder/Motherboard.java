package Builder;

import Builder.Padres.Component;

public class Motherboard extends Component {
    private CPU cpu;
    private RAM ram;
    private Storage storage;
    private PSU powerSupply;
    
    public CPU getCpu() {
        return cpu;
    }
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    public RAM getRam() {
        return ram;
    }
    public void setRam(RAM ram) {
        this.ram = ram;
    }
    public Storage getStorage() {
        return storage;
    }
    public void setStorage(Storage storage) {
        this.storage = storage;
    }
    public PSU getPowerSupply() {
        return powerSupply;
    }
    public void setPowerSupply(PSU powerSupply) {
        this.powerSupply = powerSupply;
    }
    public void setOS(OS os){
        this.storage.setOperatingSystem(os);
    }
    
}
