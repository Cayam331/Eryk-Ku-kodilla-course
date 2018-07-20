package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBuildBigmac(){
        //Given

        //When
       Bigmac bigmac = new Bigmac.BigmacBuilder()
               .bun("sesame")
               .burgers(3)
               .sauce("standard")
               .ingredient("pepper")
               .build();
        //Then
        System.out.println(bigmac.toString());
        Assert.assertEquals(bigmac.getBurgers(), 3);

    }
}
