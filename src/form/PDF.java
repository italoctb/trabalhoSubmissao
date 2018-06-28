/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author tallys
 */
public class PDF {

    static String campos;
    static Phrase frase;

    public void setField(String field) {
        if (campos == null) {
            Font font2 = new Font(FontFamily.UNDEFINED, 12, Font.NORMAL);

            campos = field;
            frase = new Phrase();
            frase.setFont(font2);
            frase.add("\n\n"+campos);

        } else {
            campos = "\n" + field;
            frase.add(campos);
        }
    }
    public void createDoc() throws DocumentException, FileNotFoundException{
        Document document = new Document(PageSize.A4);
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("form.pdf"));
        document.open();
        PdfContentByte cb = writer.getDirectContent();
        Font font1 = new Font(Font.FontFamily.UNDEFINED, 32, Font.BOLD);
        Phrase header = new Phrase("Formulário Geral", font1);
        ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                header,
                (document.right() - document.left()) / 2 + document.leftMargin(),
                document.top() + 10, 0);
        
        document.add(frase);
        document.close();
    }
    
}
