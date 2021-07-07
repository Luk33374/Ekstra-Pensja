package sample.service;

import java.util.*;

public class RandomNumbers {
    private Set<Integer> result;
    private int plus;

    public RandomNumbers(Set<Integer> result, int plus) {
        this.result = result;
        this.plus = plus;
    }

    public RandomNumbers() {
    }

    public void fill(){
        result=new HashSet();
        while(result.size()<5){
            int number=(int)(Math.random()*34)+1;
            result.add(number);
        }
        plus=(int)(Math.random()*3)+1;
    }
    public void clear(){
        result.clear();
    }

    public Set<Integer> getResult() {
        return result;
    }

    public int getPlus() {
        return plus;
    }
}
