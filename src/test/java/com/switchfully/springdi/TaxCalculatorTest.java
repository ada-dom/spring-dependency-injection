package com.switchfully.springdi;

import com.switchfully.springdi.taxcalculations.TaxCalculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class TaxCalculatorTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void initialize() {
        applicationContext = new AnnotationConfigApplicationContext(TaxConfig.class);
    }

    @Test
    void givenCalculatorWithAmericanTaxCalculationInjected_whenCalculateTaxFor230000_thenReturn5090() {
        //given
        TaxCalculator taxCalculator = applicationContext.getBean(TaxCalculator.class);
        //when
        double taxCalculated = taxCalculator.calculateTaxBasedYearlyIncomeInEuro(23000);
        //then
        Assertions.assertEquals(5090, taxCalculated);
    }

    @Test
    void givenFrenchTaxCalculation_whenCalculateTaxFor230000_thenReturn11040() {
        //given
        TaxCalculation frenchTaxCalculation = applicationContext.getBean("FrenchTaxCalculation", TaxCalculation.class);
        //when
        double frenchTaxCalculated = frenchTaxCalculation.calculateTaxBasedYearlyIncomeInEuro(23000);
        //then
        Assertions.assertEquals(11040, frenchTaxCalculated);
    }

    @Test
    void givenBelgianTaxCalculation_whenCalculateTaxFor230000_thenReturn10350() {
        //given
        TaxCalculation frenchTaxCalculation = applicationContext.getBean("BelgianTaxCalculation", TaxCalculation.class);
        //when
        double frenchTaxCalculated = frenchTaxCalculation.calculateTaxBasedYearlyIncomeInEuro(23000);
        //then
        Assertions.assertEquals(10350, frenchTaxCalculated);
    }
}