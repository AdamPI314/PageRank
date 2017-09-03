public class Driver {
    public static void main(String[] args) throws Exception {
        UnitMultiplication multiplication = new UnitMultiplication();
        UnitSum sum = new UnitSum();

        // args0: dir of transition.txt
        // args1: dir of PageRank.txt
        // args2: dir of unitMultiplication result
        // args3: times of convergence

        String transitionMatrixDir = args[0];
        String prMatrixDir = args[1];
        String unitResultDir = args[2];

        int count = Integer.parseInt(args[3]);

        for (int i = 0; i < count; ++i) {
            String[] args1 = {transitionMatrixDir, prMatrixDir + i, unitResultDir + i};
            multiplication.main(args1);

            String[] args2 = {unitResultDir + i, prMatrixDir + (i + 1)};
            sum.main(args2);
        }

    }
}
