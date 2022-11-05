
package d09012022;

import java.util.ArrayList;

public class ArreglosDinamicos {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        
        for(Object num: nums){
            System.out.print(num + " ");
        }
        System.out.println("");
        for(int i=0; i < nums.size(); i++){
            System.out.print(nums.get(i)+" ");
        }
    }
}
/*
for( int i=0; i < 5; i++){
            nums.add(5);
        }
        
        nums.add(5);
        nums.add(67);
        nums.add(5);
        //System.out.println(nums.get(0));
        
*/