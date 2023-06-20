package com.yzt.reader;

import com.yzt.reader.ReadExcel;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.io.IOException;

public class ReadExcelTest {
    private static final String TEST_FILE_PATH = "src/test/resources/test.xlsx";

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testReadExcelWithXlsx() throws IOException {
        // 测试能否正确读取 xlsx 格式的文件
        ReadExcel.readExcelToJson(TEST_FILE_PATH);
    }

    @Test
    public void testReadExcelWithXls() throws IOException {
        // 测试能否正确读取 xls 格式的文件
        String filePath = "src/test/resources/test.xls";
        ReadExcel.readExcelToJson(filePath);
    }

    @Test
    public void testReadExcelWithUnsupportedFile() throws IOException {
        // 测试当传入一个不受支持的文件类型时是否会触发特定的异常
        String filePath = "src/test/resources/test.txt";
        exception.expect(IOException.class);
        exception.expectMessage("文件后缀不是xls或xlsx！");
        ReadExcel.readExcelToJson(filePath);
    }
}
