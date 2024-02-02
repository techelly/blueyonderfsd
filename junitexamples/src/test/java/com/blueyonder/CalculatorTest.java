package com.blueyonder;

import com.blueyonder.main.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calc=new Calculator(10,10);
    @BeforeEach
    public void initializeData(){
        calc.setNum1(15);
        calc.setNum2(10);
    }
    //Test Case 1
    @Tag("PROD")
    @Test
    @DisplayName("divisionbyzerotestcase")
    public void testDivisionByZero(){

        assertThrows(ArithmeticException.class, () -> calc.division(10, 0), "Division by zero not allowed");
    }

    @Test
    @Tag("DEV")
    @Disabled
    public void testDivision(){
        int result = calc.division(10,2);
        assertEquals(5,result);
    }
    @Test
    public void testDivisionFailure(){
        int result = calc.division(10,2);
        assertNotEquals(4,result);
    }
    //Test Case 2
    //Test Case 3
    //Test Case 4

    @AfterEach
    public void initializeDataWithZero(){
        calc.setNum1(0);
        calc.setNum2(0);
    }

}
