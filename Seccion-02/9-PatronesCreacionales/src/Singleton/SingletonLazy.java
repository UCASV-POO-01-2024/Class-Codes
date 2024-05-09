package Singleton;

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        if(instance == null){
            System.out.println("Creando instancia de Singleton Lazy");
            instance = new SingletonLazy();
        }

        return instance;
    }

    public void printMessage(String msg){
        System.out.println(msg);
    }
}
