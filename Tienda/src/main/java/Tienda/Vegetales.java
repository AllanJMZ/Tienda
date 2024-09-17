
package Tienda;


public class Vegetales {
    
    private String vegetalnombre;
    private int veg_cantidad;

    
    public Vegetales(String vegetalnombre, int veg_cantidad){
        this.vegetalnombre = vegetalnombre;
        this.veg_cantidad = veg_cantidad;
    }
    
    public String getListaVegetales(){
        return vegetalnombre;
    }
    
    public int getCantidad(){
        return veg_cantidad;
    }
    
    public void setCantidad(int veg_cantidad){
        this.veg_cantidad = veg_cantidad;
    }
    
    @Override
    public String toString(){
        return "Vegetal: " + vegetalnombre + " " + veg_cantidad + " unidades.";
    }
    
    
}
