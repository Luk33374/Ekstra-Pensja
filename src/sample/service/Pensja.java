package sample.service;
import java.util.ArrayList;
import java.util.List;

public class Pensja{

    public SW sw=new SW();
    public   Result result(RandomNumbers typed,RandomNumbers winning){
        List<Integer> listTyped=new ArrayList<>(typed.getResult());
        List<Integer> listWinning=new ArrayList<>(winning.getResult());
        Result result=new Result();
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(listTyped.get(i)==listWinning.get(j))result.result++;
            }
        }
        if(typed.getPlus()==winning.getPlus())result.plus=true;
        return result;
    }

    public int playManyTimes(int howMany){
        int price=howMany*-5;
        RandomNumbers typed=new RandomNumbers();
        RandomNumbers winning=new RandomNumbers();
        Result result;
        for(int i=0;i<howMany;i++){
            typed.fill();
            winning.fill();
            //System.out.println(typed.getResult()+" plus "+typed.getPlus());
            //System.out.println(winning.getResult()+" plus "+winning.getPlus());
            result=result(typed,winning);
            sw.fill(result.price());
            //System.out.println(result.price());
            price+=result.price();
            typed.clear();
            winning.clear();
            result.clear();
        }
        return price;
    }
}