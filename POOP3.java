/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author marif
 */
public class POOP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("################ Arreglos ##############");
        System.out.println("Formas de representar arreglos en java");
        int nums[];
        int[] nums2;
        int [] nums3;
        int []nums4;
        int[] nums5 = {1,2,3,4,5,6,7,8,9,10};
    //Ejemplo de ejercicio de examen final, ¿Cual seria la salida? o si yo quiero esta salida que esta mal    
        System.out.println("################ for ##############");
        
        for (int i = 0; i < nums5.length; i++) {
            System.out.println("Elemento ["+i+"]="+nums5[i]);
        }
        for(int temp : nums5){
            System.out.println("Elemento: " +temp);
        }
        System.out.println("################ String ##############");
        String s = new String("Hola mundo");//Correcta
        String s1 = "Hola mundo";//Forma recomendada
        System.out.println(s);
        System.out.println(s1);
        
        System.out.println("################ String operador mas ##############");

        String nombre = "Fer";
        String apellido = "Ordoñez";
        String nombreCompleto = nombre +" "+ apellido;
        System.out.println(nombreCompleto);
        
        
        System.out.println("################ Operado punto ##############");
        
        System.out.println("Arreglo nums5 tiene " +nums5.length+ " elementos");
        //numero de elementos de la variable String nombre
        System.out.println(nombre.length());//Este lenght es una subrutina
        //numero de elementos de la variable String nombreCompleto
        System.out.println(nombreCompleto.length());
        
        System.out.println("################  Wrapper y Autoboxing ##############");
        int a = 3;
        //un autoboxing para crecer sus capacidades
        Integer b = new Integer(22);//Correcto peero esta deprecado, ya no se usa
        //Un 33 que esta en la cajita
        Integer c = 33; //Recomendado
       
        int d = c;
        //valor que tendria d
        System.out.println(d);
        //para que pueda pasar esto se tiene que String cadena = a;
        Integer e = a;
        //Casteo
        String cadena = e.toString();
        System.out.println("Valor de a = " +cadena);
        
        String f = a+"";
        System.out.println("Elementos de f = " +f.length());
        System.out.println("################   Colecciones  ##############");
        System.out.println("################   ArrayList  ##############");
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(11);
        miArrayList.add(33);
        miArrayList.add(44);
        //Aqui se tomo en cuenta el tamaño del array como size
        System.out.println("Tamaño de ArrayList: "+miArrayList.size());
        //añadir un elemento en una posicion
        miArrayList.add(1, 22);
        System.out.println("Tamaño de AL: "+miArrayList.size());
        System.out.println("****");
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
        miArrayList.add(1, 15);
        System.out.println("****");
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
        System.out.println("################   Hashtable  ##############");
        //añadio la biblioteca de hash como paso con array
        Hashtable<String,Integer> miTabla = new Hashtable<String, Integer>();
        //(set,lista)
        miTabla.put("Uno", 1);
        miTabla.put("Antonio", 55667788 );
        miTabla.put("Jorge", 55993322);
        System.out.println("Elementos en la tabla: " +miTabla.size());
        for (Integer value : miTabla.values()) {
            System.out.println(value);
        }
        for (String k : miTabla.keySet()) {
            System.out.println(k);
        }
        
        System.out.println("################   Enumeracion  ##############");
        String llave;
        Integer valor;
        //Se importa bibliotaca
        Enumeration<String> llavesEnumeradas = miTabla.keys();
        //mientras llaves enumeradas existan
        while(llavesEnumeradas.hasMoreElements()){
            //next elements es el siguiente elemento
            llave = llavesEnumeradas.nextElement();
            valor = miTabla.get(llave);
            System.out.println("llave: "+llave+" - valor: "+valor);
        }
        
        
        
       System.out.println("################   Date - Utileria  ##############");
       //importando utileria
       Date hoy = new Date();
       //Fecha de hoy, de parte del sistema
        System.out.println(hoy);
        System.out.println("################   Calendar - Utileria  ##############");
        //importando utileria
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);
        
        
        
        
        
        System.out.println("################EJERCICIOS PARA CASA##################");
        //Realizar un diccionariio con 5 palabras usando una hashtable, de lo que sea
        //Realizar una agenda con 5 elementos, guardando nombre de la persona "jorge" y 
        //su cumpleaños elemento de tipo calendar "15-junio"
        //guardando su cumple en un calendario
        // Diccionario con 5 palabras usando Hashtable
        Hashtable<String, String> diccionario = new Hashtable<String, String>();
        diccionario.put("Avion", "Medio de transporte aereo");
        System.out.println("Elementos en el diccionario: " + diccionario.size());
         
        for (String value : diccionario.values()) {
            System.out.println(value);
        }
         
        for (String k : diccionario.keySet()) {
            System.out.println(k);
        }
        

        System.out.println("################   Agenda  ##############");

        Hashtable<String, Calendar> agenda = new Hashtable<>();
        agenda.put("Jorge", createDate(15, Calendar.JUNE));
        agenda.put("Fernanda", createDate(26, Calendar.JANUARY));
        agenda.put("Marijo", createDate(14, Calendar.FEBRUARY));
        agenda.put("Angel", createDate(18, Calendar.MARCH));
        agenda.put("Leo", createDate(1, Calendar.JULY));

        // Imprimir la agenda
        System.out.println("Elementos en la agenda: " + agenda.size());
        for (String k : agenda.keySet()) {
            System.out.println("Nombre: " + k + ", Cumpleanos: " + formatDate(agenda.get(k)));
        }
   
}              
    // Método para crear una fecha de cumpleaños
    public static Calendar createDate(int day, int month) {
        Calendar date = Calendar.getInstance();
        date.set(Calendar.DAY_OF_MONTH, day);
        date.set(Calendar.MONTH, month);
        return date;
    }

    // Método para formatear la fecha
    public static String formatDate(Calendar date) {
        int day = date.get(Calendar.DAY_OF_MONTH);
        int month = date.get(Calendar.MONTH) + 1; // Se suma 1 porque Calendar.MONTH es base 0
        int year = date.get(Calendar.YEAR);
        return day + "-" + month + "-" + year;
    }        
        
    

    @Override
    public String toString() {
        return "POOP3 []";
    }
    
    
}
