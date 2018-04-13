package com.clean_architecture.tronnv.presentationlayer.common;

public abstract class Util {
    /**
    * A utility class whose purpose it only to simulate
    * a network latency. What is does it to delay the
    * running thread by the specified number of milliseconds.
    */
    public static void simulateNetworkLatency(int millis) {
        // Pause current thread
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
