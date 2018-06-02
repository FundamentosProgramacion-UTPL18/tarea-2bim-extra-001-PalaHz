/*
                Agosto		Octubre		Diciembre	Total		Promedio

sucural 1	4500.2		1500.2		2300.2		x		x
sucural 2	4500.2		1500.2		2300.2		x		x
sucural 3	4500.2		1500.2		2300.2		x		x
sucural 4	4500.2		1500.2		2300.2		x		x

Totales de ventas de todas la sucursales es: x	
*/
package tarea2bimextraclase;
public class Tarea2BimExtraClase {
    public static void main(String[] args) {
        
        //Inicialización de arreglos
        String [] meses = {"Agosto", "Octubre","Diciembre"};
        String [] sucursales = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};
        double [] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double [] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double [] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};
        double total_ventas = 0;
        double [] venta_total_sucursal = new double[4];
        double [] venta_promedio_sucursal = new double[4];
        
        //Encabezado de cadena final
        String cadenafinal = ("\t\nREPORTE DE VENTAS POR MES:\n\n");
        for (int contador = 0; contador < meses.length; contador++){
            cadenafinal = String.format("%s\t\t%s",cadenafinal,meses[contador]);
        }
        cadenafinal = String.format("%s\tTotal\t\tPromedio\n",cadenafinal);
        
        //Generación de totales y promedios
        for (int contador = 0; contador < sucursales.length; contador++){
            venta_total_sucursal[contador] = ventas_mes_1[contador] + ventas_mes_2[contador] + ventas_mes_3[contador]; 
            venta_promedio_sucursal[contador] = venta_total_sucursal[contador] / meses.length;
            total_ventas = total_ventas + venta_total_sucursal[contador];
            
            //Entrada de datos en cadena final
            cadenafinal = String.format ("%ssucursal %s\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\n"
                ,cadenafinal,contador+1,ventas_mes_1[contador],ventas_mes_2[contador],ventas_mes_3[contador]
                ,venta_total_sucursal[contador],venta_promedio_sucursal[contador]);
        }
        
        //Añadir el total e imprimir la cadena
        cadenafinal = String.format("%s\n\nTotales de ventas de todas la sucursales es: %.2f\n\n", cadenafinal, total_ventas);
        System.out.print(cadenafinal);
    }
}
