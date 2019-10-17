package com.switchfully.springdi.taxcalculations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

@Primary
@Qualifier("BelgianTaxCalculation")
public class BelgianTaxCalculation implements TaxCalculation {

    private static final double TAX_RATE = 0.45;

    @Override
    public double calculateTaxBasedYearlyIncomeInEuro(double yearlyIncome) {
        return yearlyIncome * TAX_RATE;
    }
}
