package ru.netology.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Condition {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

      public void increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            return;
        }
        currentTemperature++;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        }
        currentTemperature--;
    }

}
