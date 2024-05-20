import java.util.ArrayList;
import java.util.Iterator;

public class Folder implements FileSystemComponent{
    private String name;
    private ArrayList<FileSystemComponent> contents;

    public Folder(String name){
        this.name = name;
        contents = new ArrayList<FileSystemComponent>();
    }

    public void addComponent(FileSystemComponent fc){
        if(!searchComponent(fc.getName())) {
            contents.add(fc);
        }
    }

    public void deleteComponent(String name){
        if(searchComponent(name)){
            contents.remove(getComponent(name));
        }
    }

    public boolean searchComponent(String name){
        Iterator<FileSystemComponent> iter = contents.iterator();
        boolean ans = false;
        while(iter.hasNext()){
            if(iter.next().getName().equals(name)){
                ans = true;
                break;
            }
        }
        return ans;
    }

    private FileSystemComponent getComponent(String name){
        Iterator<FileSystemComponent> iter = contents.iterator();
        FileSystemComponent ans = null;
        while(iter.hasNext()){
            ans = iter.next();
            if(ans.getName().equals(name)){
                break;
            }
        }
        return ans;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        Iterator<FileSystemComponent> iter = contents.iterator();
        int acum = 0;
        while(iter.hasNext()){
            acum += iter.next().getSize();
        }

        return acum;
    }

    @Override
    public void dumpContents() {
        Iterator<FileSystemComponent> iter = contents.iterator();
        System.out.println("Soy "+name+" y mi contenido compuesto es:");
        while(iter.hasNext()){
            iter.next().dumpContents();
        }
    }
}
