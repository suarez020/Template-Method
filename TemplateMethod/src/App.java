public class App {
    public static void main(String[] args) throws Exception {
        Proceso proceso1 = new DocDataMiner();
        Proceso proceso2 = new CSVDataminer();
        Proceso proceso3 = new PDFDataMiner();

        System.out.println("Ejecutando proceso 1:");
        proceso1.ejecutarProceso();

        System.out.println("\nEjecutando proceso 2:");
        proceso2.ejecutarProceso();
    }
}
