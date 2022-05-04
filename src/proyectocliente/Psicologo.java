/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocliente;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Psicologo extends Ingresar implements Mensaje {
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getEdad() {
        return edad;
    }

    @Override
    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String getCedula() {
        return cedula;
    }

    @Override
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    @Override
    public String getDiaN() {
        return diaN;
    }
    
    @Override
    public void setDiaN(String diaN) {
        this.diaN = diaN;
    }
    
    @Override
    public String getMesN() {
        return mesN;
    }
    
    @Override
    public void setMesN(String mesN) {
        this.mesN = mesN;
    }
    
    @Override
    public String getAñoN() {
        return añoN;
    }
    
    @Override
    public void setAñoN(String añoN) {
        this.añoN = añoN;
    }
    
    @Override
    public void mostrar(){
       JOptionPane.showMessageDialog(null,
               "Psicologo registrado.");
    }
    
}
