
package Controlador;

import Modelo.ConsultasUsuario;
import Modelo.Usuario;
import Vista.frmUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class CtrlUsuario implements ActionListener{
    private Usuario mod;
    private ConsultasUsuario modC;
    private frmUsuario frm;

    public CtrlUsuario(Usuario mod, ConsultasUsuario modC, frmUsuario frm) {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.btnInsertar.addActionListener(this);
        this.frm.btnActualizar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnListar.addActionListener(this);
    }
    
    public void iniciar(){
        frm.setTitle("Usuarios");
        frm.setLocationRelativeTo(null);
        frm.txtListar.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == frm.btnInsertar){
            mod.setNombre(frm.txtNombre.getText());
            mod.setEmail(frm.txtEmail.getText());
            
            if(modC.registrar(mod)){
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar");
                limpiar();
            }
        }
        if(e.getSource() == frm.btnActualizar){
            mod.setId(Integer.parseInt(frm.txtID.getText()));
            mod.setNombre(frm.txtNombre.getText());
            mod.setEmail(frm.txtEmail.getText());
            
            if(modC.modificar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar");
                limpiar();
            }
        }
        if(e.getSource() == frm.btnEliminar){
            mod.setId(Integer.parseInt(frm.txtID.getText()));
            
            
            if(modC.eliminar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        if(e.getSource() == frm.btnListar){
            mod.setId(Integer.parseInt(frm.txtID.getText()));
            
            
            if(modC.buscar(mod)){
                frm.txtID.setText(String.valueOf(mod.getId()));
                frm.txtNombre.setText(String.valueOf(mod.getNombre()));
                frm.txtEmail.setText(String.valueOf(mod.getEmail()));
                
               
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro");
                limpiar();
            }
        }
    }

    private void limpiar() {
        frm.txtID.setText(null);
        frm.txtNombre.setText(null);
        frm.txtEmail.setText(null);
    }
    
}
