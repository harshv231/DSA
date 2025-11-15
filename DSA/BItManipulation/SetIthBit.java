public class SetIthBit {
    public static void main(String[] args) {
        int num = 0b10110110;
        int n = 4;
        int result = (num & (1<<n-1));
        
        if(result != 0){
            System.out.println("the number is set to 1");
        }else{
            num = num | result;
            System.out.println("The bit is 0 now it is set to 1");
        }
    }
}
