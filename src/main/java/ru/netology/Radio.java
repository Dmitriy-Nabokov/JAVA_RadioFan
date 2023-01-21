package ru.netology;

public class Radio {

    public int currentStation;                                // Текущая радио станция (default = 0)


    public int getCurrentStation() {                          // Получаем текущую радио станцию
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {    // Задаём действия на границах
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {                       // Переключаем текущую радио станцию на следующую
        if (currentStation <= 8) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

        public void prevStation() {                   // Переключаем текущую радио станцию на предыдущую
            if (currentStation >= 1) {
                currentStation = currentStation - 1;
            } else {
                currentStation = 9;
            }
        }

    public void setToMaxStation() {               // Ограничиваем максимальное значение станции
        currentStation = 9;
    }

    public void setToMinStation() {               // Ограничиваем минимальное значение станции
        currentStation = 0;
    }



        public int currentVolume;                   // Текущая громкость

        public int getCurrentVolume() {             // Получаем текущую громкость
            return currentVolume;
        }

        public void setCurrentVolume(int newCurrentVolume){    // Задаём границы громкости

            currentVolume = newCurrentVolume;
        }

        public void increaseVolume() {               // Переключаем текущую громкость на следующую
            if (currentVolume <= 9) {
                currentVolume = currentVolume + 1;
            } else {
                currentVolume = 10;
            }

        }
        public void decreaseVolume() {               // Переключаем текущую громкость на предыдущую
            if (currentVolume >= 1) {
                currentVolume = currentVolume - 1;
            } else {
                currentVolume = 0;
            }
        }
    }