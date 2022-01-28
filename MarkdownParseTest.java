import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test 
    public void test() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("https://something.com");
        newList.add("some-page.html");
        assertEquals(newList, links);
    }

    @Test 
    public void test2() throws IOException {
        Path fileName = Path.of("test2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("https://something.com");
        newList.add("some-page.html");
        assertEquals(newList, links);
    }

    @Test 
    public void test3() throws IOException {
        Path fileName = Path.of("test3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> newList = new ArrayList<String>();
        /* newList.add("https://something.com");
        newList.add("some-page.html"); */
        assertEquals(newList, links);
    }

    @Test 
    public void test4() throws IOException {
        Path fileName = Path.of("test4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> newList = new ArrayList<String>();
        /* newList.add("https://something.com");
        newList.add("some-page.html"); */
        assertEquals(newList, links);
    }

    @Test 
    public void test5() throws IOException {
        Path fileName = Path.of("test5.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("page.com");

        assertEquals(newList, links);
    }

    @Test 
    public void test6() throws IOException {
        Path fileName = Path.of("test6.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("page.com");
        assertEquals(newList, links);
    }

    @Test 
    public void test7() throws IOException {
        Path fileName = Path.of("test7.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> newList = new ArrayList<String>();
        /* newList.add("https://something.com");
        newList.add("some-page.html"); */
        assertEquals(newList, links);
    }

    @Test 
    public void test8() throws IOException {
        Path fileName = Path.of("test8.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("a link on the first line");
        assertEquals(newList, links);
    }
}
