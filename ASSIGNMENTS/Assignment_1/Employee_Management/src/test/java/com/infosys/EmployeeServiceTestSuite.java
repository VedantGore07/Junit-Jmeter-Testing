package com.infosys;

import org.junit.jupiter.api.DisplayName;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({EmployeeServiceValidTest.class, EmployeeServiceInvalidTest.class})
@IncludeTags({"Valid", "Invalid"})
//@ExcludeTags("Invalid")
@DisplayName("Employee Service Test Suite")
public class EmployeeServiceTestSuite {

}
