package com.rz.junit.junit4;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CategoriesTest {
    @Test
    public void categoryNoneTest() {
        System.out.println("Test without any category");
        assert (false);
    }

    @Category(CategoryA.class)
    @Test
    public void test1() {
        System.out.println("Runs when category A is selected.");
        assert (true);
    }

    @Category(CategoryB.class)
    @Test
    public void test2() {
        System.out.println("Runs when category B is included.");
        assert (false);
    }

    @Category({CategoryA.class, CategoryB.class})
    @Test
    public void test3() {
        System.out.println("Runs when either of category is included.");
        assert (true);
    }
}
