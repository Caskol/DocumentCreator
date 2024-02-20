package com.example.documentcreator;


import de.phip1611.Docx4JSRUtil;
import org.docx4j.Docx4J;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public final class DocumentUtils {
    public static String getMonthName(String monthNumerical)
    {
        switch (monthNumerical)
        {
            case "1":
            case "01":
                return "января";
            case "2":
            case "02":
                return "февраля";
            case "3":
            case "03":
                return "марта";
            case "4":
            case "04":
                return "апреля";
            case "5":
            case "05":
                return "мая";
            case "6":
            case "06":
                return "июня";
            case "7":
            case "07":
                return "июля";
            case "8":
            case "08":
                return "августа";
            case "9":
            case "09":
                return "сентября";
            case "10":
                return "октября";
            case "11":
                return "ноября";
            case "12":
                return "декабря";
            default:
                return "";
        }
    }
    public static Void parseDoc(Map<String,String> data, Path docPath) throws IOException, Docx4JException {
        try (FileInputStream fis = new FileInputStream(docPath.toString())) {
            WordprocessingMLPackage doc = WordprocessingMLPackage.load(fis);
            Docx4JSRUtil.searchAndReplace(doc, data);
            // Сохранение изменений
            Docx4J.save(doc, new File("CopyOf" + docPath.getFileName()));
            return null;
        } catch (IOException e) {
            throw new IOException("Произошла ошибка при попытке чтения файла " + docPath);
        } catch (Docx4JException e){
            throw new Docx4JException("Произошла внутренняя ошибка библиотеки Docx4J для документа "+ docPath.getFileName()+". Ошибка: "+e);
        }
    }
    public static Set<Path> getDocxInDirectory (Path dir) throws IOException {
        return Files.list(dir)
                .filter(path->
                {
                    return path.getFileName().toString().endsWith(".docx") && !path.getFileName().toString().startsWith("CopyOf");
                })
                .collect(Collectors.toSet());
    }
}
