package com.pattern.strategy.ability;

import org.junit.Assert;
import org.junit.Test;

public class CannotFlyTest {
    @Test
    public void return_cannot_fly_on_call_of_fly() {
        final CannotFly cannotFly = new CannotFly();
        final String fly = cannotFly.fly();
        Assert.assertEquals( "Cannot fly", fly );
    }
}