package ru.netology;

public class Radio {

    private int minStation = 0;
    private int maxStation = 9;

    private int currentStation = minStation;              // Текущая радио станция


    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;                 // Текущая громкость

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
    }

    public void nextStation() {                  // Переключение текущую радио станцию на следующую
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {                  // Переключение текущую радио станцию на предыдущую
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {               // Переключение текущей громкости на следующую
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }

    }

    public void decreaseVolume() {               // Переключение текущей громкости на предыдущую
        if (currentVolume != minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }


    public int getCurrentStation() {                          // Геттер текущей радио станции
        return currentStation;
    }

    public int getCurrentVolume() {                           // Геттер текущей громкости
        return currentVolume;
    }


    public void setCurrentVolume(int newCurrentVolume) {      // Сеттер границы громкости

        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {    // Сеттер станции
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setToMaxStation() {            // Ограничиваем максимальное значение станции

        currentStation = maxStation;
    }

    public void setToMinStation() {            // Ограничиваем минимальное значение станции

        currentStation = minStation;
    }

}