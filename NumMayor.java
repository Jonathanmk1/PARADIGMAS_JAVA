package d09012022;

import java.util.ArrayList;
import java.util.Scanner;

public class NumMayor {

    public void hechopormi() {
        Scanner s = new Scanner(System.in);
        ArrayList nums = new ArrayList();//es un vector dinamico
        String resp;
        int max = 0, nu, p=0;

        do {

            System.out.println("Ingrese un numero: ");
            nums.add(s.nextLine());
            System.out.println("Otro numero?: ");
            resp = s.nextLine();

        } while (resp.equalsIgnoreCase("si"));
        for (int i = 0; i < nums.size(); i++) {
            nu = Integer.parseInt(nums.get(i).toString());
            max = 0;
            p = 0;
            if (nu > max) {
                max = nu;
                p = i;
            }
        }
        System.out.println("el maximo es: " + max + " en la posicion: " +p);
    }
    public void hechoprofe(){
         Scanner s = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList();//es un vector dinamico
      //ArrayList <Integer> num = new ArrayList();  
        String resp;
        int max, p;
        do {

            System.out.println("Ingrese un numero: ");
            nums.add(s.nextInt());
            System.out.println("Otro numero?: ");
            resp = s.nextLine();
            resp = s.nextLine();

        } while (resp.equalsIgnoreCase("si"));
        for(Object num: nums){
            System.out.print(num + " ");
        }
        //max=Integer.MIN_VALUE;
        max = nums.get(0);
        p = 0;
        for (int i=0; i < nums.size(); i++){
            if(nums.get(i)>max){
                max = nums.get(i);
                p = i + 1;
            }
        }
        System.out.println("\nMayor: "+max +"\nY en la posicion: " + p);
    }
    public static void main(String[] args) {
        NumMayor nm = new NumMayor();
        nm.hechoprofe();
    }
}