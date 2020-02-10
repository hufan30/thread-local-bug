package com.github.hcsp.service;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * @description:
 * @author: HuFan
 * @time: 2020/2/103:23 下午
 **/
public class Junit5ExtensionTest implements BeforeAllCallback, AfterAllCallback {
    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        System.out.println("After");
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("Before");
    }
}
