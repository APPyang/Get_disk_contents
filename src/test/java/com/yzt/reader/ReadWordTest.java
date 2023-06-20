package com.yzt.reader;

import com.yzt.reader.ReadWord;
import com.yzt.reader.ReadWord;
//import org.junit.jupiter.api.Test;
import org.junit.*;
import org.apache.poi.xwpf.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.Gson;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class ReadWordTest {
    @Test
    public void testReadWordFile() throws IOException, InvalidFormatException {
        // Given
        String filePath = "E:\\01\\word.doc";

        // When
        ReadWord.readWordToJson(filePath);

        // Then
        // Assert the expected output with the actual output
        //assert(expectedJsonString, actualJsonString)
    }

       /* @Test
        public void testReadWord() throws IOException {
            // Given
            String filePath = "D:\\1\\word.doc";
            String expectedText = "这是一个测试文件，用于测试读取Word文档的功能。";

            // When
            String actualText = ReadWord.readWord(filePath);

            // Then
            assertEquals(expectedText, actualText);
        }*/

        /*@Test
        public void testReadWordFile() throws IOException, InvalidFormatException {
            // Given
            String filePath = "D:\\1\\word.doc";
            String expectedJson = "{\"headings\":[{\"level\":\"1\",\"text\":\"第一章\"},{\"level\":\"2\",\"text\":\"第一节\"}],\"paragraphs\":[{\"text\":\"这是第一节的内容。\"},{\"text\":\"这是第一章的内容。\"}]}";

            // When
            String actualJson = ReadWord.readWordFile(filePath);

            // Then
            assertEquals(expectedJson, actualJson);
        }
    */
}