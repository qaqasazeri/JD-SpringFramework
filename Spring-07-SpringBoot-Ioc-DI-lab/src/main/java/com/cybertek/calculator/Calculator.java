package com.cybertek.calculator;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Calculator {

    @Qualifier("carpetTX")
    @Autowired
    private Carpet carpet;

    @Qualifier("kitchen")
    @Autowired
    private Floor floor;

    public String getTotalCarpetCost( City city) throws Exception{
        BigDecimal cost= carpet.getSqtFtPrice(city).multiply(floor.getAre());

        if(cost.compareTo(BigDecimal.ZERO)==0){
            throw new Exception("No city");
        }
        return "Total cost for carpet:"+cost;

    }
}
