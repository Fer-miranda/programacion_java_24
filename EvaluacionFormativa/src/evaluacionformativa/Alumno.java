/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionformativa;
import java.util.Date;
/**
 *
 * @author munoz
 */
public class Alumno {
    private String rut;
    private String nombre;
    private int edad;
    private Date fecha_nacimiento;

    public Alumno(String rut, String nombre, int edad, Date fecha_nacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    
    
}
