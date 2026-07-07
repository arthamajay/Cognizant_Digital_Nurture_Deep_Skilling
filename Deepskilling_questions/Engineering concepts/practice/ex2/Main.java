public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory=new WordDocumentFactory();
        wordFactory.processDocument();

        DocumentFactory pdfFactory=new PdfDocumentFactory();
        pdfFactory.processDocument();

        DocumentFactory excelFactory=new ExcelDocumentFactory();
        excelFactory.processDocument();
    }
}
