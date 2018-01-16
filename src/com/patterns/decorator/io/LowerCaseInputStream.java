package com.patterns.decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

  public LowerCaseInputStream(InputStream in) {
    super(in);
  }

  @Override
  public int read() throws IOException {
    int fileSymbol = super.read();
    return fileSymbol == -1 ? fileSymbol : Character.toLowerCase((char) fileSymbol);
  }
}
