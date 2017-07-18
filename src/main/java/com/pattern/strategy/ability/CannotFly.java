package com.pattern.strategy.ability;

public class CannotFly implements Flyable {
    @Override public String fly() {
        return "Cannot fly";
    }
}
