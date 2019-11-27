package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        if(number%3 == 0 && number%15 != 0)
            return "fizz";
        else if(number%5 == 0 && number%15 != 0)
            return "buzz";
        else if(number%15 == 0)
            return "fizz buzz";
        else
            return String.valueOf(number);
    }

    public static void main(String[] args){
        FizzBuzzSolution sol = new FizzBuzzSolution();
        String result = sol.fizzBuzz(29);
        System.out.println("The result is:" + result);
    }

}

