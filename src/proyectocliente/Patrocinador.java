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
public class Patrocinador extends Patrocinio implements Mensaje {
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDueño() {
        return dueño;
    }

    @Override
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public String getDinero() {
        return dinero;
    }

    @Override
    public void setDinero(String dinero) {
        this.dinero = dinero;
    }
    
    
    @Override
    public void mostrar(){
       JOptionPane.showMessageDialog(null,
               "Patrocinador registrado.");
    }
}
