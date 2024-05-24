package singleton;

//Singleton Class
//Eager version
public class Government2 {
    private static Government2 instance;

    private String leader;
    private String country;
    private String description;

    private Government2(String leader, String country, String description) {
        this.leader = leader;
        this.country = country;
        this.description = description;
    }

    public static void initializeInstance(){
        if(instance == null){
            instance = new Government2("Lex Luthor","Metropolis","Xenophobia");
        }else System.out.println("Instance already initialized.");
    }

    public static Government2 getInstance(){
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
