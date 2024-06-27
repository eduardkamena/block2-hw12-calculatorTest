package pro.sky.calculatorTest.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.calculatorTest.exception.DivideOnNullException;
import pro.sky.calculatorTest.service.CalculatorService;

@RestController // Контроллер
@RequestMapping(path = "/calculator") // Аннотация общей части на уровне класса
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    // Методы для Web вывода результата по одноименным названиям из Сервисной части

    @GetMapping
    public String calculatorHello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") float numberOne,
                       @RequestParam("num2") float numberTwo) {
        return String.format("%.0f", numberOne) + " + " + String.format("%.0f", numberTwo) + " = "
                + calculatorService.plus(numberOne, numberTwo);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") float numberOne,
                        @RequestParam("num2") float numberTwo) {
        return String.format("%.0f", numberOne) + " - " + String.format("%.0f", numberTwo) + " = "
                + calculatorService.minus(numberOne, numberTwo);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") float numberOne,
                           @RequestParam("num2") float numberTwo) {
        return String.format("%.0f", numberOne) + " * " + String.format("%.0f", numberTwo) + " = "
                + calculatorService.multiply(numberOne, numberTwo);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") float numberOne,
                         @RequestParam("num2") float numberTwo) {
        return String.format("%.0f", numberOne) + " / " + String.format("%.0f", numberTwo) + " = "
                + calculatorService.divide(numberOne, numberTwo);
    }

    @ExceptionHandler
    public String handlerEx(DivideOnNullException e) {
        return e.getMessage();
    }

}
