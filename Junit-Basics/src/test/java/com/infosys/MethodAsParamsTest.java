package com.infosys;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MethodAsParamsTest {

    @ParameterizedTest
    @MethodSource("com.infosys.Operations#checkMethodArgs")
    void checkExplicitmethodSource(String names)
    {
        assertTrue(StringUtils.isNotBlank(names), "string is empty");
    }
}
