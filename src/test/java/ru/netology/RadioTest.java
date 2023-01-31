package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {                     // Проверяем заданную станцию
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);

        int expected = 19;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {          // Проверяем ограничение на задание станции выше предела
        Radio radio = new Radio(20);
        radio.setCurrentStation(23);
        radio.setToMaxStation();

        int expected = 19;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {          // Проверяем ограничение на задание станции ниже предела
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.setToMinStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextStation() {     // Проверяем переключение станции на следующую
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.nextStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {     // Проверяем переключение станции на предыдущую
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationBorder() {     // Проверяем переключение станции на следующую от 9-й
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationBorder() {     // Проверяем переключение станции на предыдущую с 0-й
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolume() {     // Проверяем переключение громкости на следующую
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevVolume() {     // Проверяем переключение громкости на предыдущую
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.decreaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {     // Проверяем ограничение переключения громкости выше максимума
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {     // Проверяем ограничение переключения громкости ниже минимума
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}