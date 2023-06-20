使用该库：
    导包：
        import com.yzt.reader.

一· 读取pdf文件:
    ReadPdf类，readPdfToJson方法，输出为json格式串：
        ReadPdf.readPdfToJson(filePath);
    ReadPdf类,readPdf方法，返回DocumentData 对象：
        ReadPdf.readPdf(filePath);

二· 读取word文件:
    ReadWord类，readWordToJson方法，输出为json格式串：
        ReadWord.readWordToJson(filepath);
    ReadWord类,readWord方法，返回DocumentData 对象：
        ReadWord.readWord(filePath);

三· 读取excel文件：
    ReadExcel类,readExcelToJson方法， 输出为json格式串：
        ReadExcel.readExcelToJson(filepath);
    ReadExcel类,readExcel方法，返回DocumentData 对象：
        ReadExcel.readExcel(filePath);# Get_disk_contents
