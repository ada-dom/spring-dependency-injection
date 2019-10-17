package com.switchfully.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTaxCalculatorApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaxConfig.class);
        TaxCalculator taxCalculator = applicationContext.getBean(TaxCalculator.class);
        System.out.println(taxCalculator.calculateTaxBasedYearlyIncomeInEuro(23000)+"€");
    }

}
