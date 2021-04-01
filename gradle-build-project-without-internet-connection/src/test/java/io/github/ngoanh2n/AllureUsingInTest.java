package io.github.ngoanh2n;

import io.qameta.allure.Step;

public class AllureUsingInTest {

    @Step("This is step description")
    public static void step() {
        System.out.println("Test");
    }
}
