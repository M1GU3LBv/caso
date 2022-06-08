/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import upeu.entity.Post;


/**
 *
 * @author admin
 */
public interface PostDao {
    int create(Post post);
    int update(Post post);
    int delete(int idpost);
    Post read(int idpost);
    List<Post> readAll();
}
