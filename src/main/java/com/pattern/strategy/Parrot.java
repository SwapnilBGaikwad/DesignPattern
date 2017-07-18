package com.pattern.strategy;

import com.pattern.strategy.ability.FlyWithWings;

class Parrot extends Bird {
    Parrot( final FlyWithWings flyable ) {
        super( flyable );
    }
}
