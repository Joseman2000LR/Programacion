/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.puerto.modelo.file.interfaces;

import ies.puerto.modelo.entity.Personaje;
import java.util.List;

/**
 *
 * @author josem
 */
public  interface IFicheros{

    public List<Personaje> leer();
    public boolean eliminar(String path);
    public boolean existe(String path);
    public boolean actualizar(List<Personaje> personas);
    public boolean escribir(List<Personaje> personas);
    public boolean modificar(List<Personaje> personas);

}
