package com.decta.exceptionhandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Handler {

    Logger logger = LoggerFactory.getLogger(Handler.class.getName());

    public void handleException() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            logger.error(e.getMessage());
        }
    }

}
