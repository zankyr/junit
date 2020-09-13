package com.rz.junit.junit4;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class JUnit4ExceptionTest {

    // none() is deprecated since 4.13
    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Test(expected = NullPointerException.class)
    public void exceptionTest() {
        throw new IllegalArgumentException(); // Fails, not a NPE
    }

    @Test
    public void expectedExceptionTest() {
        String errorMessage = "A very meaningful message";

        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(errorMessage);

        throw new IllegalArgumentException(errorMessage);
    }

    @Test
    public void assertThrowsException() {
        Assert.assertThrows(NumberFormatException.class,
                () -> Integer.parseInt("a"));
    }

    @Test
    public void assertThrowsExceptionCheckMessage() {
        Exception exception = Assert.assertThrows(NumberFormatException.class,
                () -> Integer.parseInt("a"));

        String expected = "For input string";
        String actual = exception.getMessage();

        assertTrue(actual.contains(expected));
    }
}
