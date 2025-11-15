
public class numbers {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        //to stop the recursion we have to make base condition which make recursion to stop calling the function recursively
        
        if(n==5){
            System.out.println(5);
            return;
        }
        
        System.out.println(n);

        // this is the tail recursion 
        // this is the last function call
        print(n+1);
    }
}
