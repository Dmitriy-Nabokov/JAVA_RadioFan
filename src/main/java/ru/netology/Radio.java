package ru.netology;

public class Radio {

    private int currentStation;                       // Текущая радио станция (default = 0)
    private int currentVolume;                        // Текущая громкость (default = 0)

    public void nextStation() {                       // Переключение текущую радио станцию на следующую
        if (currentStation <= 8) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {                       // Переключение текущую радио станцию на предыдущую
        if (currentStation >= 1) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public void increaseVolume() {               // Переключение текущей громкости на следующую
        if (currentVolume <= 9) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }

    }

    public void decreaseVolume() {               // Переключение текущей громкости на предыдущую
        if (currentVolume >= 1) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
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

    public void setCurrentStation(int newCurrentStation) {    // Сеттер полей громкости
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setToMaxStation() {            // Ограничиваем максимальное значение станции

        currentStation = 9;
    }

    public void setToMinStation() {            // Ограничиваем минимальное значение станции

        currentStation = 0;
    }

}