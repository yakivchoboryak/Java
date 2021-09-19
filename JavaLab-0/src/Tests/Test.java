package Tests;
import static org.testng.Assert.assertEquals;

import ILaboratory.ILaboratory;
import org.testng.annotations.DataProvider;

import Lab0.Variant24;

    @SuppressWarnings("ALL")
    public class Test {

        static ILaboratory variant24 = new Variant24();

        @org.testng.annotations.Test(dataProvider = "intProvider")
        public void intTest(int k, int res) {
            assertEquals(variant24.intFunc(k), res);
        }

        @DataProvider
        public Object[][] intProvider() {
            return new Object[][]{{8, 1}, {15, 1}, {123, 4}};
        }

        //-----------------------------------------------------------------------------

        @org.testng.annotations.Test(dataProvider = "boolProvider")
        public void boolTest(int a, int b, int c, boolean res) {
            assertEquals(variant24.boolFunc(a, b, c), res);
        }

        @DataProvider
        public Object[][] boolProvider() {
            return new Object[][]{{3, 4, 5, false}, {3, 13, 5, true}};
        }

        //-----------------------------------------------------------------------------

        @org.testng.annotations.Test(dataProvider = "ifProvider")
        public void ifTest(double x, double res) {
            assertEquals(variant24.ifFunc(x), res);
        }

        @DataProvider
        public Object[][] ifProvider() {
            return new Object[][]{{3,0.2822400161197344}, {-9,15}};
        }

        //-----------------------------------------------------------------------------

        @org.testng.annotations.Test(dataProvider = "switchProvider")
        public void switchTest(int num, int res) {
            assertEquals(variant24.switchFunc(num), res);
        }

        @DataProvider
        public Object[][] switchProvider() {
            return new Object[][]{{1,31}, {2, 28},{6, 30}};
        }

        //-----------------------------------------------------------------------------

        @org.testng.annotations.Test(dataProvider = "forProvider")
        public void forTest(double x, int n, double res) {
            assertEquals(variant24.forFunc(x, n), res);
        }

        @DataProvider
        public Object[][] forProvider() {
            return new Object[][]{{1.4,5, 1.528077104806975}, {2,3, 6.666666666666666}};
        }

        //-----------------------------------------------------------------------------

        @org.testng.annotations.Test(dataProvider = "whileProvider")
        public void whileTest(int n, boolean res) {
            assertEquals(variant24.whileFunc(n), res);
        }

        @DataProvider
        public Object[][] whileProvider() {
            return new Object[][]{{1, true}, {2, true}, {8, true},{12, false},{13, true}};
        }

        //-----------------------------------------------------------------------------

        @org.testng.annotations.Test(dataProvider = "minmaxProvider")
        public void minmaxTest(int[] arr, int res) {
            assertEquals(variant24.minmaxFunc(arr), res);
        }

        @DataProvider
        public Object[][] minmaxProvider() {
            return new Object[][]{{new int[]{1,2,4,6,8,67,23,45,36,76,23}, 112}, {new int[]{12,13,11,10,14,9,15}, 25}};
        }

        //-----------------------------------------------------------------------------

        @org.testng.annotations.Test(dataProvider = "arrayProvider")
        public void arrayTest(int[] arr, int res) {
            assertEquals(variant24.arrayFunc(arr), res);
        }

        @DataProvider
        public Object[][] arrayProvider() {
            return new Object[][]{{new int[]{2, 3, 4, 5, 6, 7, 8}, 1}, {new int[]{2,8,14,20,26,32,38}, 6}, {new int[]{3, 10, 7, 5, 6, 9, 8}, 0}};
        }

        //-----------------------------------------------------------------------------

        @org.testng.annotations.Test(dataProvider = "matrixProvider")
        public void matrixTest(double[][] arr, double[] res) {
            assertEquals(variant24.matrixFunc(arr), res);
        }

        @DataProvider
        public Object[][] matrixProvider() {
            return new Object[][]{{new double[][]{
                    {16.99, 72.83, 77.61},
                    {34.93, 65.85, 24.74},
                    {49.46, 34.6, 9.98},
                    {98.73, 49.19, 96.89}}, new double[]{98.73, 72.83, 96.89}}};
        }

        //-----------------------------------------------------------------------------
    }

