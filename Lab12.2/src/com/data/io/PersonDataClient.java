/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.data.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PersonDataClient {

    /**
     * To run one method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
        // writeData();
         readData();
    }

    /**
     * TASK: write the following data (as Strings and Java primitives) to file 'person.dat':
     * your-name (String)  your-age (int)  your-shoe-size (double)  marital-status (boolean)
     * 
     * Here's a sample:
     * Java Programmer     54              9.5                      true
     * 
     * Use a DataOutputStream wrapped around a FileOutputStream.
     * Use a try-with-resources to initialize the stream and auto-close it.
     */
    private static void writeData() {
        // TODO
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("person.dat")))   {
            out.writeUTF("Patrick Lauer");
            out.writeInt(34);
            out.writeDouble(9.5);
            out.writeBoolean(false);
        }   catch (IOException e)   {
            e.printStackTrace();
        }
    }

    /**
     * TASK: read the data written to 'person.dat' back in to the appropriate Java datatypes.
     * 
     * You need to read it in the same sequence as it was written.
     * Then print to stdout to see it.
     * 
     * Use a DataInputStream wrapped around a FileInputStream.
     * Use a try-with-resources to initialize the stream and auto-close it.
     */
    private static void readData() {
        // TODO
        try (DataInputStream in = new DataInputStream(new FileInputStream("person.dat")))   {
            String name = in.readUTF();
            int age = in.readInt();
            double shoeSize = in.readDouble();
            boolean martialStatus = in.readBoolean();
            System.out.println("My name is " + name + ". I am " + age + " years old. "
                + "My shoe size is " + shoeSize + " and it is " + martialStatus + " that I am married!");
        }   catch (IOException e)   {
            e.printStackTrace();
        }
    }
}