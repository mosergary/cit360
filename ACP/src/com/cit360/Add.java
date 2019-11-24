package com.cit360;
//https://www.javaguides.net/2018/08/application-controller-design-pattern-in-java.html

public class Add implements Operation {

    public Integer numbers(Integer firstNumber, Integer secondNumber) {
        Integer sum = firstNumber + secondNumber;
        return(sum);
    }
}