public class Main {
    public static void main(String[] args){
        File f1 = new File("log.txt",235,"Hola Mundo");
        File f2 = new File("test.cpp",30,"#include <iostream>");
        File f3 = new File("reporte.docx",900,"INTRODUCCIÓN");
        File f4 = new File("mi vida.mp3",500,"0101011101010101001");
        File f5 = new File("Main.class",10,"11010101001001010000101011");

        Folder fo1 = new Folder("colección");
        Folder fo2 = new Folder("miscelanous");
        Folder fo3 = new Folder("recuerdos");
        Folder fo4 = new Folder("musica");
        Folder fo5 = new Folder("tareas");

        fo5.addComponent(f4);
        fo4.addComponent(f2);
        fo4.addComponent(f3);
        fo3.addComponent(fo4);
        fo3.addComponent(fo5);
        fo2.addComponent(f1);
        fo1.addComponent(fo2);
        fo1.addComponent(fo3);
        fo1.addComponent(f5);

        System.out.println("Tamaño total: "+fo1.getSize()+" bytes");

        f5.dumpContents();
        System.out.println("------------------");
        fo4.dumpContents();
        System.out.println("------------------");
        fo1.dumpContents();
    }
}
