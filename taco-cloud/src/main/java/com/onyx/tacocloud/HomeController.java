package com.onyx.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller                 // Контроллер
public class HomeController {

    /**
     * Контроллер домашней страницы:
     * Введение в Spring -> Разработка приложения -> 1. Обработка веб-запроса */

    @GetMapping("")         // Обрабатывает запросы с корневым путем /
    public String home() {
        return "home";      // Возвращает имя представления
    }
}
