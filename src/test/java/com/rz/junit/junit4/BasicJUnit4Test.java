package com.rz.junit.junit4;

import org.junit.*;

import static org.junit.Assert.*;

public class BasicJUnit4Test {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Executed before all tests");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Executed after all tests");
    }

    @Before
    public void setUp() {
        System.out.println("Executed before each test");
    }

    @Test
    public void alwaysPassing() {
        assertTrue("Always true", true);
    }

    @Test
    public void alwaysFailing() {
        assertFalse("Always false", false);
    }

    @After
    public void after() {
        System.out.println("Executed after each test");
    }

    @Test
    @Ignore("Ignored test for a good reason")
    public void ignoreTest() {
        fail("Always fails");
    }

    @Test(timeout = 1)
    public void testWithTimeout() throws InterruptedException {
        Thread.sleep(2000); // Fails because it takes longer than 1 second
    }
}
