package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {
    //Oridnary food test
    @Test()
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Cat", false);

        Assert.assertEquals("Tuna", food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Hamster", false);

        Assert.assertEquals("Cabbage", food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Dog", false);

        Assert.assertEquals("Dog Food", food);
    }

    //Premium food test
    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Cat", true);

        Assert.assertEquals("Salmon", food);

    }
    @Test
    public void shouldFeedPremiumDogPremiumFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Dog", true);

        Assert.assertEquals("Beef", food);

    }
    @Test
    public void shouldFeedPremiumHamsterPremiumFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Hamster", true);

        Assert.assertEquals("Lettuce", food);

    }
}
