package ru.alexander.springmvc.pdf;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import ru.alexander.springmvc.model.User;

public class PDFBuilder extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document doc, PdfWriter writer, HttpServletRequest request, HttpServletResponse response) throws Exception {

        User user = (User) model.get("user");

        doc.add(new Paragraph(user.getName()));
        doc.add(new Paragraph(user.getPassword()));

    }

}
