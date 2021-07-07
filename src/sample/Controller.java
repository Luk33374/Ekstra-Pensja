package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.service.Pensja;
import sample.service.RandomNumbers;
import sample.service.Result;


import java.util.HashSet;
import java.util.Set;

public class Controller {
    @FXML
    TextField btn1;
    @FXML
    TextField btn2;
    @FXML
    TextField randomText;
    @FXML
    TextField btn3;
    @FXML
    TextField btn4;
    @FXML
    TextField btn5;
    @FXML
    TextField btnPlus;
    @FXML
    Label numbers;
    @FXML
    Label price;
    @FXML
    Label wynik;

    public void work(){
        Pensja pensja=new Pensja();

        Set user=getUserNumbers();
        if(user.size()==5&&!btnPlus.getText().isEmpty()&&Integer.parseInt(btnPlus.getText())>0&&Integer.parseInt(btnPlus.getText())<5){
            RandomNumbers userNumbers=new RandomNumbers(user,Integer.parseInt(btnPlus.getText()));
            RandomNumbers winning=new RandomNumbers();
            winning.fill();
            Result result = pensja.result(userNumbers, winning);
            numbers.setText("Trafione:"+result.result+" plus:"+result.plus);
            price.setText("Wygrana "+result.price());
            wynik.setText("Trafione: "+winning.getResult().toString()+" +"+winning.getPlus());
        }
    }

    public void getRandom(){
        Pensja pensja=new Pensja();

        int manyTimes = pensja.playManyTimes(Integer.parseInt(randomText.getText()));
        System.out.println(pensja.sw);
        price.setText("Wygrana "+manyTimes);
    }

    private Set<Integer> getUserNumbers(){
        Set<Integer> userSet=new HashSet<>();
        if(!btn1.getText().isEmpty()&&(Integer.parseInt(btn1.getText())>0&&Integer.parseInt(btn1.getText())<36))userSet.add(Integer.parseInt(btn1.getText()));
        if(!btn2.getText().isEmpty()&&(Integer.parseInt(btn2.getText())>0&&Integer.parseInt(btn2.getText())<36))userSet.add(Integer.parseInt(btn2.getText()));
        if(!btn3.getText().isEmpty()&&(Integer.parseInt(btn3.getText())>0&&Integer.parseInt(btn3.getText())<36))userSet.add(Integer.parseInt(btn3.getText()));
        if(!btn4.getText().isEmpty()&&(Integer.parseInt(btn4.getText())>0&&Integer.parseInt(btn4.getText())<36))userSet.add(Integer.parseInt(btn4.getText()));
        if(!btn5.getText().isEmpty()&&(Integer.parseInt(btn5.getText())>0&&Integer.parseInt(btn5.getText())<36))userSet.add(Integer.parseInt(btn5.getText()));
        if(userSet.size()<5||btnPlus.getText().isEmpty()||Integer.parseInt(btnPlus.getText())<1||Integer.parseInt(btnPlus.getText())>4)numbers.setText("Brak odpowiedniej liczby");
        return userSet;
    }
}
