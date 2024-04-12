public class DocDataMiner extends Proceso {
//https://refactoring.guru/es/design-patterns/template-method


    @Override
    protected void paso1() {
        System.out.println("Realizando paso 1 para ProcesoConcreto1");
    }

    @Override
    protected void paso2() {
        System.out.println("Realizando paso 2 para ProcesoConcreto1");
    }

    @Override
    protected void paso3() {
        System.out.println("Realizando paso 3 para ProcesoConcreto1");
    }

    @Override
    protected void paso4() {
        System.out.println("Realizando paso 4 para ProcesoConcreto1");
    }
}