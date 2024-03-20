package ies.puerto;

public abstract class Figura {
    private float base;
    private float altura;
    private float profundidades;

    public Figura() {

    };

    public Figura(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Figura(float base, float altura, float profundidades) {
        this.base = base;
        this.altura = altura;
        this.profundidades = profundidades;
    }

    public abstract float calucularArea();

    public float getBase() {
        return this.base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getProfundidades() {
        return this.profundidades;
    }

    public void setProfundidades(float profundidades) {
        this.profundidades = profundidades;
    }

    @Override
    public String toString() {
        return " base = " + getBase() +
                " altura = " + getAltura() +
                " profundidades = " + getProfundidades();
    }

}
