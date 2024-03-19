/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * Biblioteca que se añadio por ArrayList
// */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author marif
 * @version 19/03/2024
 */
public class POOP3 {

    /**
     * Creacion de la clase principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Uso de las Utilerias en java
         */
        System.out.println("################ Arreglos ##############");
        //ATRIBUTOS
        
        /**
         * Creacion de diferentes arreglos con diferente sintaxis y asignaciones
         */
        int nums[];
        int[] nums2;
        int [] nums3;
        int []nums4;
        int[] nums5 = {1,2,3,4,5,6,7,8,9,10};
        
        /**
         * Uso de for en java
         */
        System.out.println("################ for ##############");
        
        for (int i = 0; i < nums5.length; i++) {
            System.out.println("Elemento ["+i+"]="+nums5[i]);
        }
        for(int temp : nums5){
            System.out.println("Elemento: " +temp);
        }
        
        /**
         * Creacion de objetos tipo cadena
         */ 
        System.out.println("################ String ##############");
        
        /**
         * @deprecated Sintaxis Correcta, con constructor String
         */ 
        String s = new String("Hola mundo");
        
        /**
         * Sintaxis recomendada (usual)
         */ 
        String s1 = "Hola mundo";
        System.out.println(s);
        System.out.println(s1);
        
        /**
         * Concatenando objetos tipos cadena
         */ 
        System.out.println("################ String operador mas ##############");
        /**
         * Asigancion de datos a los atributos de tipo cadena de la clase
         */ 
        String nombre = "Fer";
        String apellido = "Ordoñez";
        String nombreCompleto = nombre +" "+ apellido;
        System.out.println(nombreCompleto);
        
        /**
         * Uso del operador punto con diferentes caracteristicas como length
         */ 
        System.out.println("################ Operado punto ##############");
        
        /**
         * Numero de elementos de la variable String nombre
         */ 
        System.out.println("Arreglo nums5 tiene " + nums5.length + " elementos");
        
        /**
         * Este lenght funciona como una subrutina
         */ 
        System.out.println(nombre.length());
        
        /**
         * Numero de elementos de la variable String nombreCompleto
         */
        System.out.println(nombreCompleto.length());
        
        
        /**
         * Uso de envolturas - Wrapper y Atoboxing
         */ 
        System.out.println("################  Wrapper y Autoboxing ##############");
        int a = 3;
        
        /**
         * @deprecated Uso de la sintaxis correcta, sin embargo esta deprecada
         */
        Integer b = new Integer(22);
        
        /**
         * Recomendado
         */ 
        Integer c = 33;
        
        /**
         * Valor que tendria d
         */ 
        int d = c;        
        
        System.out.println(d);
        
        Integer e = a;
        
        /**
         * Casteo
         */ 
        String cadena = e.toString();
        System.out.println("Valor de a = " +cadena);
        
        /**
         * Uso de colecciones y arreglos en listas
         */
        String f = a+"";
        System.out.println("Elementos de f = " +f.length());
        
        System.out.println("################   Colecciones y ArrayList  ##############");
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(11);
        miArrayList.add(33);
        miArrayList.add(44);
        
        /**
         * Se toma en cuenta el tamaño del array como size (tamaño)
         */ 
        System.out.println("Tamaño de ArrayList: "+miArrayList.size());
        
        /**
         * Añadir un elemento en una posicion
         */ 
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
        
        /**
         * Uso de Hashtables
         */
        System.out.println("################   Hashtable  ##############");
        //Se debio añadir la biblioteca para las Hashtable
        
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
        
        /**
         * Uso de Enumeracion
         */
        System.out.println("################   Enumeracion  ##############");
        String llave;
        Integer valor;
        //Se importa bibliotaca
        Enumeration<String> llavesEnumeradas = miTabla.keys();
        /**
         * Mientras las llaves enumeradas existan
         */ 
        while(llavesEnumeradas.hasMoreElements()){
            /**
             * @return Retorna el siguiente elementohe de la enumeracion, si es que hay mas
             */
            llave = llavesEnumeradas.nextElement();
            valor = miTabla.get(llave);
            System.out.println("llave: "+llave+" - valor: "+valor);
        }
        
        /**
         * Uso de la utileria Math 
         */
        System.out.println("################   Math- Utileria  ##############");
        /**
         * USo de  constantes en mayusculas como PI
         */ 
        System.out.println(Math.PI);
        
        /**
         * Valor absoluto
         */ 
        System.out.println(Math.abs(-5));
        
        /**
         * Elevar 3 al cuadrado
         */ 
        System.out.println(Math.pow(3, 2));
        
        /**
         * Raiz de 9
         */ 
        System.out.println(Math.sqrt(9));
        
        /**
         * Valor maximo de una serie
         */
        System.out.println(Math.max(44, 121));
        
        /**
         * Uso de la utileria Date
         */
       System.out.println("################   Date - Utileria  ##############");
       /**
        * Importando utileria Date y creacion del objeto
        */ 
       Date hoy = new Date();
       /**
        * Fecha de hoy, de parte del sistema
        */ 
        System.out.println(hoy);
        
        /**
         * Uso de la utileria Calendar
         */
        System.out.println("################   Calendar - Utileria  ##############");
        /**
         * Importando utileria y creacion del objeto con metodo getInstance
         */ 
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);      
        
        /**
         * Diccionariio de 5 palabras usando una hashtable
         */
        System.out.println("################EJERCICIOS PARA CASA##################");
        
        Hashtable<String, String> diccionario = new Hashtable<String, String>();
        diccionario.put("Avion", "Medio de transporte aereo");
        System.out.println("Elementos en el diccionario: " + diccionario.size());
         
        for (String value : diccionario.values()) {
            System.out.println(value);
        }
         
        for (String k : diccionario.keySet()) {
            System.out.println(k);
        }
        
        
        /**
         * Agenda con 5 elementos, guardando nombre de una, su cumpleaños como
         * elemento de tipo calendar y guardar el cumpleaños en un calendario
         */
        System.out.println("################   Agenda  ##############");

        Hashtable<String, Calendar> agenda = new Hashtable<>();
        agenda.put("Jorge", createDate(15, Calendar.JUNE));
        agenda.put("Fernanda", createDate(26, Calendar.JANUARY));
        agenda.put("Marijo", createDate(14, Calendar.FEBRUARY));
        agenda.put("Angel", createDate(18, Calendar.MARCH));
        agenda.put("Leo", createDate(1, Calendar.JULY));

        /**
         * Imprimir la agenda
         */ 
        System.out.println("Elementos en la agenda: " + agenda.size());
        for (String k : agenda.keySet()) {
            System.out.println("Nombre: " + k + ", Cumpleanos: " + formatDate(agenda.get(k)));
        }
   
}
    /**
     * Método para crear una fecha de cumpleaños
     * @param day parametro dia
     * @param month parametro mes
     * @return regresa una fecha 
     */ 
    public static Calendar createDate(int day, int month) {
        Calendar date = Calendar.getInstance();
        date.set(Calendar.DAY_OF_MONTH, day);
        date.set(Calendar.MONTH, month);
        return date;
    }

    /**
     * Método para formatear la fecha
     * @param date
     * @return regresa la fecha de cumpleaños de una persona que se obtiene de un calendar
     */ 
    public static String formatDate(Calendar date) {
        int day = date.get(Calendar.DAY_OF_MONTH);
        int month = date.get(Calendar.MONTH) + 1; 
        int year = date.get(Calendar.YEAR);
        return day + "-" + month + "-" + year;
    }        
    
    /**
     * Metodo de sobre escritura
     * @return Regresa el nombre de una persona y su cumpleaños
     */
    @Override
    public String toString() {
        return "POOP3 []";
    }
    
    
}