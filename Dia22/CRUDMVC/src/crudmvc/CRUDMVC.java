
package crudmvc;

import Controlador.CtrlUsuario;
import Modelo.ConsultasUsuario;
import Modelo.Usuario;
import Vista.frmUsuario;

public class CRUDMVC {

    
    public static void main(String[] args) {
        Usuario mod = new Usuario();
        ConsultasUsuario modC = new ConsultasUsuario();
        frmUsuario frm = new frmUsuario();
        
        CtrlUsuario ctrl = new CtrlUsuario(mod,modC, frm);
        ctrl.iniciar();
        
        frm.setVisible(true);
    }
    
}
