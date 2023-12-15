package com.example.articles.controllers;


import models.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Controller

public class HomeController {
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("header", "My Articles");
        return "index"; //Это соответствует имени html шаблона(index.html)
    }
    @GetMapping("/articles")
    public String outputArticles(Model model){
        Article[]articles = articleArray();
        model.addAttribute("header", "articleList");
        return "articles";
    }


    public Article[] articleArray() {
        Calendar cal1 = new GregorianCalendar(2023, 12, 1);
        Article article1 = new Article("slug1", "dachshund", "The Dachshund, also known as the wiener dog, badger dog, doxie, and sausage dog, is a short-legged, long-bodied, hound-type dog breed. The dog may be smooth-haired, wire-haired, or long-haired. Coloration varies.", cal1);

        Calendar cal2 = new GregorianCalendar(2023, 12, 2);
        Article article2 = new Article("slug2", "dobermann", "The Dobermann is a German breed of medium-large domestic dog of pinscher type. It was originally bred in Thuringia in about 1890 by Louis Dobermann, a tax collector.[2] It has a long muzzle and – ideally – an even and graceful gait. The ears were traditionally cropped and the tail docked, practices which are now illegal in many countries.", cal2);

        Calendar cal3 = new GregorianCalendar(2023, 12, 3);
        Article article3 = new Article("slug3", "name3", "body3", cal3);

        Calendar cal4 = new GregorianCalendar(2023, 12, 4);
        Article article4 = new Article("slug4", "name4", "body4", cal4);

        Calendar cal5 = new GregorianCalendar(2023, 12, 5);
        Article article5 = new Article("slug5", "name5", "body5", cal5);

        Article[] articles = {article1, article2, article3, article4, article5};

        return articles;
    }


}
