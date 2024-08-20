package DivideConquer_GreedyApproach;
import java.sql.SQLOutput;
import java.util.*;
import javax.swing.event.SwingPropertyChangeSupport;

public class FractionalKnapsack {
    static class Item{    /*maxVal method is static so we will have to make Items class is static
                          so that maxval method can store Item class objects*/
        int val;
        int weight;
        double perunitVal;
        public Item(int val,int weight,double perunitVal) {
            this.val = val;
            this.weight = weight;
            this.perunitVal = perunitVal;
        }
//        public String toString(){
//            return val+"_"+weight+"_"+perunitVal;
//        }
    }
    public static double maxValue(int[] val,int[] weight,int capacity){
        double totalVal = 0;
        List<Item> items = new ArrayList<>();
        for(int i=0;i<val.length;i++){
            double perunitVal = (1.0*val[i]/weight[i]);
            items.add(new Item(val[i],weight[i],perunitVal));
        }

        //sorting the items arraylist in decreasing
        Comparator<Item> com = (Item a,Item b)->
        {
            if(a.perunitVal<b.perunitVal){
                return 1;
            }
            else{
                return -1;
            }
        };
        Collections.sort(items,com);

        //finding total Value
        for(Item ele : items){
            if(capacity==0){
                return totalVal;
            }
            if(ele.weight<=capacity){
                totalVal += ele.val;
                capacity -= ele.weight;
            }
            else{
                totalVal += capacity* ele.perunitVal;
                capacity = 0;
            }
        }
        return totalVal;
    }
    public static void main(String[] args) {
        int[] val = {25,75,100,50,45,90,30};  //60,100,120
        int[] weight = {5,10,12,4,7,9,3};     //10,20,30
        int capacity = 37;                    //50
        double res = maxValue(val,weight,capacity);
        System.out.println(res);
    }
}
