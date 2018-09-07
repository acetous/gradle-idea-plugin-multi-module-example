package org.gradle;

import org.junit.Test;

public class PersonTest {

    // this should not compile becauhse HelperTest is located in the shared-module.
    private HelperTest helperTest = new HelperTest();

    @Test
    public void ok() {
    }
}