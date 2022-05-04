/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocliente;


public abstract class Ingresar {
    protected String nombre;
    protected String edad;
    protected String cedula;
    protected String diaN;
    protected String mesN;
    protected String añoN;

    public Ingresar() {
        this.nombre = "";
        this.edad = "";
        this.cedula = "";
        this.diaN = "";
        this.mesN = "";
        this.añoN = "";
    }
    
    public abstract String getNombre();
    public abstract void setNombre(String nombre);
    public abstract String getEdad();
    public abstract void setEdad(String edad);
    public abstract String getCedula();
    public abstract void setCedula(String cedula);
    public abstract String getDiaN();
    public abstract void setDiaN(String diaN);
    public abstract String getMesN();
    public abstract void setMesN(String añoN);
    public abstract String getAñoN();
    public abstract void setAñoN(String añoN);
}
