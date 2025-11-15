public class removeA {
    public static void main(String[] args) {
        String s = "baccadappleapp";
        String empty = new String();
        skipApple(empty, s);
    }

    // static void skipA(String result, String s){
    //     if(s.isEmpty()){
    //         System.out.println(result);
    //         return;
    //     }

    //     if(s.charAt(0) != 'a'){
    //         skipA(result + s.charAt(0), s.substring(1, s.length()));
    //     }else{
    //         skipA(result, s.substring(1, s.length()));
    //     }
        
    // }

        // static void skipA(String result, String s){
        // if(s.isEmpty()){
        //     System.out.println(result);
        //     return;
        // }

        // if(s.charAt(0) != 'a'){
        //     skipA(result + s.charAt(0), s.substring(1, s.length()));
        // }else{
        //     skipA(result, s.substring(1, s.length()));
        // }   
        
    // static void skipApple(String result, String up){
    //     if(up.isEmpty()){
    //         System.out.println(result);
    //         return;
    //     }

    //     if(up.startsWith("apple")){
    //         skipApple(result, up.substring(5));
    //     }else{
    //         skipApple(result + up.charAt(0), up.substring(1));
    //     }
    // }
    static void skipApple(String result, String up){
        if(up.isEmpty()){
            System.out.println(result);
            return;
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            skipApple(result, up.substring(3));
        }else{
            skipApple(result + up.charAt(0), up.substring(1));
        }
    }
}
