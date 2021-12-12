package com.zz.demo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Hello {
    private static final Logger LOGGER = LogManager.getLogger();
    public static void main(String[] args) {
        String detail = "${env:USER}";
        LOGGER.info(detail);
    }
}
