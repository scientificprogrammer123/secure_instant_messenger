/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LJH
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test_bytearray {

  public static void main(String args[]) throws IOException {

    int howMany = 20;

    // To avoid resizing the buffer, calculate the size of the
    // byte array in advance.
    ByteArrayOutputStream bout = new ByteArrayOutputStream(howMany * 4);
    DataOutputStream dout = new DataOutputStream(bout);

    for (int i = 0; i <= 20; i++) {
      dout.writeInt(i);
    }

    FileOutputStream fout = new FileOutputStream("fibonacci.dat");
    try {
      bout.writeTo(fout);
      fout.flush();
    } finally {
      fout.close();
    }
    
  }
}
