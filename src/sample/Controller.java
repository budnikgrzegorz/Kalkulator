package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    @FXML
    AnchorPane AnchorPane;
    @FXML
    Button zero;
    @FXML
    Button one;
    @FXML
    Button two;
    @FXML
    Button three;
    @FXML
    Button four;
    @FXML
    Button five;
    @FXML
    Button six;
    @FXML
    Button seven;
    @FXML
    Button eight;
    @FXML
    Button nine;
    @FXML
    Button pluse;
    @FXML
    Button equal;
    @FXML
    Button minus;
    @FXML
    Button ratio;
    @FXML
    Button quotient;
    @FXML
    Button percent;
    @FXML
    Button fragment;

    @FXML
    TextField display;


    private ArrayList<Integer> array;
    private Character sign;
    private int score = 0;

    public void initialize() {
        sohowEqual();

        one.setOnAction(event -> {
            setParam(1);
        });
        two.setOnAction(event -> {
            setParam(2);
        });
        three.setOnAction(event -> {
            setParam(3);
        });
        four.setOnAction(event -> {
            setParam(4);
        });
        five.setOnAction(event -> {
            setParam(5);
        });
        six.setOnAction(event -> {
            setParam(6);
        });
        seven.setOnAction(event -> {
            setParam(7);
        });
        eight.setOnAction(event -> {
            setParam(8);
        });
        nine.setOnAction(event -> {
            setParam(9);
        });
        zero.setOnAction(event -> {
            setParam(0);
        });
        equal.setOnAction(event -> {
            setSign('=');
        });
        minus.setOnAction(event -> {
            setSign('-');
        });
        pluse.setOnAction(event -> {
            setSign('+');
        });
        quotient.setOnAction(event -> {
            setSign('/');
        });
        percent.setOnAction(event -> {
            setSign('%');
        });
        fragment.setOnAction(event -> {
            setSign(',');
        });

    }

    private void sohowEqual() {
       display.setText(String.valueOf(score));
    }

    private void setParam(int param) {
        if (score != 0) {
            if (array.get(0).equals(null)) {

                array.add(0, param);
            } else {
                array.add(1, param);
            }
        } else {
            array.add(0, getScore());
            array.add(1, param);
        }
    }

    private void showScore() {
        char sign = getSign();
        switch (sign) {
            case '+':
                display.setText(String.valueOf(array.get(0) + array.get(1)));
                break;
            case '-':
                display.setText(String.valueOf(array.get(0) - array.get(1)));
                break;
            case '*':
                display.setText(String.valueOf(array.get(0) * array.get(1)));
                break;
            case '/':
                display.setText(String.valueOf(array.get(0) * array.get(1)));
                break;

        }

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Character getSign() {
        return sign;
    }

    public void setSign(Character sign) {
        this.sign = sign;
    }
}
