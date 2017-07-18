package com.pattern.strategy;

import com.pattern.strategy.ability.Flyable;

class Bird {
    private final Flyable flyable;

    Bird( final Flyable flyable ) {
        this.flyable = flyable;
    }

    void fly() {
        System.out.println( flyable.fly() );
    }
}
