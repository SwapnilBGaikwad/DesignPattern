package com.pattern.strategy;

import com.pattern.strategy.ability.CannotFly;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class ToyBirdTest {
    @Mock
    private CannotFly flyable;
    @InjectMocks
    private Bird toyBird = new ToyBird( flyable );

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks( this );
    }

    @Test
    public void should_call_flyable_fly_method() {
        toyBird.fly();
        verify( flyable ).fly();
    }
}