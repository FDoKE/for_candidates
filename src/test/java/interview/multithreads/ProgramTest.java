package interview.multithreads;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    void test() {
        // arrange
        int workToBeDone = 10;
        Program program = new Program();
        ResultProcessor resultCallback = new ResultProcessor(workToBeDone);

        // act
        program.run(resultCallback);

        // assert
        System.out.println(resultCallback.getResults());
        assertEquals(workToBeDone, resultCallback.getResults().size());
        assertThat(resultCallback.getResults(), contains(
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        ));
    }

}