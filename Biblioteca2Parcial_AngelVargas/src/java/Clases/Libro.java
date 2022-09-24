/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Libro {
    private int codigo;
    private String nombre;
    private String pasta;
    private String editorial;
    private String publicacion;
    private int tipo;

    
    public Libro(int codigo, String nombre, String pasta, String editorial, String publicacion, int tipo){
        this.codigo=codigo;
        this.nombre=nombre;
        this.pasta=pasta;
        this.editorial=this.editorial;  
        this.publicacion=publicacion;
        this.tipo=tipo;   
    }
    
    public Libro(){
        this.nombre="Libro de ejemplo";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasta() {
        return pasta;
    }

    public void setPasta(String pasta) {
        this.pasta = pasta;
    }

    public String getEditorial() {
        return editorial;
    }
    
     public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
        
        
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
        public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
