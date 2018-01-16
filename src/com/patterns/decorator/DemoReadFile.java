package com.patterns.decorator;

import com.patterns.decorator.io.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DemoReadFile {
  public static void main(String[] args) {
    int c;

    try {
      InputStream in =
              new LowerCaseInputStream(
                      new BufferedInputStream(
                              new FileInputStream("test.txt")));

      while ((c = in.read()) >= 0) {
        System.out.print((char) c);
      }

      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
