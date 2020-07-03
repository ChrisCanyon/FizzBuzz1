package FizzBuzz;

public class FizzBuzzPrinter
{
    public Boolean isFizz(int x){
        return (x % 3) == 0;
    }

    public Boolean isBuzz(int x){
        return (x % 5) == 0;
    }

    public Boolean isFizzBuzz(int x){
        return (x % 15) == 0;
    }

    public String getFizzBuzzResult(int x){
        // fizzbuzz first because in all cases where fizzbuzz is true both fizz and buzz are also true
        if( isFizzBuzz(x) ){
            return("fizzbuzz");
        } else if( isFizz(x) ){
            return("fizz");
        } else if( isBuzz(x) ){
            return("buzz");
        } else {
            return(Integer.toString(x));
        }
    }

    public void FizzBuzz(int start, int stop){
        // Allow for reverse numeric order FizzBuzz
        int increment = 1;
        if(start > stop){
            increment = -1;
        }
        stop = stop + increment;
        for(int i = start; i != stop; i += increment){
            System.out.print(getFizzBuzzResult(i) + " ");
        }
    }
}
