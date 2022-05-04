/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocliente;

/**
 *
 * @author Asus
 */
public abstract class Patrocinio {
    protected String nombre;
    protected String dueño;
    protected String dinero;

    public Patrocinio() {
        this.nombre = "";
        this.dueño = "";
        this.dinero = "";
    }
    
    public abstract String getNombre();
    public abstract void setNombre(String nombre);
    public abstract String getDueño();
    public abstract void setDueño(String dueño);
    public abstract String getDinero();
    public abstract void setDinero(String dinero);
    
}
