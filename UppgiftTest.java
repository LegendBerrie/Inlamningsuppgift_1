package Uppgift_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UppgiftTest {

    @Test
    public void getRows() {
        UppgiftLogic text = new UppgiftLogic();

        text.addText("hej");
        text.addText("då");
        text.addText("Stopp");

        int actual = text.getRows();
        int expected = 2;

        assertEquals(expected, actual);


        text.addText("tjena");
        text.addText("stopp");

        assertEquals(3, text.getRows());
    }

    @Test
    public void getChars() {
        UppgiftLogic text = new UppgiftLogic();

        text.addText("hej då");
        text.addText("stopp");
        int actual = text.getChars();
        int expected = 6;

        assertEquals(expected, actual);

        text.addText("hörrudu");
        text.addText("stopp");

        assertEquals(13, text.getChars());
    }

    @Test
    public void getLongestWord() {
        UppgiftLogic text = new UppgiftLogic();

        text.setLongestWord("hej dåre mi");
        text.addText("stopp");

        assertEquals("dåre", text.getLongestWord());


        text.setLongestWord("Hörruduru din lilla fis");

        assertEquals("Hörruduru", text.getLongestWord());
    }

    @Test
    public void countWords() {
        UppgiftLogic text = new UppgiftLogic();

        text.addText("Hörru tjena fan, liksom");
        text.addText("Stopp");

        assertEquals(4, text.getWords());
    }

    @Test
    public void testOnlySpaceAndTab() {
        UppgiftLogic text = new UppgiftLogic();

        text.addText("             ");
        text.addText("Stopp");

        assertEquals(1, text.getRows());
        assertEquals(13, text.getChars());
        assertEquals(0, text.getWords());
        assertEquals("", text.getLongestWord());
    }

    @Test
    public void testSymbols() {
        UppgiftLogic text = new UppgiftLogic();

        text.addText("/*-+++@£$$£€");
        text.addText("Stopp");

        assertEquals(1, text.getRows());
        assertEquals(12, text.getChars());
        assertEquals(1, text.getWords());
    }
}