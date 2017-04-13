/**Author: Eric Parsons*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class CreatingTrashCharData {
    public static void main(String[] args){

        int numOfTrashChars = 8000; //FOR NOW, must be dividable by 4 equally

        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(new FileOutputStream("fakeData.txt"));
        }
        catch(FileNotFoundException e) {
            System.out.println("Error with fakeData.txt file");
            System.exit(0);
        }

        Random g = new Random();

        for(int i = 1; i <= numOfTrashChars; i++){
            switch (g.nextInt(4)){
                case 0:
                    outputStream.print('A');
                    break;
                case 1:
                    outputStream.print('T');
                    break;
                case 2:
                    outputStream.print('C');
                    break;
                case 3:
                    outputStream.print('G');
                    break;
            }
        }//for
        outputStream.close();
    }//main
}//class
