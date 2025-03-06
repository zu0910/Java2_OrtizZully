/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Uniminuto Tibu
 */
public class factura {
    public interface IOad {
        void Insert(Object entity);
        void Update(Object id, Object entity);
        void Delete(Object id);
    }

    public interface Read {
        Object[] GetAll();
        Object GetById(Object id);
    }
    
    public abstract class FacturaOadDatosReadOnly implements Read {
    
        public Object[] GetAll() {
            return null;
        }
        public Object GetById(Object id) {
            return null;
        }
}
}
