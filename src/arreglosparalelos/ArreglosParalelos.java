
package arreglosparalelos;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class ArreglosParalelos {

    
    public static void main(String[] args) {
         int numeroTrabajadores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de trabajadores a registrar"));
        String[] rfcs = new String[numeroTrabajadores];
        String[] nombres = new String[numeroTrabajadores];
        Double[] sueldos = new Double[numeroTrabajadores];
        int[] edades = new int[numeroTrabajadores];
        boolean salir= false;
        String[] trabajadores = new String[numeroTrabajadores];

        for(int i = 1; i <=numeroTrabajadores; i++){
        rfcs[i-1] = JOptionPane.showInputDialog("Ingresa el RFC del trabajador " + i);
        nombres[i-1] = JOptionPane.showInputDialog("Ingresa el nombre del trabajador " + i);
        sueldos[i-1] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el sueldo del trabajador " + i));
        edades[i-1] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del trabajador "+i));
        }

        do{
        int respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese alguna opción \n1)Desplegar en pantalla\n2)Ordenar por RFC(de menor a mayor)\n3)Ordenar por nombre(de menor a mayor)\n4)Ordenar por sueldo\n5)Busqueda por RFC\n6)Salida del programa"));

        for(int i = 0; i <numeroTrabajadores; i++){
            trabajadores[i] = "\nRfc: "+rfcs[i]+"\nNombre: " + nombres[i]+"\nSueldo: " + sueldos[i] + "\nEdad: " + edades[i]+"\n\n";
        }

        if(respuesta == 1){

            JOptionPane.showMessageDialog(null, Arrays.toString(trabajadores));
        }
        else if(respuesta ==2){
            String auxRfcs;
            String auxNombres;
            Double auxSueldos;
            int auxEdades;
            for (int i = 0; i < numeroTrabajadores; i++) {
                for (int j = i + 1; j < numeroTrabajadores; j++) {
                    
                    if (rfcs[i].compareTo(rfcs[j]) > 0) {

                        auxRfcs = rfcs[i];
                        rfcs[i] = rfcs[j];
                        rfcs[j] = auxRfcs;

                        auxNombres = nombres[i];
                        nombres[i] = nombres[j];
                        nombres[j] = auxNombres;

                        auxSueldos = sueldos[i];
                        sueldos[i] = sueldos[j];
                        sueldos[j] = auxSueldos;

                        auxEdades = edades[i];
                        edades[i] = edades[j];
                        edades[j] = auxEdades;


                    }
                }
            }
            for(int i = 0; i <numeroTrabajadores; i++){
                trabajadores[i] = "\nRfc: "+rfcs[i]+"\nNombre: " + nombres[i]+"\nSueldo: " + sueldos[i] + "\nEdad: " + edades[i]+"\n\n";
            }
        
            JOptionPane.showMessageDialog(null, Arrays.toString(trabajadores));
        }

        else if(respuesta ==3){
            String auxRfcs;
            String auxNombres;
            Double auxSueldos;
            int auxEdades;
            for (int i = 0; i < numeroTrabajadores; i++) {
                for (int j = i + 1; j < numeroTrabajadores; j++) {
                    
                    if (nombres[i].compareTo(nombres[j]) > 0) {

                        auxRfcs = rfcs[i];
                        rfcs[i] = rfcs[j];
                        rfcs[j] = auxRfcs;

                        auxNombres = nombres[i];
                        nombres[i] = nombres[j];
                        nombres[j] = auxNombres;

                        auxSueldos = sueldos[i];
                        sueldos[i] = sueldos[j];
                        sueldos[j] = auxSueldos;

                        auxEdades = edades[i];
                        edades[i] = edades[j];
                        edades[j] = auxEdades;

                    }
                }
            }
            for(int i = 0; i <numeroTrabajadores; i++){
                trabajadores[i] = "\nRfc: "+rfcs[i]+"\nNombre: " + nombres[i]+"\nSueldo: " + sueldos[i] + "\nEdad: " + edades[i]+"\n\n";
            }
        
            JOptionPane.showMessageDialog(null, Arrays.toString(trabajadores));
        }

        else if(respuesta ==4){
            String auxRfcs;
            String auxNombres;
            Double auxSueldos;
            int auxEdades;
            for (int i = 0; i < numeroTrabajadores; i++) {
                for (int j = i + 1; j < numeroTrabajadores; j++) {
                    
                    if (sueldos[i].compareTo(sueldos[j]) > 0) {

                        auxRfcs = rfcs[i];
                        rfcs[i] = rfcs[j];
                        rfcs[j] = auxRfcs;

                        auxNombres = nombres[i];
                        nombres[i] = nombres[j];
                        nombres[j] = auxNombres;

                        auxSueldos = sueldos[i];
                        sueldos[i] = sueldos[j];
                        sueldos[j] = auxSueldos;

                        auxEdades = edades[i];
                        edades[i] = edades[j];
                        edades[j] = auxEdades;


                    }
                }
            }
            for(int i = 0; i <numeroTrabajadores; i++){
                trabajadores[i] = "\nRfc: "+rfcs[i]+"\nNombre: " + nombres[i]+"\nSueldo: " + sueldos[i] + "\nEdad: " + edades[i]+"\n\n";
            }
        
            JOptionPane.showMessageDialog(null, Arrays.toString(trabajadores));
        }

        else if(respuesta==5){
            String rfc = JOptionPane.showInputDialog("Ingresa el RFC a buscar");
            boolean found = false;
            for(int i=0; i<numeroTrabajadores; i++){
                if(rfcs[i].equals(rfc)){
                    found=true;
                    JOptionPane.showMessageDialog(null, "USUARIO ENCONTRADO\nRFC: "+rfcs[i]+"\nNombre: " + nombres[i]+"\nSueldo: " + sueldos[i]+"\nEdad: "+edades[i]);
                }
            }
            if(!found){
                JOptionPane.showMessageDialog(null,"USUARIO NO ENCONTRADO");
            }
        }
        else if(respuesta==6){
            salir=true;
        }}while(!salir);
    }
}
    
    

