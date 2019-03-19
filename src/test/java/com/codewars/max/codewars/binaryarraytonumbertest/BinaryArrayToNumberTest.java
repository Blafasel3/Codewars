package com.codewars.max.codewars.binaryarraytonumbertest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.codewars.max.codewars.binaryarraytonumber.BinaryArrayToNumber;


class BinaryArrayToNumberTest {
    @Test
    public void convertBinaryArrayToInt() throws Exception {

      assertEquals(1, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
      assertEquals(15, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
      assertEquals(6, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
      assertEquals(9, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
    }

}
