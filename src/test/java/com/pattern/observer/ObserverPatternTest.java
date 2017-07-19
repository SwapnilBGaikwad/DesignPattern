package com.pattern.observer;

import com.pattern.observer.subject.StockGrabber;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class ObserverPatternTest {
    private Observer observer;
    private StockGrabber stockGrabber;

    @Before
    public void setUp() throws Exception {
        this.observer = mock( StockObserver.class );
        final ArrayList<Observer> observerList = new ArrayList<>();
        stockGrabber = new StockGrabber( 100,
                120,
                140,
                observerList );
    }

    @Test
    public void update_price_of_each_stock_when_changed_observer() {
        stockGrabber.register( observer );
        stockGrabber.setApplePrice( 140 );
        stockGrabber.setGooglePrice( 140 );
        stockGrabber.setIbmPrice( 140 );

        verify( observer ).update( 140, 120, 140 );
        verify( observer, times( 2 ) )
                .update( 140, 140, 140 );
        Mockito.reset( observer );
        stockGrabber.unRegister( observer );
        stockGrabber.setIbmPrice( 160 );
        stockGrabber.setApplePrice( 180 );
        stockGrabber.setGooglePrice( 200 );

        verify( observer, never() ).update( 160, 180, 200 );
    }
}