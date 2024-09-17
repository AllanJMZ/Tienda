
package Tienda;


public class Articulos {
    
    private String articulonombre;
    private  int art_cantidad;
    
    public Articulos(String articulonombre, int art_cantidad){
        this.articulonombre = articulonombre;
        this.art_cantidad = art_cantidad;
    }
    
        public String getListaArticulos(){
        return articulonombre;
    }
    
    public int getCantidad(){
        return art_cantidad;
    }
    
    public void setCantidad(int art_cantidad){
        this.art_cantidad = art_cantidad;
    }
    
    @Override
    public String toString(){
        return "Articulo: " + articulonombre + " " + art_cantidad + " unidades.";
    }
    
}
