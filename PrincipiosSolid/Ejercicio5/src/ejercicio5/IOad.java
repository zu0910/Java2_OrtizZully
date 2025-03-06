/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;


public interface IOad {
    void Insert(Object entity);
    void Update(Object id, Object entity);
    void Delete(Object id);
}

public interface Read {
    Object[] GetAll();
    Object GetById(Object id);
}

