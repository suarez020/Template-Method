public class App {
    public static void main(String[] args) throws Exception {
        Proceso proceso1 = new DocDataMiner();
        Proceso proceso2 = new CSVDataminer();
        Proceso proceso3 = new PDFDataMiner();

        System.out.println("Ejecutando DocDataMiner:");
        proceso1.ejecutarProceso();

        System.out.println("\nEjecutando CSVDataminer:");
        proceso2.ejecutarProceso();
        
        System.out.println("\nEjecutando PDFDataMiner:");
        proceso3.ejecutarProceso();
    }
}
