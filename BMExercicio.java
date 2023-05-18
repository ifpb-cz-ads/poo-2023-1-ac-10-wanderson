public class BMExercicio {

    private static final double METROS_POR_PE_QUADRADO = 10.76;
    private static final double CENTIMETROS_POR_PE_QUADRADO = 929.0;
    private static final double ACRES_POR_MILHA_QUADRADA = 640.0;
    private static final double PES_QUADRADOS_POR_ACRE = 43560.0;

    public static double metrosParaPesQuadrados(double metros) {
        return metros * METROS_POR_PE_QUADRADO;
    }

    public static double pesQuadradosParaCentimetros(double pesQuadrados) {
        return pesQuadrados * CENTIMETROS_POR_PE_QUADRADO;
    }

    public static double milhasQuadradasParaAcres(double milhasQuadradas) {
        return milhasQuadradas * ACRES_POR_MILHA_QUADRADA;
    }

    public static double acresParaPesQuadrados(double acres) {
        return acres * PES_QUADRADOS_POR_ACRE;
    }
}