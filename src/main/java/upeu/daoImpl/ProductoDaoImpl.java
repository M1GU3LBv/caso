/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import upeu.config.Conexion;
import upeu.dao.ProductoDao;
import upeu.entity.Producto;

/**
 *
 * @author admin
 */
public class ProductoDaoImpl implements ProductoDao{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(Producto p) {
        String SQL = "insert into producto (nombre,precio,stock,idcategoria) values(?,?,?,?)";
        int x = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecio());
            ps.setInt(3, p.getStock());
            ps.setInt(4, p.getIdcategoria());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int update(Producto p) {
        String SQL = "update producto set nombre=?, precio=?, stock=?, idcategoria=? where idproducto=?";
        int x = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecio());
            ps.setInt(3, p.getStock());
            ps.setInt(4, p.getIdcategoria());
            ps.setInt(5, p.getIdproducto());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int delete(int id) {
        String SQL = "delete from producto where idproducto=?";
        int x = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
              ps.setInt(1, id);
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public Producto read(int id) {
        String SQL = "Select *from producto where idproducto=?";
        Producto p = new Producto();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){                
                p.setIdproducto(rs.getInt("idproducto"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
                p.setIdcategoria(rs.getInt("idcategoria"));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return p;
    }

    @Override
    public List<Producto> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Map<String, Object>> readAll2() {
        String SQL = "select p.idproducto, p.nombre as producto, p.precio, p.stock, c.idcategoria, c.nombre as categoria from producto p " +
                     "inner join categoria c on p.idcategoria=c.idcategoria";
        List<Map<String, Object>> lista= new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Map<String, Object> map = new HashMap<>();
                map.put("idproducto", rs.getInt("idproducto"));
                map.put("producto", rs.getString("producto"));
                map.put("precio", rs.getDouble("precio"));
                map.put("stock", rs.getInt("stock"));
                map.put("idcategoria", rs.getInt("idcategoria"));
                map.put("categoria", rs.getString("categoria"));
                lista.add(map);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
}
