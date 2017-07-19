package com.pattern.observer;

class StockObserver implements Observer {
    @Override public void update( int ibmPrice, int applePrice, int googlePrice ) {
        System.out.println("IBMPrice : " + ibmPrice);
        System.out.println("ApplePrice : " + applePrice);
        System.out.println("GooglePrice : " + googlePrice);
    }
}
