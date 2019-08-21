package Junit.Suites;

import Junit.DivisionTest;
import Junit.SubstractionTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * created by Andrei_Korotkov 8/19/2019
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({DivisionTest.class, SubstractionTest.class})
public class DivisionAndSubstractionSuite {

}
