package calendar.com.co.practicaappgranja;

import android.widget.ImageButton;

public class ItemGuia {
    private Integer imagen;
    private String title;
    private String descripcion;

    public ItemGuia(){}

    public ItemGuia(Integer imagen, String title, String descripcion) {
        this.imagen = imagen;
        this.title = title;
        this.descripcion = descripcion;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
