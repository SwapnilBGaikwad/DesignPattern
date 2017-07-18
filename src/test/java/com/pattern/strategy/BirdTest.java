package com.pattern.strategy;

import com.pattern.strategy.ability.FlyWithWings;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class BirdTest {
    @Mock
    private FlyWithWings flyWithWings;
    @InjectMocks
    private Parrot parrot = new Parrot( flyWithWings );

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks( this );
    }

    @Test
    public void parrot_fly_returns_how_it_fly_mock() {
        when( flyWithWings.fly() ).thenReturn( "dummy fly" );
        parrot.fly();
        verify( flyWithWings ).fly();
    }
}