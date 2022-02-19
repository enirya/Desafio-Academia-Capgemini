import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class AnagramaTest {

    @Test
    public void getUserInputTest() {
        String input = "ovo";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("ovo", Anagrama.getUserInput());
    }

    @Test
    public void createSubstringArrayTest() {
        ArrayList<String> substringArray = new ArrayList<>(Arrays.asList("o", "v", "o", "ov", "vo"));
        assertEquals(substringArray, Anagrama.createSubstringArray("ovo"));
    }

    @Test
    public void sortSubstringArrayTest() {
        ArrayList<String> substringArray = new ArrayList<>(Arrays.asList("o", "v", "o", "ov", "vo"));
        ArrayList<String> orderedSubstringArray = new ArrayList<>(Arrays.asList("o", "v", "o", "ov", "ov"));
        assertEquals(orderedSubstringArray, Anagrama.sortSubstringArray(substringArray));
    }

    @Test
    public void getNumberOfAnagramsTest() {
        ArrayList<String> orderedSubstringArray = new ArrayList<>(Arrays.asList("o", "v", "o", "ov", "ov"));
        assertEquals(2, Anagrama.getNumberOfAnagrams(orderedSubstringArray));
    }
}
