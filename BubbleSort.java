package entities;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    List<Integer> list = new ArrayList<>();

    public BubbleSort() {

    }

    public static void sort(List<Integer> list){
        boolean flag = false;
        for(int i=0; i<list.size(); i++){
            if(i==0){
                flag = false;
            }

            if(i+1 < list.size() && list.get(i) > list.get(i+1)){
                swap(list, i);
                flag = true;
            }

            if(i+1 == list.size() && flag == true){
                i=-1;
            }
        }
    }

    public static void swap(List<Integer> list, int i){
        Integer aux = list.get(i);
        list.set(i,list.get(i+1));
        list.set(i+1,aux);
    }
}
