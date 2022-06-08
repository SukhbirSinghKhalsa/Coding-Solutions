// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//input
//5
//11 4 9 10 5
// output
//1st 5th 3rd 2nd 4th
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[] arr =  new int[limit]; 
        for(int i =0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); //take array elements as input from user
        }
        //int[] orgArr = arr; // refering array a
        int[] orgArr = arr.clone(); //orginal arr without sort
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(orgArr)); 
        String[] temp = {"5th","4th","3rd","2nd","1st"};
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i],temp[i]);
        }
        // for(Map.Entry m : map.entrySet()){    
        //     System.out.println(m.getKey()+" "+m.getValue());    
        // }  
        for(int i = 0; i < arr.length; i++) { 
            System.out.print(map.get(orgArr[i])+" ");
        }
        
        
        
        
    }
}