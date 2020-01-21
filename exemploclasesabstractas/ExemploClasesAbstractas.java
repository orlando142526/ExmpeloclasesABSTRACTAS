
package exemploclasesabstractas;

import circulo.Circulo;


public class ExemploClasesAbstractas {

   
    public static void main(String[] args) {
       
        Poligonos tri = new Triangulo (4f,2f);
       tri.calcularArea();
        
       Poligonos rec = new Rectangulo(5f,3f);
       rec.calcularArea();
       Circulo c = new Circulo(2f);
       c.calcularArea();
    }
    
}
