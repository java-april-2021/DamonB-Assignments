public class FizzBuzzTest{
    public static void main(String[] args) {
         FizzBuzz f = new FizzBuzz();
            for(int i = 0; i<15; i++){
                String result = f.fizzBuzzPlay(i);
                String output = String.format("Number: %d :: Result: %s", i, result);
                System.out.println(output);
            }
       
    }
}