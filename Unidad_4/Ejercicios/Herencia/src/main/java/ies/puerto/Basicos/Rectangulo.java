public class Rectangulo extends Figura {
    double longitud;
    double anchura;

    public Rectangulo(String color, double longitud, double anchura) {
        super(color);
        this.longitud = longitud;
        this.anchura = anchura;
    }

    @Override
    public double calcularArea() {
        return longitud * anchura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }
}
