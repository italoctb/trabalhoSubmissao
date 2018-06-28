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
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfSmartCopy;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tallys
 */
public class PDF {

    static String campos;
    static Phrase frase;

    public void setField(String field) {
        if (campos == null) {
            Font font2 = new Font(FontFamily.UNDEFINED, 16, Font.NORMAL);

            campos = field;
            frase = new Phrase();
            frase.setFont(font2);
            frase.add("\n\n"+campos);

        } else {
            campos = "\n" + field;
            frase.add(campos);
        }
    }
    public void createDoc(String id) throws DocumentException, FileNotFoundException{
        Document document = new Document(PageSize.A4);
        
        
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("form"+id+".pdf"));
        
        document.open();
        PdfContentByte cb = writer.getDirectContent();
        Font font1 = new Font(Font.FontFamily.UNDEFINED, 32, Font.BOLD);
        Phrase header = new Phrase("Formulário Geral", font1);
        ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                header,
                (document.right() - document.left()) / 2 + document.leftMargin(),
                document.top() + 10, 0);
        ColumnText ct = new ColumnText(writer.getDirectContent());
        Rectangle[] columns = {
            new Rectangle(36, 36, 254, 770),
            new Rectangle(305, 36, 254, 770)};
            
        
        
        document.add(frase);
        
        document.close();
    }
    public void merge(){
        List<InputStream> list = new ArrayList<InputStream>();
        try{
            list.add(new FileInputStream(new File("form1.pdf")));
            list.add(new FileInputStream(new File("form2.pdf")));
            //list.add(new FileInputStream(new File("form3.pdf")));
            //list.add(new FileInputStream(new File("form4.pdf")));
            list.add(new FileInputStream(new File("form5.pdf")));
            
            OutputStream out = new FileOutputStream(new File("result.pdf"));
            
            doMerge(list,out);
            Desktop.getDesktop().open(new File("result.pdf"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void doMerge(List<InputStream> list, OutputStream outputStream)
            throws DocumentException, IOException {
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, outputStream);
        document.open();
        PdfContentByte cb = writer.getDirectContent();
        
        for (InputStream in : list) {
            PdfReader reader = new PdfReader(in);
            for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                document.newPage();
                //import the page from source pdf
                PdfImportedPage page = writer.getImportedPage(reader, i);
                //add the page to the destination pdf
                cb.addTemplate(page, 0, 0);
            }
        }
        outputStream.flush();
        document.close();
        outputStream.close();
    }
    
}
