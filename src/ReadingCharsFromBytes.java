/**Author: Eric Parsons*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingCharsFromBytes {
    public static void main(String[] args) throws IOException {

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("fakeNewData.dat"))){

            String code;
            String parsedCode;

            while (true){

                int i = inputStream.read();

                if (i == -1){
                    System.out.println("\nEnd of file reached.");
                    break;
                }//if

                code = Integer.toBinaryString(i);

                int codeLength = code.length();

                if(codeLength < 8)
                    for(int n = 0; n < 8 - codeLength; n++)
                        code = "0" + code;


                for(int k = 0; k <= 3; k++){

                    parsedCode = code.substring((k * 2), (k * 2) + 2);

                    switch (parsedCode){
                        case "00":
                            System.out.print("A");
                            break;
                        case "11":
                            System.out.print("T");
                            break;
                        case "01":
                            System.out.print("C");
                            break;
                        case "10":
                            System.out.print("G");
                            break;
                        default:
                            System.out.println("Foreign case input. Program closing.");
                            System.exit(0);
                    }//switch/case
                }//for
            }//while
        }//try
    }//main
}//class
