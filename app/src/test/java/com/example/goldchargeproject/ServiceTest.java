package com.example.goldchargeproject;




import org.junit.Test;
import android.util.Log;

import static org.junit.Assert.*;

public class ServiceTest {

    @Test
    public void testService()
    {
        ServiceClient clint = new ServiceClient();
        clint.run();
        assertNotNull(clint.testString);
        System.out.println(clint.testString);
        Log.d("testService",clint.testString);

        //Log.d(clint.testString,clint.testString);
    }


}
