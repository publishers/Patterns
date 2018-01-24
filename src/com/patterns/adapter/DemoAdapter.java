package com.patterns.adapter;

import com.patterns.adapter.list.IteratorEnumerator;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

public class DemoAdapter {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

    Enumeration<Integer> adapter = new IteratorEnumerator<>(list.iterator());
    while(adapter.hasMoreElements()){
      System.out.println(adapter.nextElement());
    }
  }
}
