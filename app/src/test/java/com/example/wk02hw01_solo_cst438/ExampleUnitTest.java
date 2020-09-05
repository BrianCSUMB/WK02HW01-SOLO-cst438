package com.example.wk02hw01_solo_cst438;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void testValidate() {
        MainActivity main = new MainActivity();

        String user = "wrong";
        String pass = "wrong";
        assertFalse(main.validate(user, pass));

        user = "din_djarin";
        pass = "Wrong";
        assertFalse(main.validate(user, pass));

        user = "Wrong";
        pass = "baby_yoda_ftw";
        assertFalse(main.validate(user, pass));

        user = "din_djarin";
        pass = "baby_yoda_ftw";
        assertTrue(main.validate(user, pass));
    }
}

