import java.util.HashMap;

public class RandomSet {
    HashMap<Integer,Integer> myHashMap;
    HashMap<Integer, Integer> indexMap;

    public RandomSet(){
        myHashMap=new HashMap<>();
        indexMap=new HashMap<>();
    }
    public boolean insert(int val) {
       if(myHashMap.containsKey(val)){
           return false;
       }else{
           myHashMap.put(val, myHashMap.size());
           indexMap.put(indexMap.size(),val);
           return true;
       }
        
    }
    public boolean remove(int val) {
        if(myHashMap.containsKey(val)){
            int i=myHashMap.get(val);
            indexMap.remove(i);
            myHashMap.remove(val);

            Integer s = indexMap.get(indexMap.size());
            if(s!=null){
                indexMap.put(i,s);
                myHashMap.put(s, i);
            }
 
            return true;
        }
        return false;
        
    }

    public int getRandom() {
        if(myHashMap.size()==0){
            return -1;
        }
 
        if(myHashMap.size()==1){
            return idxMap.get(0);
        }
 
        Random r = new Random();
        int idx = r.nextInt(myHashMap.size());
 
        return idxMap.get(idx);
        
    }
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(val);
        boolean param_2 = obj.remove(val);
        int param_3 = obj.getRandom();
    }
    
/**
 * 
 */
}