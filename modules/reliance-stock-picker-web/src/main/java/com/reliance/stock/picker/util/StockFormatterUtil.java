package com.reliance.stock.picker.util;

public class StockFormatterUtil {
    public static String detectDirection(String valueStr) {
        try {
            double value = Double.parseDouble(valueStr);
            if (value > 0) {
                return "up";     // Or "positive"
            } else if (value < 0) {
                return "down";   // Or "negative"
            } else {
                return "neutral";
            }
        } catch (NumberFormatException e) {
            return "neutral";
        }
    }
}
