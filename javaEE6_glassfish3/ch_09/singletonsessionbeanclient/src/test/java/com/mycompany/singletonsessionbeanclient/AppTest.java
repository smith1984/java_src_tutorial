package com.mycompany.singletonsessionbeanclient;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Модульный тест для простого приложения.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Создание теста
     *
     * @param testName имя теста
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return Набор тестов проверяется
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Строгий тест :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
