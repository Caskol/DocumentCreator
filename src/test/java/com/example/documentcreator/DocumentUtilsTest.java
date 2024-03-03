package com.example.documentcreator;
import com.example.documentcreator.DocumentUtils;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class DocumentUtilsTest {
    Map<String, String> data = new HashMap<>();
    Path path;
    public DocumentUtilsTest()
    {
        data.put("{FIRSTNAME}", "Pyotr");
        data.put("{LASTNAME}", "Kireenko");
        data.put("{SURNAME}", "Ivanovich");
        data.put("{MALINA}", "Малина");
        path = Paths.get("src/test/resources/template1 {FIRSTNAME} {LASTNAME} {SURNAME}.docx");
    }
    @Test
    public void createDocxNameShouldReturnNewName()
    {
        String createdName = DocumentUtils.createDocxName(data,"You received document from {LASTNAME} {FIRSTNAME} {SURNAME}");
        Assert.assertEquals("You received document from Kireenko Pyotr Ivanovich", createdName);
    }
    @Test
    public void parseDocShouldCreateNewFile() throws IOException, Docx4JException {
        Assert.assertNull(DocumentUtils.parseDoc(data, path));
    }
    @Test
    public void getMonthNameShouldReturnMay()
    {
        Assert.assertEquals("мая", DocumentUtils.getMonthName("05"));
        Assert.assertEquals("мая", DocumentUtils.getMonthName("5"));
    }
    @Test
    public void getMonthNameShouldReturnNothing()
    {
        Assert.assertEquals("", DocumentUtils.getMonthName("13"));
        Assert.assertEquals("", DocumentUtils.getMonthName("dsfdsagasgasgasgas"));
    }
}
