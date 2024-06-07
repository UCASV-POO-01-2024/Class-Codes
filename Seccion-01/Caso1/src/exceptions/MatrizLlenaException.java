package exceptions;

public class MatrizLlenaException extends Exception {
    @Override
    public String toString() {
        return "Fijate que viene siendo que la matriz ya está llena, no se puede añadir otra habitación, viejito.";
    }
}
