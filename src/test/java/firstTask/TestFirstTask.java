package firstTask;


import org.junit.runner.JUnitCore;



public class TestFirstTask
{
    public static void main (String [] args)
    {
        JUnitCore.runClasses(TestLoader.class);
        JUnitCore.runClasses(TestSolution.class);
        JUnitCore.runClasses(TestBag.class);
        JUnitCore.runClasses(TestProduct.class);
    }
}
