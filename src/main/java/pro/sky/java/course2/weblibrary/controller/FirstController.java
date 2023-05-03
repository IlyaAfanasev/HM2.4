package pro.sky.java.course2.weblibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class FirstController {
    private final Calculator calculator;

    public FirstController(Calculator calculator) {
        this.calculator=calculator;
    }
    @GetMapping
    public String showHello() {
        return calculator.showHello();
    }
    @GetMapping(path = "/plus")
    public double plus(@RequestParam ("num1") double firstNum,@RequestParam("num2") double secondNum ) {

        return calculator.plus(firstNum,secondNum);
    }
    @GetMapping(path = "/minus")
    public double minus(@RequestParam ("num1") double firstNum,@RequestParam("num2") double secondNum ) {

        return calculator.minus(firstNum,secondNum);

    }
    @GetMapping(path = "/multiply")
    public double multiply(@RequestParam ("num1") double firstNum,@RequestParam("num2") double secondNum ) {

        return calculator.multiply(firstNum,secondNum);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam ("num1") double firstNum,@RequestParam("num2") double secondNum ) {

            return calculator.divide(firstNum,secondNum);

    }


}
