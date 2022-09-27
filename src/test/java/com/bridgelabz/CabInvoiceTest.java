package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {

	CabInvoice cabInvoice;
    @Test
    public void givenDistance_whenchecked_shouldReturnTotalFare(){
        CabInvoice cabInvoice = new CabInvoice();
        double distance = 2.5;
        int time = 2;
        double totalFare = cabInvoice.calculateFare(distance,time);
        Assert.assertEquals(27, totalFare);
    }

    @Test
    public void givenDistance_whenchecked_shouldReturnMinimumFare(){
        CabInvoice cabInvoice = new CabInvoice();
        double distance = 0.2;
        int time = 1;
        double totalFare = cabInvoice.calculateFare(distance,time);
        Assertions.assertEquals(5, totalFare);
    }
	
	
}
