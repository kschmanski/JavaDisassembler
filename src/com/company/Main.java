package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello!");


	// write your code here

        try {
            //String x = Main.binaryFileToHexString("/Users/kris/Desktop/Personal/DePaul/SE526/disassembler/invaders.h");
            String x = Main.binaryFileToHexString("/Users/kris/Desktop/Personal/DePaul/SE526/disassembler/main");
            System.out.println(" X is: " + x + "\n");

        } catch (Exception e) {

            System.out.println("something bad happened: " + e);

        }



    }
    public static String binaryFileToHexString(final String path)
            throws FileNotFoundException, IOException
    {
        final int bufferSize = 512;
        final byte[] buffer = new byte[bufferSize];
        final StringBuilder sb = new StringBuilder();

        // open the file
        FileInputStream stream = new FileInputStream(path);
        int bytesRead;

        // read a block
        while ((bytesRead = stream.read(buffer)) > 0)
        {
            // append the block as hex
            for (int i = 0; i < bytesRead; i++)
            {
                sb.append(String.format("%02X", buffer[i]));
            }
        }
        stream.close();

        return sb.toString();
    }
}

