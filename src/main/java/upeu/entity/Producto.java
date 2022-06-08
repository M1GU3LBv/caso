
package upeu.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author admin
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Producto {
    private int idproducto;
    private String nombre;
    private double precio;
    private int stock;
    private int idcategoria;
}
