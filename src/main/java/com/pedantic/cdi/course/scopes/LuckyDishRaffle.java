package com.pedantic.cdi.course.scopes;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Random;

@Named
public class LuckyDishRaffle {

    @Inject
    private List<String> luckyDishes;
    private String luckyDish;
    private Random random = new Random();

    public void setLuckyDish() {
        luckyDish = luckyDishes.get(random.nextInt(8));
    }

    public String getLuckyDish() {
        return luckyDish;
    }
}
