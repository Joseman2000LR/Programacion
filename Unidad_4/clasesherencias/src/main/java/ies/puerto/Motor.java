package ies.puerto;

public class Motor extends Vehiculo {
    private String Matricula;

    public Motor(String color) {
        super(color);
    }

    public Motor() {
        super();
    }

    public Motor(String Matricula, String color) {
        super(color);
        this.Matricula = Matricula;

    }

    public String getMatricula() {
        return this.Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

}
