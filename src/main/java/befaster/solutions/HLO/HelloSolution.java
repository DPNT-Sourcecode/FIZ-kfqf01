package befaster.solutions.HLO;

public class HelloSolution {
    public String hello(String friendName) {
        return "Hello, " + friendName + "!";
    }

    public static void main(String[] args){
        HelloSolution sol = new HelloSolution();
        String message = sol.hello("David");
        System.out.println("The result is:" + message);
    }
}
