import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll
   static void beforAll () {
       System.out.println("Here is beforeall ()");
   }
    @BeforeEach
    void beforEach () {
        System.out.println("    Here is beforeEach ()");
    }
    @AfterAll
    static void afterAll () {
        System.out.println("Here is afterAll ()");
    }
    @AfterEach
    void afterEach () {
        System.out.println("Here is afterEach ()");
    }
    @Test
    void firsttest () {
        System.out.println("        Here is firsttest ()");
    }

    @Test
    void secondtest () {
        System.out.println("        Here is secondtest ()");
    }
}
