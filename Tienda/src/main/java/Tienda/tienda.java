
package Tienda;

import java.util.ArrayList;


public class tienda {
    private ArrayList<Vegetales> vegetales; 
    private ArrayList<Articulos> articulos; 
    
    public tienda(){
        this.vegetales = new ArrayList<>();
        this.articulos = new ArrayList<>();
    }

    public void agregarVegetal(Vegetales vegetal){
        for (Vegetales v : vegetales) {
        }
        vegetales.add(vegetal);
    }
    
    public Vegetales buscarVegetales(String vegetalNombre){
        for (Vegetales v : vegetales) {
            if (v.getListaVegetales().equals(vegetalNombre)) {
                return v;
            }
        }
        return null;
    }
    
    public void agregarArticulo(Articulos articulo){
        for (Articulos a : articulos){
            
        }
        articulos.add(articulo);
    }
    
    public Articulos buscarArticulos(String articuloNombre){
        for (Articulos a : articulos) {
            if (a.getListaArticulos().equals(articuloNombre)) {
                return a;
            }
        }
        return null;
    }    
    
    
    public ArrayList<Vegetales> getVegetales(){
        return vegetales;
    }
    
    public void imprimirVegetales(){
        for (Vegetales v : vegetales) {
            System.out.println(v);
        }
    }
    
    public ArrayList<Articulos> getArticulos(){
        return articulos;
    }
    
    public void imprimirArticulos(){
        for (Articulos a : articulos) {
            System.out.println(a);
        }
    }
    
    public tienda(ArrayList<Vegetales> vegetales, ArrayList<Articulos> articulos) {
        this.vegetales = vegetales;
        this.articulos = articulos;
    }
    
    public void imprimirTodoslosProductos(){
        for (Vegetales v: vegetales) {
            System.out.println(v);
        }
        for (Articulos a: articulos) {
            System.out.println(a);
        }        
    }
    
}
