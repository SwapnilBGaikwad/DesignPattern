package com.pattern.observer.subject;

import com.pattern.observer.Observer;

interface Subject {
    void register( Observer observer );
    void unRegister( Observer observer );
    void notifyUpdate();
}
