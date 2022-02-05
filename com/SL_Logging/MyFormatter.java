package com.SL_Logging;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormatter extends Formatter {
    @Override
    public String format(LogRecord record){
    return record.getSourceClassName() + " :: " +
            record.getSourceMethodName() + " :: " +
            record.getLevel() + " :: " +
            new Date(record.getMillis())+ " :: " +
            record.getMessage() + "\n";
    }
}
