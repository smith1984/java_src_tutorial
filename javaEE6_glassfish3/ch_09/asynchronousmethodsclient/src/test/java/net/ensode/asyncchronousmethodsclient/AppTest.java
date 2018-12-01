package net.ensode.asyncchronousmethodsclient;

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
     * @return набор тестов проверяется
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
