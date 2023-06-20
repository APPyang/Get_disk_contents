package com.yzt.reader;

import com.yzt.reader.ReadPdf;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReadPdfTest {

    private static final String TEST_FILE_PATH = "src/test/resources/test.pdf";

    @Test(expected = RuntimeException.class)
    public void testToJsonWithNonexistentFile() {
        String filePath = "nonexistent_file.pdf";
        ReadPdf.readPdfToJson(filePath);
    }

    @Test
    public void testToJsonWithTitleAndBody() {
        String json = ReadPdf.readPdfToJson(TEST_FILE_PATH);
        assertNotNull(json);
        assertFalse(json.isEmpty());

        // 验证标题是否正确
        assertTrue(json.contains("\"title\": \"This is a test PDF file\""));

        // 验证正文是否正确
        assertTrue(json.contains("\"body\": \"This is a sample PDF file containing some basic information.\""));
    }

    @Test
    public void testToJsonWithEmptyTitle() {
        // 在 PDF 文件中找不到标题时，返回值应该为 null 而不是 JSON 字符串
        String filePath = "src/test/resources/empty_title.pdf";
        String json = ReadPdf.readPdfToJson(filePath);
        assertNull(json);
    }

    @Test
    public void testToJsonWithEmptyContent() {
        // 在 PDF 文件中找不到正文时，返回的 JSON 字符串中应该 body 属性为空字符串
        String filePath = "src/test/resources/empty_content.pdf";
        String json = ReadPdf.readPdfToJson(filePath);
        assertNotNull(json);
        assertTrue(json.contains("\"title\": \"This PDF file has empty content\""));
        assertTrue(json.contains("\"body\": \"\""));
    }
}
