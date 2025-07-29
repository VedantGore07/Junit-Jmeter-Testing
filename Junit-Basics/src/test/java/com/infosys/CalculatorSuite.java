package com.infosys;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({AdditionTest.class, DivisionTest.class, CalculatorMultiplicationTest.class})
@IncludeTags({"Success", "Slow"})
@ExcludeTags("Failure")
public class CalculatorSuite {
}
