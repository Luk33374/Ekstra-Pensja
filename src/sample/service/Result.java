package sample.service;

public class Result {
    public int result=0;
    public boolean plus=false;

    public void clear(){
        result=0;
        plus=false;
    }

    public int price(){
        switch (result){
            case 2:
                if(plus)return 10;
                else return 5;

            case 3:
                if(plus)return 80;
                else return 25;

            case 4:
                if(plus)return 1000;
                else return 200;

            case 5:
                if(plus)return 1200000;
                else return 25000;

            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return "Result{" +
                "result=" + result +
                ", plus=" + plus +
                '}';
    }
}
