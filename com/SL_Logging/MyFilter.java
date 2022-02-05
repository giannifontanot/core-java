package com.SL_Logging;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class MyFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord log){
        if(log.getLevel()== Level.CONFIG) return true;
        return true;
    }

}
