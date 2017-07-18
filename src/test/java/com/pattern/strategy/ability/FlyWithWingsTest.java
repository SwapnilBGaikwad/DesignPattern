package com.pattern.strategy.ability;

import org.junit.Assert;
import org.junit.Test;

public class FlyWithWingsTest {
    @Test
    public void should_return_parrot_fly_on_call() {
        final Flyable withWings = new FlyWithWings();

        final String fly = withWings.fly();

        Assert.assertEquals( "Fly with wings", fly );
    }
}