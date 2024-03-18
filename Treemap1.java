import java.util.*;
        public class Treemap1{
            public static void main(String args[]){
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(1,"CSE");
        map.put(2,"SE");
        map.put(3,"PCE");
        map.put(3,"ECE");
        for(Map.Entry m:map.entrySet()){
            
        //for(Map.Entry m:map.entrySet()){
                System.out.println(m.getKey()+"     "+m.getValue());
            }}}

