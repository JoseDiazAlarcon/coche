
package coche;

/**
 *
 * @author Fran
 */
public class Main {
    
      public static void main(String[] args) {
        Coche coche1;
        int stockActual;
        
        coche1 = new Coche("Opel",12000,500);
        try 
        {
            System.out.println("Venta de Coches");
            coche1.vender(300);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Coches");
            coche1.comprar(500);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
        stockActual = coche1.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
