package com.example;

public class Main  {

    public static void main(String[] args) throws Exception {

        Feline feline = new Feline();
        Lion alis = new Lion("Самка", feline);
        Alex alex = new Alex(feline);
        Cat tom = new Cat(feline);

        int alisKittens = feline.getKittens(3);

        System.out.println("У Элис есть грива ? " + alis.doesHaveMane());
        System.out.println("У Алекса есть грива? " + alex.doesHaveMane());
        System.out.println("Котик говорит " + tom.getSound());
        System.out.println("Что ест Элис? " + alis.getFood());
        System.out.println("Что ест Алекс? " + alex.getFood());
        System.out.println("Что ест котик? " + tom.getFood());
        System.out.println("У Элис есть котята? " + alisKittens + " котенка");
        System.out.println("У Алекса есть котята? " + alex.getKittens() + " котенка");
        System.out.println("Где Алекс живет? " + alex.getPlaceOfLiving());
        System.out.println("С кем Алекс дружит? " + alex.getFriends());
        System.out.println("К какому семейству относится котик? " + feline.getFamily());
    }
}
