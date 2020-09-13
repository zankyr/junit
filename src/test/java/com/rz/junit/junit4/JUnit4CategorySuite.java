package com.rz.junit.junit4;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(CategoryA.class)
@Categories.ExcludeCategory(CategoryB.class)
@Suite.SuiteClasses({CategoriesTest.class})
public class JUnit4CategorySuite {
}
