package interview.multithreads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProgramTest {

    private Program program = new Program();

    @Test
    void test1() {
        assertTrue(program.run("{{}}"));
    }

    @Test
    void test2() {
        assertFalse(program.run(""));
    }

    @Test
    void test3() {
        assertTrue(program.run("{}{}"));
    }

    @Test
    void test4() {
        assertFalse(program.run("{{}{}"));
    }

    @Test
    void test5() {
        assertFalse(program.run("{}}"));
    }

    @Test
    void test6() {
        assertTrue(program.run("{{{{{{}}}}}{}{}{{}{{}}}}"));
    }

    @Test
    void test7() {
        assertFalse(program.run("{"));
    }

    @Test
    void test8() {
        assertFalse(program.run("}"));
    }

    @Test
    void test9() {
        assertFalse(program.run("{{}}}{"));
    }

    @Test
    void test10() {
        assertFalse(program.run("}{{{{}}}"));
    }

}