package com.switchfully.springdi;

import com.switchfully.springdi.taxcalculations.BelgianTaxCalculation;
import com.switchfully.springdi.taxcalculations.FrenchTaxCalculation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class TaxConfig {

    @Bean("FrenchTaxCalculation")
    FrenchTaxCalculation getFrenchTaxCalculation() {
        return new FrenchTaxCalculation();
    }

    @Bean("BelgianTaxCalculation")
    BelgianTaxCalculation getBelgianTaxCalculation() {
        return new BelgianTaxCalculation();
    }
}
