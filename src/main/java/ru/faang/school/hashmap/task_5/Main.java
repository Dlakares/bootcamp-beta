package ru.faang.school.hashmap.task_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Map<String, List<WebPage>> webPagesMap = new HashMap<>();
    private static Map<String, List<String>> webPagesURLMap = new HashMap<>();
    public static void main(String[] args) {
        WebPage webPageVK = new WebPage("snakes.ru", "Snakes", "Змея всегда кусаться очень сильно и больно");
        WebPage webPageYT = new WebPage("bear.org", "Bears", "Медведь всегда время есть мед лето а зима спать есть ягода лазить дерево");
        WebPage webPageGIT = new WebPage("hare.off", "Hares", "Заяц любить есть морковь и убегать от волк и медведь");
        WebPage webPageFB = new WebPage("volves.com", "Volves", "Волк медведь любить охотиться за заяц и любить змея и зима голодать");
        WebPage webPageGoogle = new WebPage("fox.kids", "Fox", "Лиса любить волк и хотеть есть заяц в свободное время");
        WebPage webPageSOF = new WebPage("bird.me", "Birds", "Птица жить и спать на дерево петь песня и смотреть как змея есть заяц");
        indexingWebPage(webPageVK);
        indexingWebPage(webPageYT);
        indexingWebPage(webPageGIT);
        indexingWebPage(webPageFB);
        indexingWebPage(webPageGoogle);
        indexingWebPage(webPageSOF);
        System.out.println("На каких сайтах дерево:");
        searchWebPages("дерево");
        System.out.println("На каких сайтах и:");
        searchWebPages("и");
        System.out.println("На каких сайтах зима:");
       searchWebPages("зима");
        System.out.println("На каких сайтах медведь:");
        searchWebPages("медведь");
        deleteWebPage("bird.me");
        webPagesMap.entrySet().forEach(System.out::println);
    }

    public static void indexingWebPage(WebPage webPage){
        String[] splitContent = webPage.getContent().toLowerCase().replaceAll(",", "").split(" ");
        for (String word : splitContent){
            if (!webPagesMap.containsKey(word)){
                webPagesMap.put(word, new ArrayList<>());
            }
            if (!webPagesURLMap.containsKey(webPage.getURL())){
                webPagesURLMap.put(webPage.getURL(), new ArrayList<>());
            }
            webPagesMap.get(word).add(webPage);
            webPagesURLMap.get(webPage.getURL()).add(word);
        }
    }

    public static void searchWebPages(String word){
        for (WebPage webPage : webPagesMap.get(word.toLowerCase())){
            System.out.println(webPage);
        }
        System.out.println("---------------------------------------");
    }

    public static void deleteWebPage(String URL){
        for (String word : webPagesURLMap.get(URL)){
            webPagesMap.get(word).removeIf(webPage -> webPage.getURL().equals(URL));
        }
    }
}
