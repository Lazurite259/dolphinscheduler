package org.apache.dolphinscheduler.alert.api;

import org.junit.Assert;
import org.junit.Test;

public class AlertResultTest {

    @Test
    public void testAlertResultEqualsTrue(){
        AlertResult ar1 = new AlertResult("Message", "Status");
        AlertResult ar2 = new AlertResult("Message", "Status");
        Assert.assertTrue(ar1.equals(ar2));
    }

    @Test
    public void testAlertResultEqualsFalse(){
        AlertResult ar1 = new AlertResult("Message1", "Status1");
        AlertResult ar2 = new AlertResult("Message2", "Status2");
        Assert.assertFalse(ar1.equals(ar2));
    }
}