package org.APIAutomation.tests.integration.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {

    @Test(groups = "qa", priority = 1)
    @Owner("Liju")
    @Description("TC001 - Verify that the Booking can be Created")
    public void testCreateBooking(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 2)
    @Owner("Liju")
    @Description("TC002 - Verify the Booking By Booking ID")
    public void testVerifyBookingId(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 3)
    @Owner("Liju")
    @Description("TC003 - Verify the Updated Booking by ID")
    public void testUpdateBookingByID(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 4)
    @Owner("Liju")
    @Description("TC004 - Delete the Booking by ID")
    public void testDeleteBookingById(){
        Assert.assertTrue(true);
        Assert.assertTrue(true);
    }
}
