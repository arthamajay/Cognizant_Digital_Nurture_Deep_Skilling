interface Document {
    void open();
    void close();
}

class WordDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening Word Document");
    }

    @Override
    public void close(){
        System.out.println("Closing Word Document");
    }
}

class PdfDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening PdfDocument");
    }

    @Override
    public void close(){
        System.out.println("Closing PdfDocument");
    }
}

class ExcelDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening ExcelDocument");
    }

    @Override
    public void close(){
        System.out.println("Closing ExcelDocument");
    }
}