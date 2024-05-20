public class File implements FileSystemComponent {
    private String name;
    private int size;
    private String content;

    public File(String name, int size, String content) {
        this.name = name;
        this.size = size;
        this.content = content;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void dumpContents() {
        System.out.println("Mi contenido es: "+content);
    }
}
