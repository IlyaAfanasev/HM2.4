package pro.sky.java.course2.weblibrary;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.weblibrary.controller.Calculator;
@Service
public class CalculatorImpl implements Calculator {


    public String showHello() {
        return "Добро пожаловать в калькулятор";
    }
    public double plus( double firstNum,double secondNum ) {

        return firstNum+secondNum;
    }
    public double minus( double firstNum,double secondNum ) {

        return firstNum-secondNum;

    }
    public double multiply( double firstNum,double secondNum ) {

        return firstNum*secondNum;
    }
    public String divide( double firstNum,double secondNum ) {


        if (secondNum == 0) {
            return "Делить на 0 нельзя";

        } else {
            return String.valueOf(firstNum/secondNum);
        }

    }

}
