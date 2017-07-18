package com.pattern.strategy;

import com.pattern.strategy.ability.CannotFly;

class ToyBird extends Bird {
    ToyBird( final CannotFly flyable ) {
        super( flyable );
    }
}
