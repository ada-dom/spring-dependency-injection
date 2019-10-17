package com.switchfully.springdi;

import com.switchfully.springdi.taxcalculations.TaxCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {

    private final TaxCalculation taxCalculation;

    @Autowired
    public TaxCalculator(@Qualifier("AmericanTaxCalculation") TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTaxBasedYearlyIncomeInEuro(double incomeInEuro) {
        return taxCalculation.calculateTaxBasedYearlyIncomeInEuro(incomeInEuro);
    }

}
