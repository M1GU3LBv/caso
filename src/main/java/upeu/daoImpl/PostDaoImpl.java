package upeu.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import upeu.config.Conexion;
import upeu.dao.PostDao;
import upeu.entity.Post;


/**
 *
 * @author admin
 */
public class PostDaoImpl implements PostDao{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    @Override
    public int create(Post post) {
        String SQL = "insert into post (titulo,descripcion) values(?,?)";
        int x = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, post.getTitulo());
            ps.setString(2, post.getDescripcion());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int update(Post post) {
        String SQL = "update post set titulo=?, descripcion=? where idpost=?";
        int x = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, post.getTitulo());
            ps.setString(2, post.getDescripcion());
            ps.setInt(3, post.getIdpost());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int delete(int idpost) {
       String SQL = "delete from post where idpost=?";
        int x = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, idpost);
            x = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public Post read(int idpost) {
        String SQL = "Select *from post where idpost=?";
        Post p = new Post();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, idpost);
            rs = ps.executeQuery();
            while(rs.next()){                
                p.setIdpost(rs.getInt("idpost"));
                p.setTitulo(rs.getString("titulo"));
                p.setDescripcion(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return p;        
    }

    @Override
    public List<Post> readAll() {
        String SQL = "Select *from post";
        List<Post> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Post p = new Post();
                p.setIdpost(rs.getInt("idpost"));
                p.setTitulo(rs.getString("titulo"));
                p.setDescripcion(rs.getString("descripcion"));
                lista.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
        
    }
    
}
