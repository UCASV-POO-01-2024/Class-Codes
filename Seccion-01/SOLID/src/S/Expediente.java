package S;

public class Expediente {
    public double calcularCUM(Estudiante e){
        int[] uvs = e.getUvs();
        int n = uvs.length;
        double[] notas = e.getNotas();

        double acumProd = 0;
        int acumUVs = 0;
        for(int i=0; i<n; i++){
            acumProd += uvs[i] * notas[i];
            acumUVs += uvs[i];
        }

        return acumProd/acumUVs;
    }

    public void mostrarCUM(Estudiante e){
        System.out.println("El CUM del estudiante "+e.getCarnet()+" es: "+calcularCUM(e));
    }
}
