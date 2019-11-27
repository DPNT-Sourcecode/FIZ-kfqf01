package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        int cond3 = 0;
        int cond5 = 0;
        int ok1 = 0, ok2 = 0, ok3 = 0;
        int copy = number;

        while(copy != 0){
            if(copy%10 == 3)
                cond3 = 1;
            if(copy%10 == 5)
                cond5 = 1;
            copy = copy/10;
        }
        System.out.println(cond3 + " " + cond5);

        if(number%3 == 0 || cond3 == 1)
            ok1 = 1;
        if(number%5 == 0 || cond5 == 1)
            ok2 = 1;
        if(ok1 + ok2 == 2)
            ok3 = 1;

        System.out.println(ok1 +" "+ ok2);

        if(ok1 == 1)
            return "fizz";
        else if(ok2 == 1)
            return "buzz";
        else
            return String.valueOf(number);

        if((ok1 == 1) && (ok2 == 1))
            return "fizz buzz";
    }

    public static void main(String[] args){
        FizzBuzzSolution sol = new FizzBuzzSolution();
        String result = sol.fizzBuzz(30);
        System.out.println("The result is:" + result);
    }

}


