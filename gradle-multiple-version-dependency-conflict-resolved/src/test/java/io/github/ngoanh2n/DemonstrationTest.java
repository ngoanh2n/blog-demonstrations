package io.github.ngoanh2n;

import io.qameta.allure.Allure;
import org.testng.annotations.Test;

/**
 * @author ngoanh2n@gmail.com (Ho Huu Ngoan)
 */

public class DemonstrationTest {

    @Test
    void test() {
        Allure.step("This is test", () -> {
            System.out.println("Today is 2020-02-28");
        });
    }
}
