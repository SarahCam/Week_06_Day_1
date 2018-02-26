import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EightBallTest {

    private EightBall eightBall;

    @Before
    public void before(){
        ArrayList<String> answers = new ArrayList<>();
        answers.add("One");
        answers.add("Two");
        answers.add("Three");
        eightBall = new EightBall(answers);
    }

    @Test
    public void getNumberAnswers(){
        assertEquals(3, eightBall.getSize());
    }


    @Test
    public void getRandomAnswer(){
        ArrayList results = eightBall.getAllAnswers();
        String randomAnswer = eightBall.getRandomAnswer();
        assertTrue(results.contains(randomAnswer));
    }


    @Test
    public void canAddAnswer(){
        eightBall.add("Four");
        assertEquals(4, eightBall.getSize());
    }

    @Test
    public void canRemoveAnswer(){
        eightBall.remove("Three");
//        assertEquals(2, eightBall.getAllAnswers().size());
        assertEquals(2, eightBall.getSize());

    }

}
