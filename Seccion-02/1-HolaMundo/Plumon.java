// Clase Plumon, debe llamarse igual que el archivo que la contiene
public class Plumon {
    // Atributo (característica) 'color' dentro de la clase 'Plumon'
    String color;

    // Método constructor de la Clase 'Plumon', debe llamarse igual que la Clase que lo contiene
    // Este inicializa los atributos dentro de la Clase al instanciar un Objeto
    public Plumon(String color) {
        // Se usa la palabra reservada 'this' para hacer referencia a algo dentro de la Clase
        // Podría usarse this.color o this.Escribir("texto") ya que ambos son componentes directo de la Clase
        // Básicamente, al poner this decimos 'esta clase': 'esta clase'.color o 'esta clase'.Escribir("texto")
        this.color = color;
    }

    // Método (acción) 'Escribir()' dentro de la clase 'Plumon'
    public void Escribir(String texto) {
        // Imprimir en consola
        System.out.println("Texto en color " + color + ": " + texto);
    }
}