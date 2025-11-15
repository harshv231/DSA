class Prime{
    public static void main(String[] args) {
        int c = 20;
        for(int i = 2; i<c; i++){
            System.out.println(i+" "+ isPrime(i));
        }
    }

    static boolean isPrime(int num){
        if(num<2){
            return false;
        }
 
        for(int i = 2; i< num; i++){
                if(num % i ==0){
                    return false;
                }
            
        }
        return true;

        
    }
}