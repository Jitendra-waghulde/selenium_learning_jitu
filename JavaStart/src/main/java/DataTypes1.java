public class DataTypes1 {
    public static void main(String[] args) {
        byte b1 = 10;
        System.out.println(b1);

        short s1 = 180;
        System.out.println(s1);

//        Casting concept
        byte n1 = (byte) s1;
        System.out.println(n1);

        int a = 20;
        System.out.println("decimal=" +a);
//        This line declares an integer variable a and assigns the decimal value 20 to it.
//        The println statement prints the decimal value of a to the console.

        int x = 0b101011;
        System.out.println("binary to decimal=" +x);
//        The prefix 0b indicates that the following number is in binary format.
//                The binary number 101011 is directly assigned to the integer variable x.
//        The compiler automatically converts the binary number to its decimal equivalent, which is 43.

        int y = 040;
        System.out.println("octal to decimal=" +y);
//        The prefix 0 indicates that the following number is in octal format.
//                The octal number 40 is directly assigned to the integer variable y.
//        The compiler automatically converts the octal number to its decimal equivalent, which is 32.

        int z = 0xAF40;
        System.out.println("hexa to decimal=" +z);
//        The prefix 0x indicates that the following number is in hexadecimal format.
//                The hexadecimal number AF40 is directly assigned to the integer variable z.
//                The compiler automatically converts the hexadecimal number to its decimal equivalent, which is 71616.

    }
}
