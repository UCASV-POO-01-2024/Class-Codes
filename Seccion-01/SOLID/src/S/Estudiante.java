package S;

import java.util.ArrayList;

public class Estudiante {
    private String carnet;
    private String nombre;
    private ArrayList<String> materias;
    private int[] uvs;
    private double[] notas;

    public Estudiante(String carnet, String nombre, ArrayList<String> materias, int[] uvs, double[] notas) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.materias = materias;
        this.uvs = uvs;
        this.notas = notas;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }

    public int[] getUvs() {
        return uvs;
    }

    public void setUvs(int[] uvs) {
        this.uvs = uvs;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
