package com.example.turkcellmarket.services.abstracts;

public interface MessageService
{
    String getMessage(String key);
    String getMessageWithArgs(String key, Object... args);
}
// getMessageWithArgs("key", arg1,arg2)
// getMessageWithArgs("key", arg1)