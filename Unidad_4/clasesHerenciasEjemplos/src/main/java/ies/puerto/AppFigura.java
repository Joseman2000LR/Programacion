package ies.puerto;

class AppFigura {
    static Cuadrado cuadrado;
    static Triangulo triangulo;
    static Rectangulo rectangulo;

    public static void main(String[] args) {
        cuadrado = new Cuadrado(5.0f);
        System.out.println("Valor cuadrado : " + cuadrado);
        mostarArea(cuadrado);
        triangulo = new Triangulo(10f, 5f);
        System.out.println("Valor triangulo: " + triangulo);
        mostarArea(triangulo);
        rectangulo = new Rectangulo(4f, 10f);
        System.out.println("valor Retangulo" + rectangulo);
        mostarArea(rectangulo);
        System.out.println("valor de mi retangulo"+rectangulo.calucularArea());
    }

    public static void mostarArea(Figura figura) {
        System.out.println("Valor Area: " + figura.calucularArea());
    }
}