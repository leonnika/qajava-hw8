package ru.netology.domain;

public class Radio {
    private int fistStation = 0;
    private int lastStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStation;
    private int currentVolume;

    public Radio(int lastStation) {
        this.lastStation = lastStation;
    }

    public Radio() {
    }

    public int getFistStation() {
        return fistStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void prevStation() {
        if (currentStation == fistStation) {
            currentStation = (lastStation-1);
            return;
        }
        currentStation--;
    }

    public void nextStation() {
        if (currentStation == (lastStation-1)) {
            currentStation = fistStation;
            return;
        }
        currentStation++;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > (lastStation-1)) {
            return;
        }
        if (currentStation < fistStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void volumeUp() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        currentVolume++;
    }

    public void volumeDown() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
            return;
        }
        currentVolume--;
    }
}
