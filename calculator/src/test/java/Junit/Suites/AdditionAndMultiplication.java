package Junit.Suites;

import Junit.AdditionTest;
import Junit.Interfaces.AdditionAndMultiplicationInterface;
import Junit.MultiplicationTest;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * created by Andrei_Korotkov 8/19/2019
 */

@Suite.SuiteClasses({AdditionTest.class, MultiplicationTest.class})
@Category(AdditionAndMultiplicationInterface.class)
@RunWith(Categories.class)
public class AdditionAndMultiplication {
}
