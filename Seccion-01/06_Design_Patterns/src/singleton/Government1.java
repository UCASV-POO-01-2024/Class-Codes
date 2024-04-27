package singleton;

//Singleton Class
//Lazy version
public class Government1 {
    private static Government1 instance;

    private String leader;
    private String country;
    private String description;

    private Government1(String leader, String country, String description) {
        this.leader = leader;
        this.country = country;
        this.description = description;
    }

    public static Government1 getInstance(){
        if(instance == null){
            instance = new Government1("Lisan al-Gaib","Arrakis","Spicey");
        }

        return instance;
    }

    public String getLeader() {
        return leader;
    }

    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }
}
