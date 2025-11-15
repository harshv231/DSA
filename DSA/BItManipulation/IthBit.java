// public class IthBit {
//     public static void main(String[] args) {
//         int n = 3;
//         int b = 0100;
//         int mask = 1 << (n-1);;

//         if((b & mask) != 0){
//             System.out.println(1);
//         }else{
//             System.out.println(0);
//         }
//     }
// }
public class IthBit{
    public static void main(String[] args) {
        int n = 2;
        int num = 10110110;

        if((((1 << n-1)) &  num) != 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}