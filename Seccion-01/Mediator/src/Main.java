public class Main {
    public static void main(String[] args){
        EmpleadoMediator med = new EmpleadoMediator();
        Cajero c1 = new Cajero(med,"201","Michael","Cashier");
        Cajero c2 = new Cajero(med,"202","Fatima","Cashier");
        Cajero c3 = new Cajero(med,"203","Karla","Cashier");
        Cajero c4 = new Cajero(med,"204","Julia","Cashier");
        Gerente g1 = new Gerente(med,"101","Rupert","Manager");
        Gerente g2 = new Gerente(med,"102","Sophia","Manager");
        CEO ceo = new CEO(med,"001","Steven","CEO");

        med.add(c1); med.add(c2); med.add(c3); med.add(c4);
        med.add(g1); med.add(g2);
        med.add(ceo);

        //------------------
        ceo.sendMessage("Increase earnings","101");
        ceo.sendMessage("Reduce costs","102");
        g1.sendMessage("You'll work 2 more hours each day","201");
        g1.sendMessage("You'll work 1 more hours each day","202");
        c1.sendMessage("No, please.","101");
        c2.sendMessage("Whatever you say, boss","101");
        g1.sendMessage("Everything is a-ok","001");
        g2.sendMessage("Say goodbye to your bonus","203");
        g2.sendMessage("You're fired","204");
        c3.sendMessage("...ok","102");
        c4.sendMessage("help","001");
        g2.sendMessage("Problem solved","001");
        c1.sendMessage("Let's go drink...","203");
        g1.sendMessage("Let's go drink!","102");
    }
}
