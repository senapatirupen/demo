package com.ecom.app.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Map;

@Slf4j
public class ProfitMarginCalculationTest {

    ProfitMarginCalculation profitMarginCalculation = new ProfitMarginCalculation();

    @Test
    public void testProfit() {
        Map<String, Float> finalPriceList = profitMarginCalculation.finalPriceList(12000f, 10000f, 3f);
        log.info("MRP value >> {}", String.valueOf(finalPriceList.get("MRP")));
        log.info("purchasePrice value >> {}", String.valueOf(finalPriceList.get("purchasePrice")));
        log.info("sellPrice value >> {}", String.valueOf(finalPriceList.get("sellPrice")));
        log.info("discountPercentageOnSellPrice value >> {}", String.valueOf(finalPriceList.get("discountPercentageOnSellPrice")));
    }

    @Test
    public void testProfitOne() {
        Map<String, Float> finalPriceList = profitMarginCalculation.finalPriceList(12000f, 10000f, 30f);
        log.info("MRP value >> {}", String.valueOf(finalPriceList.get("MRP")));
        log.info("purchasePrice value >> {}", String.valueOf(finalPriceList.get("purchasePrice")));
        log.info("sellPrice value >> {}", String.valueOf(finalPriceList.get("sellPrice")));
        log.info("discountPercentageOnSellPrice value >> {}", String.valueOf(finalPriceList.get("discountPercentageOnSellPrice")));
        log.info("errors on processing sell price >> {}", String.valueOf(finalPriceList.get("errors")));
    }
}
