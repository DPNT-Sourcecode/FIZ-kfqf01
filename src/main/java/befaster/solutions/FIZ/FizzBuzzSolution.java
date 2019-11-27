package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        int cond3 = 0;
        int cond5 = 0;
        int copy = number;

        while (copy != 0) {
            if (copy % 10 == 3)
                cond3 = 1;
            if (copy % 10 == 5)
                cond5 = 1;
            copy = copy / 10;
        }


        if ((number % 3 == 0 || cond3 == 1) && (number % 5 == 0 || cond5 == 1))
            return "fizz buzz";
        else if (number % 5 == 0 || cond5 == 1)
            return "buzz";
        else if (number % 3 == 0 || cond3 == 1)
            return "fizz";
        else
            return String.valueOf(number);
    }

    public static void main(String[] args){
        FizzBuzzSolution sol = new FizzBuzzSolution();
        String result = sol.fizzBuzz(30);
        System.out.println("The result is:" + result);
    }

}



