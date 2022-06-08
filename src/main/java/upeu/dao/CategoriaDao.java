/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import upeu.entity.Categoria;


/**
 *
 * @author admin
 */
public interface CategoriaDao {
    int create(Categoria c);
    int update(Categoria c);
    int delete(int id);
    Categoria read(int id);
    List<Categoria> readAll();
}
