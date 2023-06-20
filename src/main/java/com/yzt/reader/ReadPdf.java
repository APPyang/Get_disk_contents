package com.yzt.reader;
/*
import com.spire.pdf.PdfDocument;
import com.spire.pdf.PdfPageBase;
import java.io.*;

public class ReadPdf {
    //提取PDF所有页文字
    public static String getPdfTextAll(String url) {
        String content = "";

        // 创建PdfDocument实例
        PdfDocument doc = new PdfDocument();
        // 加载PDF文件
        doc.loadFromFile(url);

        // 创建StringBuilder实例
        StringBuilder sb = new StringBuilder();

        PdfPageBase page;
        // 遍历PDF页面，获取每个页面的文本并添加到StringBuilder对象
        for (int i = 0; i < doc.getPages().getCount(); i++) {
            page = doc.getPages().get(i);
            sb.append(page.extractText(true));r,
        }
        content = sb.toString();
        return content;
    }
}
*/

//使用apach poi读取pdf文件 并识别内容标题，正文。
// 使用 Java 的 JSON 库 Gson，将它们封装成 JSON 格式串。
// 将其做成库的形式，供其他人使用
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class ReadPdf{
    /**
     * readPdfToJson:
     * 读取指定路径的 PDF 文件，并识别其中的标题和正文内容，封装成 JSON 格式串返回。
     * @param filePath 文件路径
     * @return 识别结果的 JSON 格式串
     */
    public static String readPdfToJson(String filePath) {
        PDDocument document = null;
        InputStream inputStream = null;
        try {
            // 打开 PDF 文件，并获取其中的文本内容
            document = PDDocument.load(new File(filePath));
            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setSortByPosition(true);
            stripper.setStartPage(1);
            stripper.setEndPage(document.getNumberOfPages());
            String textContent = stripper.getText(document);

            // 分割文本内容，尝试识别标题和正文
            List<String> lines = Arrays.asList(textContent.split("\\r?\\n"));
            String title = null;
            StringBuilder body = new StringBuilder();
            boolean ignoreFirstLine = true;
            for (String line : lines) {
                if (ignoreFirstLine) {
                    ignoreFirstLine = false;
                    continue;
                }
                if (line.trim().isEmpty()) {
                    continue;  // 忽略空行
                }
                if (title == null) {
                    title = line.trim();
                } else {
                    body.append(line).append("\n");
                }
            }
            // 封装识别结果为 JSON 格式串
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("title", title);
            jsonObject.addProperty("body", body.toString());
            return new Gson().toJson(jsonObject);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    // Ignore
                }
            }
            if (document != null) {
                try {
                    document.close();
                } catch (IOException e) {
                    // Ignore
                }
            }
        }
    }

    public static DocumentData readPdf(String filePath) {
        PDDocument document = null;
        InputStream inputStream = null;
        try {
            // 打开 PDF 文件，并获取其中的文本内容
            document = PDDocument.load(new File(filePath));
            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setSortByPosition(true);
            stripper.setStartPage(1);
            stripper.setEndPage(document.getNumberOfPages());
            String textContent = stripper.getText(document);

            // 分割文本内容，尝试识别标题和正文
            List<String> lines = Arrays.asList(textContent.split("\\r?\\n"));
            String title = null;
            List<List<String>> content = new ArrayList<>();
            boolean ignoreFirstLine = true;
            for (String line : lines) {
                if (ignoreFirstLine) {
                    ignoreFirstLine = false;
                    continue;
                }
                if (line.trim().isEmpty()) {
                    continue;  // 忽略空行
                }
                if (title == null) {
                    title = line.trim();
                } else {
                    List<String> row = new ArrayList<>();
                    row.add(line.trim());
                    content.add(row);
                }
            }
            return new DocumentData(title, content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    // Ignore
                }
            }
            if (document != null) {
                try {
                    document.close();
                } catch (IOException e) {
                    // Ignore
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        String pdfFilePath="D:\\1\\未命名1_加水印.pdf";
        //获取以json格式读取的结果
        System.out.println(ReadPdf.readPdfToJson(pdfFilePath));
        //获取以 DocumentData 对象形式读取的结果
        //DocumentData documentData = ReadPdf.readPdf(pdfFilePath);
    }

}


