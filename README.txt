This program is meant to reduce the size of a massive text files containing A's, T's,
C's, and G's. This is merely a representation of what can be done, and not the most
optimal implementation. It's written this way to prove proof of concept.

Note: You do not have to follow these steps if all you desire is a demonstration.
Just run CreatingTrashCharData.java, TransferringCharsToBytes.java, and 
ReadingCharsFromBytes.java in that specific order.

1.  Open the source code of TransferringCharsToBytes.java and replace "fakeData.txt" with
    the path of the text file you want to use. Include quotation marks in the code.

2.  In the same file, you may want to change "fakeNewData.dat" to a different desired
    name. You may replace with a desired path to store, ex:
    "C:\Users\Eric\Documents\JavaProgram\BinaryFile.dat"
    Include quotation marks as well.

3.  Open ReadingCharsFromBytes.java and replace "fakeNewData.dat" with the same path
    (or name) as the one in step 2.

4.  To start, run TransferringCharsToBytes.java (it does as the name implies).
    Now you have a file with optimized data.

5.  To read the new file created, run ReadingCharsFromBytes.java. This prints the
    data in the .dat file to the java console as the decoded chars.
    Note: Purposely made it print to the console because that leaves open options.

To view the source code, open workingWithBits then src. Don't worry about folders
"out" or ".idea", they only hold the classes and intellij settings. Doing this
opens .java files. (If you're new, open with notepad or any other editor)

-Eric Parsons
