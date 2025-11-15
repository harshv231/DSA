public class PowerOf2 {
    public static void main(String[] args) {
        int num = 17;

        if((num & (num-1)) == 0){
            System.out.println("yes it is ");
        }else{
            System.out.println("It is not");
        }
    }
}
