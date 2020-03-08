package com.github.ngoanh2n.scenarios.childPackage02;

import org.testng.annotations.Test;

/**
 * @author ngoanh2n@gmail.com (Ho Huu Ngoan)
 */

public class TestClassName02 {

    @Test
    void method01(){
        final String clazzPresentation = this.getClass().getName();
        final String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        System.out.println(String.format("%s.%s", clazzPresentation, methodName));
    }

    @Test
    void method02(){
        final String clazzPresentation = this.getClass().getName();
        final String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        System.out.println(String.format("%s.%s", clazzPresentation, methodName));
    }
}
