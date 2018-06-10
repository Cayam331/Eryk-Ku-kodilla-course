package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country();
        Country germany = new Country();
        Country russia = new Country();

        Country unitedStates = new Country();
        Country mexico = new Country();
        Country kanada = new Country();


        Continent europe = new Continent();
        europe.continentCountries.add(poland);
        europe.continentCountries.add(russia);
        europe.continentCountries.add(germany);

        Continent northAmerica = new Continent();
        northAmerica.continentCountries.add(unitedStates);
        northAmerica.continentCountries.add(mexico);
        northAmerica.continentCountries.add(kanada);

        World theWorld = new World();
        theWorld.worldContinents.add(europe);
        theWorld.worldContinents.add(northAmerica);

        //When
        BigDecimal result = theWorld.getPeopleQuantity();

        //Then
        BigDecimal expectedResult = new BigDecimal("36");
        Assert.assertEquals(expectedResult, result);
    }
}
