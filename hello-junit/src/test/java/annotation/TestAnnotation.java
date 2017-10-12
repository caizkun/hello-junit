package annotation;

import org.junit.*;

public class TestAnnotation {

    // execute before class
    @BeforeClass
    public static void beforeClass() {
        System.out.println("use @BeforeClass");
    }

    // execute after class
    @AfterClass
    public static void afterClass() {
        System.out.println("use @AfterClass");
    }

    // execute before test
    @Before
    public void before() {
        System.out.println("use @Before");
    }

    // execute after test
    @After
    public void after() {
        System.out.println("use @After");
    }

    // execute test case
    @Test
    public void test() {
        System.out.println("use @Test");
    }

    @Ignore
    public void ignoreTest() {
        System.out.println("use @Ignore");
    }
}
