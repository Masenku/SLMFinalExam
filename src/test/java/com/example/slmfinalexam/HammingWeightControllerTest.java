package com.example.slmfinalexam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HammingWeightControllerTest {

    private HammingWeightController hammingweightcontroller = new HammingWeightController();


    @Test
    public void testCalculateHammingWeight() {
        // Arrange
        String number = "0123";
        int expectedWeight = 3;

        // Act
        int actualWeight = hammingweightcontroller.calculateHammingWeight(number);

        // Assert
        Assertions.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testGetLastString() {
        // Arrange
        String expectedLastString = "0123";

        // Act
        hammingweightcontroller.calculateHammingWeight(expectedLastString);
        String actualLastString = hammingweightcontroller.getPreviousHammingWeight();

        // Assert
        Assertions.assertEquals(expectedLastString, actualLastString);
    }
}