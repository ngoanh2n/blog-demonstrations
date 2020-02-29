package com.github.ngoanh2n;

import io.qameta.allure.Allure;
import org.testng.annotations.Test;

public class DemonstrationTest {

    @Test
    void test(){
        Allure.step("This is test", () -> {
            System.out.println("Today is 2020-02-28");
        });
    }
}
