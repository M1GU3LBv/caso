
package upeu.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import upeu.config.Conexion;
import upeu.dao.CategoriaDao;
import upeu.entity.Categoria;

/**
 *
 * @author admin
 */
public class CategoriaDaoImpl implements CategoriaDao{
   private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx; 

    @Override
    public int create(Categoria c) {
        String SQL = "insert into categoria (nombre) values(?)";
        int x = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, c.getNombre());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int update(Categoria c) {
        String SQL = "update categoria set nombre=? where idcategoria=?";
        int x = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, c.getNombre());
            ps.setInt(2, c.getIdcategoria());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int delete(int id) {
        String SQL = "delete from categoria where idcategoria=?";
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
    public Categoria read(int id) {
        String SQL = "Select *from categoria where idcategoria=?";
        Categoria c = new Categoria();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){                
                c.setIdcategoria(rs.getInt("idcategoria"));
                c.setNombre(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return c;
    }

    @Override
    public List<Categoria> readAll() {
        String SQL = "Select *from categoria";
        List<Categoria> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Categoria c = new Categoria();                
                c.setIdcategoria(rs.getInt("idcategoria"));
                c.setNombre(rs.getString("nombre"));
                lista.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
}
