package ru.netology.domain;

public class Radio {

    private final int FistStation = 0;
    private final int LastStation = 9;
    private final int minVolume = 0;
    private final int maxVolume = 10;
    private int currentStation;
    private int currentVolume;

    public int getFistStation() {
        return FistStation;
    }

    public int getLastStation() {
        return LastStation;
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


    public void prevStation(int currentStation) {
        if (currentStation == FistStation) {
            this.currentStation=(LastStation) ;
            return;
        }
        this.currentStation = (currentStation - 1);
        return;
    }

    public void nextStation(int currentStation) {
        if (currentStation == LastStation) {
            this.currentVolume=(FistStation);
            return;
        }
        this.currentStation = (currentStation + 1);
        return;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > LastStation) {
            return;
        }
        if (currentStation < FistStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void volumeUp(int currentVolume) {
        if (currentVolume >= maxVolume) {
           this.currentVolume=maxVolume;
            return;
        }
        this.currentVolume=(currentVolume + 1);
        return;
    }

    public void volumeDown(int currentVolume) {
        if (currentVolume <= minVolume) {
            this.currentVolume=minVolume;
            return;
        }
        this.currentVolume=(currentVolume - 1);
        return;
    }
}
