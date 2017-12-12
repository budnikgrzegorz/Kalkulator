package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements EventHandler<ActionEvent> {
    private int firstNumber;
    private int secondNumber;
    private String operation;

    @FXML
    TextField display;

    public void handleZero(ActionEvent event) {
        display.setText("0");
    }

    public void handleClear(ActionEvent event) {
        firstNumber = 0;
        secondNumber = 0;
        display.clear();
    }

    @FXML
    @Override
    public void handle(ActionEvent event) {
        String text = ((Button) event.getSource()).getText();
        String oldtex = display.getText();
        String newText = oldtex + text;
        display.setText(newText);

    }


    @FXML
    public void handleParamOpperation(ActionEvent event) {
        this.operation = operation;
        String oldtex = display.getText();
        secondNumber = Integer.parseInt(oldtex);
        switch (operation) {
            case "+":
                secondNumber = firstNumber + secondNumber;
                break;
            case "-":
                secondNumber = firstNumber - secondNumber;
                break;
            case "*":
                secondNumber = firstNumber * secondNumber;
                break;
            case "/":
                secondNumber = firstNumber / secondNumber;
                break;
            default:
                break;
        }
        display.setText(String.valueOf(secondNumber));
    }

    @FXML
    private void handleExam(ActionEvent event) {
        String text = display.getText();
        firstNumber = Integer.parseInt(text);
        display.setText("");
        operation = ((Button) event.getSource()).getText();
    }
}
