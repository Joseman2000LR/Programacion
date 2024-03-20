package ies.puerto.impl;

import ies.puerto.interfaz.ILecturaDatos;

public class LecturaDatosFicheros implements ILecturaDatos {

    @Override
    public String lectura() {
        return "Realizando la lectura el sistema del fichero";
    }

    @Override
    public String apertita() {
        return "Apriendo el sistema del fichero";
    }

    @Override
    public String cierre() {
        return "cerrando el sistema del fichero";
    }

}
