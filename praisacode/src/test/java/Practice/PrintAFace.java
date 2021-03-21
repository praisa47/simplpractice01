package Practice;

public class PrintAFace {
    //Write a Java program to print a face. Go to the editor
    //Expected Output
    //
    // +"""""+
    //[| o o |]
    // |  ^  |
    // | '-' |
    // +-----+

    public static void main(String[] args) {
        System.out.println();
        String[] arr= new String [5];

        arr[0]= "+\"\"\"\"\"+" ;
        arr[1]= "[| o o |]";
        arr[2]= "|  ^  |";
        arr[3]= "| '-' |";
        arr[4]= "+-----+:";

        for (int i =0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
