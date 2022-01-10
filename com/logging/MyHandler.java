package com.logging;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class MyHandler extends StreamHandler {

    @Override
    public void publish(LogRecord record) {
        super.publish(record);
        System.out.println(" ------ ------ ------ ");
    }

    @Override
    public void flush() {
        super.flush();
    }

    @Override
    public void close() throws SecurityException {
        super.close();

    }
}
