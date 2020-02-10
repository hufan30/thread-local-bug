package com.github.hcsp.service;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author: HuFan
 * @time: 2020/2/102:22 下午
 **/
@RunWith(SpringRunner.class)
public class Junit4Test {
    @Rule
    public ExternalResource ruleTest = new RuleTest();

    @Test
    public void test() {

    }

    class RuleTest extends ExternalResource {
        @Override
        protected void before() throws Throwable {
            System.out.println("Before");
        }

        @Override
        protected void after() {
            System.out.println("After");
        }
    }
}
