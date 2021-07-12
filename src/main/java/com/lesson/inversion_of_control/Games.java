package com.lesson.inversion_of_control;

public interface Games {
    // все классы которые будут наследовать этот интерфейс
    // должны возврашать название игры

    String getGameName();
}
