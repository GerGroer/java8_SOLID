package isp;

public class MultiFunctionPrinter implements Printer, Scanner, Fax {
    @Override
    public void print(String document) {
        System.out.println("MFP is printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("MFP is scanning: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("MFP is faxing: " + document);
    }
}
