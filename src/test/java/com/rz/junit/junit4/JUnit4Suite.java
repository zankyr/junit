package com.rz.junit.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BasicJUnit4Test.class,
        JUnit4ExceptionTest.class,
        JUnit4TemporaryFolderRuleTest.class
})
public class JUnit4Suite {
}
