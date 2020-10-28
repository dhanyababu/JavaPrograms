package Mjuk19_package;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodleAnalyserTest {
    @Test
    public void testMoodAnalysis() throws Exception{
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyserMood("This is a sad message");
       Assert.assertThat(mood, CoreMatchers.is("SAD"));

    }

}
