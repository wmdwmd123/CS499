//Java program to find the most frequent element in an array
import java.util.HashMap; 		
import java.util.Map; 			//Imports that allow use of hash map
import java.util.Map.Entry; 
  
class mostFrequentElement { 
      
    static int mostFrequent(int array[], int length) 
    { 
          
        //Creates hash map
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>(); 
        
        //Inserts array elements into hash map
        for(int i = 0; i < length; i++) 
        { 
            int key = array[i]; 
            
            if(hash.containsKey(key)) 	//Increases and updates frequency count if hash map already contains key
            { 
                int frequency = hash.get(key); 
                frequency++; 
                hash.put(key, frequency); 
            } 
            else
            { 
                hash.put(key, 1); 
            } 
        } 
          
        //Variables to keep track of max count and most frequent element 
        int maxCount = 0;
        int mostFrequent = -1; 
        
        //Traverse hash map and find key with highest value
        for(Entry<Integer, Integer> val : hash.entrySet()) 
        { 
            if (maxCount < val.getValue()) 
            { 
                mostFrequent = val.getKey(); 
                maxCount = val.getValue(); 
            } 
        } 
        
        //Return most frequent element
        return mostFrequent; 
    } 
      
    //Main method used to run "mostFrequent" sorting method 
    public static void main (String[] args) { 
          
        int array[] = {1, 5, 2, 1, 3, 2, 1}; 
        int length = array.length; 
          
        System.out.println(mostFrequent(array, length)); 
    } 
} 
  
