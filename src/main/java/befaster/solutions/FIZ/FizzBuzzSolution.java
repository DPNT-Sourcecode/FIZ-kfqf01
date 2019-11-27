package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        int cond3 = 0;
        int cond5 = 0;
        //int condid = 1;
        int copy = number;
        int deluxe = 0;
        String fake = "";

        while (copy != 0) {
            if (copy % 10 == 3)
                cond3 = 1;
            if (copy % 10 == 5)
                cond5 = 1;
            copy = copy / 10;
        }

        copy = number;


        if(number%2 != 0)
            fake = "fake ";

        if((number % 3 == 0 && cond3 == 1) && (number % 5 == 0 && cond5 == 1))
            return "fizz buzz " + fake + "deluxe";
        if((number % 3 == 0 && cond3 == 1))
            return "fizz " + fake + "deluxe";
        else if((number % 5 == 0 && cond5 == 1))
            return "buzz " + fake + "deluxe";
        else if ((number % 3 == 0 || cond3 == 1) && (number % 5 == 0 || cond5 == 1))
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
        String result = sol.fizzBuzz(5);
        System.out.println("The result is:" + result);
    }

}
