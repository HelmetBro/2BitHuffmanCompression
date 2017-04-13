/**Author: Eric Parsons*/

import java.io.*;

public class TransferringCharsToBytes {
    public static void main(String[] args) throws IOException {

        String code = ""; //String to store temporary file
        int r; //int to get next set of bytes

        /**
         * inputStream - getting data from fakeData.txt file
         * outputStream - creating new file that stores the bytes in fakeNewData.dat
         * */

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("fakeData.txt"));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("fakeNewData.dat"))
            ){

            while (true) {

                //repeats 4 times to grab 4 chars, create the "code"
                for (int i = 0; i <= 3; i++) {

                    r = inputStream.read(); //will return -1 if no char left in file

                    if (r == -1)
                        throw new EOFException("End of file reached.");

                    /** Key:
                     * A = 00
                     * T = 11
                     * C = 01
                     * G = 10
                     */

                    //fastest way to find correct code for
                    switch ((char) r){
                        case 'A':
                            code += "00";
                            break;
                        case 'T':
                            code += "11";
                            break;
                        case 'C':
                            code += "01";
                            break;
                        case 'G':
                            code += "10";
                            break;
                        default:
                            System.out.println("Foreign case input. Program closing.");
                            System.exit(0);
                    }

                }//for

                byte b = (byte)Integer.parseInt(code, 2); //String "code" to byte
                outputStream.write(b);
                //note: write() writes a byte by writing an int without other 24 bits (nothing important)

                code = ""; //resets code for next binary sequence

            }//while

        }catch (EOFException e) {
            System.out.println(e.getMessage());
            System.out.println("All char data has been converted to binary.");
        }
    }//main
}//class