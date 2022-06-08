/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import java.util.Map;
import upeu.entity.Producto;


/**
 *
 * @author admin
 */
public interface ProductoDao {
    int create(Producto p);
    int update(Producto p);
    int delete(int id);
    Producto read(int id);
    List<Producto> readAll();
    List<Map<String, Object>> readAll2();
}
