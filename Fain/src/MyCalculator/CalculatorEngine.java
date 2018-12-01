package MyCalculator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
public class CalculatorEngine implements ActionListener {
    Calculator parent; // ссылка на Calculator
    char selectedAction = ' '; // +, -, /, или *
    double currentResult =0;
    // Конструктор сохраняет ссылку на окно калькулятора
    // в переменной экземпляра класса parent
    CalculatorEngine(Calculator parent){
        this.parent = parent;
    }
    public void actionPerformed(ActionEvent e){
        JFormattedTextField myDisplayField=null;
        JButton clickedButton=null;
        // Получить источник текущего действия
        Object eventSource = e.getSource();
        if (eventSource instanceof JButton){
            clickedButton = (JButton) eventSource;
        }else if (eventSource instanceof JFormattedTextField){
            myDisplayField = (JFormattedTextField) eventSource;
        }
        // Получить надпись на кнопке
        String clickedButtonLabel = clickedButton.getText();
        // Получить текущий текст из поля вывода (“дисплея”) калькулятора
        String dispFieldText = parent.displayField.getText();
        double displayValue=0;
        // Получить число из дисплея калькулятора, если он не пустой.
        // Восклицательный знак – это оператор отрицания
        if (!"".equals(dispFieldText)){
            try {
                displayValue= Double.parseDouble(dispFieldText);
            } catch (NumberFormatException e1) {
                javax.swing.JOptionPane.showConfirmDialog(null,
                        "Пожалуйста, введите число", "Неправильный ввод",
                        javax.swing.JOptionPane.PLAIN_MESSAGE);
                return;
            }
        }
        Object src = e.getSource();
// Для каждой кнопки арифметического действия
// запомнить его: +, -, /, или *, сохранить текущее число
// в переменной currentResult, и очистить дисплей
// для ввода нового числа
        if (src == parent.buttonPlus){
            selectedAction = '+';
            currentResult=displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMinus){
            selectedAction = '-';
            currentResult=displayValue;
            parent.displayField.setText("");
        }else if (src == parent.buttonDivide){
            selectedAction = '/';
            currentResult=displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMultiply){
            selectedAction = '*';
            currentResult=displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonEqual){
// Совершить арифметическое действие, в зависимости
// от selectedAction, обновить переменную currentResult
// и показать результат на дисплее
            if (selectedAction=='+'){
                currentResult+=displayValue;
// Сконвертировать результат в строку, добавляя его
// к пустой строке и показать его
                parent.displayField.setText(""+currentResult);
            }else if (selectedAction=='-'){
                currentResult -=displayValue;
                parent.displayField.setText(""+currentResult);
            }else if (selectedAction=='/'){
                if(displayValue != 0.0 ){
                currentResult /=displayValue;
                parent.displayField.setText(""+currentResult);}
                else
                    parent.displayField.setText("На ноль делить нельзя");
            }else if (selectedAction=='*'){
                currentResult*=displayValue;
                parent.displayField.setText(""+currentResult);
            }
        } else{
// Для всех цифровых кнопок присоединить надпись на
// кнопке к надписи в дисплее
            if (!(clickedButtonLabel.equals(".")))
            parent.displayField.setText(dispFieldText +
                    clickedButtonLabel);
            else
                if (dispFieldText.indexOf('.') == -1)
                    parent.displayField.setText(dispFieldText +
                            clickedButtonLabel);
    }
}
}