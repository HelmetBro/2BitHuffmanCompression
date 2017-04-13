/**Author: Eric Parsons*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingBytesFromBytes {
    public static void main(String[] args) throws IOException {

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("fakeNewData.dat"))){

            while (true){

                int i = inputStream.read();

                if (i == -1){
                    System.out.println("End of file reached.");
                    break;
                }//if

                System.out.println(i);

            }//while
        }//try
    }//main
}//class
