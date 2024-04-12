public class App {
    public static void main(String[] args) throws Exception {
        Proceso DOC = new DocDataMiner();
        Proceso CSV = new CSVDataminer();
        Proceso PDF = new PDFDataMiner();

        System.out.println("Ejecutando DocDataMiner:");
        DOC.ejecutarProceso();

        System.out.println("\nEjecutando CSVDataminer:");
        CSV.ejecutarProceso();
        
        System.out.println("\nEjecutando PDFDataMiner:");
        PDF.ejecutarProceso();
    }
}
