package Singleton;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        if(instance == null){
            System.out.println("Creando instancia de Singleton Eager");
            instance = new SingletonEager();
        }

        return instance;
    }

    public void printMessage(String msg){
        System.out.println(msg);
    }
}
