package com.yzt.reader;

/*

//遍历段落获取文本（还可以获取段落的其他属性比如字体、字体大小、对齐方式等。）
import com.spire.doc.*;
import com.spire.doc.documents.Paragraph;

import java.io.IOException;

public class ReadWord {
    public static void main(String[] args) throws IOException {
        //加载Word文档
        Document doc = new Document("D:\\1\\word.doc");
        //Document doc = new Document("D:\\1\\word.doc");

        //遍历文档中的节和段落，获取每个段落的文本
        for(int i = 0; i < doc.getSections().getCount(); i++) {
            Section section = doc.getSections().get(i);
            for (int j = 0; j < section.getParagraphs().getCount(); j++) {
                Paragraph paragraph = section.getParagraphs().get(j);
                System.out.println(paragraph.getText());
            }
        }
    }
}
上述仅遍历打印
*/
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.*;
import org.omg.CORBA.portable.ApplicationException;

public class ReadWord{
    /*
    readWordToJson代码示例将标题和段落分别封装到两个 JSON 数组中
    然后将这两个数组封装到一个 JSON 对象中
    并使用 Gson 库将其转换为字符串。
    */
    public static String readWordToJson(String filePath) throws InvalidFormatException, IOException {
        Gson gson = new Gson();
        JsonObject jsonObject = new JsonObject();
        JsonArray paragraphsArray = new JsonArray();
        JsonArray headingsArray = new JsonArray();
        XWPFDocument document = new XWPFDocument(new FileInputStream(filePath));
        for (XWPFParagraph paragraph : document.getParagraphs()) {
            if (paragraph.getStyle() != null && paragraph.getStyle().startsWith("Heading")) {
                JsonObject heading = new JsonObject();
                heading.addProperty("level", paragraph.getStyleID());
                heading.addProperty("text", paragraph.getText());
                headingsArray.add(heading);
            } else {
                JsonObject paragraphObj = new JsonObject();
                paragraphObj.addProperty("text", paragraph.getText());
                paragraphsArray.add(paragraphObj);
            }
        }
        jsonObject.add("headings", headingsArray);
        jsonObject.add("paragraphs", paragraphsArray);
        String json = gson.toJson(jsonObject);
        document.close();
        return json;
//      System.out.println(json);

    }
    public static DocumentData readWord(String filePath) throws InvalidFormatException, IOException {
        XWPFDocument document = new XWPFDocument(new FileInputStream(filePath));
        String title = null;
        List<List<String>> content = new ArrayList<>();
        for (XWPFParagraph paragraph : document.getParagraphs()) {
            if (paragraph.getStyle() != null && paragraph.getStyle().startsWith("Heading")) {
                if (title == null) {
                    title = paragraph.getText();
                } else {
                    // 如果遇到新标题，则将上一个段落添加到正文内容中
                    if (!content.isEmpty()) {
                        List<String> lastRow = content.get(content.size() - 1);
                        String lastCell = lastRow.get(lastRow.size() - 1);
                        if (lastCell.isEmpty()) {
                            lastRow.remove(lastRow.size() - 1);
                        }
                    }
                }
                // 添加新标题到正文内容中
                List<String> row = new ArrayList<>();
                row.add(paragraph.getText());
                content.add(row);
            } else {
                if (!content.isEmpty()) {
                    List<String> lastRow = content.get(content.size() - 1);
                    lastRow.add(paragraph.getText());
                }
            }
        }
        document.close();
        return new DocumentData(title, content);
    }

    public static void main(String[] args) throws IOException, InvalidFormatException {
        String wordFilePath="file\\to\\path";

        //获取以json格式读取的结果
        System.out.println(ReadWord.readWordToJson(wordFilePath));
        //获取以 DocumentData 对象形式读取的结果
        DocumentData documentData = ReadWord.readWord(wordFilePath);
    }
}


