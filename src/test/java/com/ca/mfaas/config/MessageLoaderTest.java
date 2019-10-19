package com.ca.mfaas.config;

import static org.junit.Assert.assertEquals;

import com.ca.mfaas.data.MessageLoader;

import org.junit.Test;

public class MessageLoaderTest{
    
    private static final String TEST_FILE = "config/testMessages.yml";

    @Test
    public void loadFromFile() {
        MessageLoader loader = new MessageLoader(TEST_FILE);
        assertEquals("Incorrect number of loaded messages", 4, loader.getMessages().size());
    }
}