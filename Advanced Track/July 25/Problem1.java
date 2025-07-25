import java.util.HashMap;
import java.util.Arrays;

public class Problem1 {

    //Q) Two Sum
    //Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println("2 Elements required to get the Target are: "+Arrays.toString(twosum(arr,target)));
    }
    static int[] twosum(int[] arr,int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int N = arr.length;
        for(int i = 0; i<N;i++){
            int comp = target - arr[i];
            if(hm.containsKey(comp)){
                return new int[] {hm.get(comp),i};
            }
            hm.put(arr[i], i);
        }
        return new int[] {};
    }
}
