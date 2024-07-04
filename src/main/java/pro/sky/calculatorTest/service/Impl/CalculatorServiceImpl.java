package pro.sky.calculatorTest.service.Impl;

import org.springframework.stereotype.Service;
import pro.sky.calculatorTest.exception.DivideOnNullException;
import pro.sky.calculatorTest.service.CalculatorService;

@Service // Сервисная часть
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public float plus(float numberOne, float numberTwo) { // Метод сложения
        return numberOne + numberTwo;
    }

    @Override
    public float minus(float numberOne, float numberTwo) { // Метод вычитания
        return numberOne - numberTwo;
    }

    @Override
    public float multiply(float numberOne, float numberTwo) { // Метод умножения
        return numberOne * numberTwo;
    }

    @Override
    public float divide(float numberOne, float numberTwo) { // Метод деления
        if (numberTwo == 0) {
            throw new DivideOnNullException("На ноль делить нельзя");
        }
        return numberOne / numberTwo;
    }

}
