/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad6;

/**
 *
 * @author Acer
 */
class DemoMetodoGenerico {
    static <T extends Comparable<T>> boolean igualArrays (T[] x, T[] y){
        //Si las longitudes de los arrays son diferentes,
        //entonces los array son diferentes
        if (x.length != y.length)
            return false;
        for (int i = 0; i < x.length; i++)
            if(!x[i].equals(y[i]))
                return false; //arrays diferentes
        return true; //Contenido de arrays son equivalentes
    }
    public static void main(String[] args){
        Integer nums[] = {1,2,3,4,5};
        Integer nums2[] = {1,2,3,4,5};
        Integer nums3[] = {1,2,3,4,5};
        Integer nums4[] = {1,2,3,4,5,6};
        if (igualArrays(nums, nums))
            System.out.println("nums es igual a nums");
        if (igualArrays(nums, nums2))
            System.out.println("nums es igual a nums2");
        if (igualArrays(nums, nums3))
            System.out.println("nums es igual a nums3");           
        if (igualArrays(nums, nums4))
            System.out.println("nums es igual a nums4");
        
        //Crea un array de double;                            //A
        Double dvals[] = {1.1,2.2,3.3,4.4,5.5};           //B
        /*if (igualArrays(nums,dvals))
        La línea de código if (igualArrays(nums, dvals)) 
        da error porque dvals es un array de tipo double, 
        mientras que nums es un array de tipo Integer. El 
        método igualArrays está definido para comparar arrays 
        de tipo T que extiendan la clase Comparable<T>, lo que 
        significa que los elementos en el array deben ser comparables 
        entre sí. 
        */                  
          System.out.println("nums es igual a dvals");    //D
    }
    
}
