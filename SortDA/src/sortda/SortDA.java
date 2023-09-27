/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortda;

/**
 *
 * @author jelly_joneske
 */
public class SortDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = new int[]{20,40,10,32,30,50,60};
        int temp = 0;
        System.out.println("Elements of original array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Elements of array sorted in descending order:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    
}
