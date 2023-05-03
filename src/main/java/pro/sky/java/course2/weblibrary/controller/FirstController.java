package pro.sky.java.course2.weblibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class FirstController {
    @GetMapping
    public String showHello() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path = "/plus")
    public double plus(@RequestParam ("num1") double firstNum,@RequestParam("num2") double secondNum ) {

        return firstNum+secondNum;
    }
    @GetMapping(path = "/minus")
    public double minus(@RequestParam ("num1") double firstNum,@RequestParam("num2") double secondNum ) {

        return firstNum-secondNum;

    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam ("num1") double firstNum,@RequestParam("num2") double secondNum ) {

        return String.valueOf(firstNum*secondNum);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam ("num1") double firstNum,@RequestParam("num2") double secondNum ) {


        if (secondNum == 0) {
            return "Делить на 0 нельзя";

        } else {
            return String.valueOf(firstNum/secondNum);
        }

    }


}
