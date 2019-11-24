package com.cit360;
// Idea for the calculator from https://www.javaguides.net/2018/08/application-controller-design-pattern-in-java.html

public class Subtract implements Operation {
    public Integer numbers(Integer firstNumber, Integer secondNumber) {
        Integer divisor = firstNumber - secondNumber;
        return(divisor);
    }
}