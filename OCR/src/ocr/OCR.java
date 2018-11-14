/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocr;

import java.io.File;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

/**
 *
 * @author sinah
 */
public class OCR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File ImageFile = new File("C:\\Users\\sinah\\OneDrive\\Pictures\\licience.png");
       ITesseract tess = new Tesseract();
       tess.setDatapath("C:\\Users\\sinah\\OneDrive\\Documents\\NetBeansProjects\\OCR\\tessdata");
       
       try{
           String result = tess.doOCR(ImageFile);
           System.out.println(result);
       }catch(Exception e){
           System.out.print(e);
       }
    }
    
}
