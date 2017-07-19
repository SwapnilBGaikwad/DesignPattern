package com.pattern.observer.subject;

import com.pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {
    private int applePrice;
    private int googlePrice;
    private int ibmPrice;
    private List<Observer> observerList;

    public StockGrabber( int applePrice, int googlePrice, int ibmPrice,
            ArrayList<Observer> observerList ) {
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
        this.ibmPrice = ibmPrice;
        this.observerList = observerList;
    }

    public void setApplePrice( int applePrice ) {
        this.applePrice = applePrice;
        notifyUpdate();
    }

    public void setGooglePrice( int googlePrice ) {
        this.googlePrice = googlePrice;
        notifyUpdate();
    }

    public void setIbmPrice( int ibmPrice ) {
        this.ibmPrice = ibmPrice;
        notifyUpdate();
    }

    @Override public void register( Observer observer ) {
        observerList.add( observer );
    }

    @Override public void unRegister( Observer observer ) {
        observerList.remove( observer );
    }

    @Override public void notifyUpdate() {
        observerList.forEach( observer ->
                observer.update( applePrice, googlePrice, ibmPrice )
        );
    }
}