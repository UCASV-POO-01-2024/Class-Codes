import wrappers.MenuLoginWrapper;
import menufactory.MenuFactory;
import menufactory.MenuLoginFactory;
import wrappers.BaseWrapper;

public class Main {
    public static void main(String[] args) {
        MenuFactory mf = new MenuLoginFactory();
        BaseWrapper bw = new MenuLoginWrapper(mf.createMenu());

        bw.hacer();
    }
}
