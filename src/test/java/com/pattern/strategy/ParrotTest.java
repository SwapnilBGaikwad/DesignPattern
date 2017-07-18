package com.pattern.strategy;

import com.pattern.strategy.ability.FlyWithWings;
import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {
    @Test
    public void return_parrot_fly_if_fly_is_called() {
        final FlyWithWingsMock flyable = new FlyWithWingsMock();
        final Parrot parrot = new Parrot( flyable );

        parrot.fly();

        Assert.assertEquals( 1, flyable.callTimes );
    }

    private class FlyWithWingsMock extends FlyWithWings {
        private int callTimes;

        FlyWithWingsMock() {
            callTimes = 0;
        }

        @Override public String fly() {
            callTimes++;
            return "Expected fly behavior";
        }

    }
}
