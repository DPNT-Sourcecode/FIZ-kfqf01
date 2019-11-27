package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

@SuppressWarnings("unused")
public class SumSolution {

    public int compute(int x, int y) {
        return x+y;
    }

    public static void main(String[] args){
        SumSolution sol = new SumSolution();
        int result = sol.compute(5,6);
        System.out.println("The result is:" + result);
    }

}
