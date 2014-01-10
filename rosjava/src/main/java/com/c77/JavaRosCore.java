package com.c77;

import org.ros.RosCore;

import java.net.URI;
import java.util.concurrent.TimeUnit;


public class JavaRosCore {

  private static final String defaultUri = "http://127.0.0.1:11311/";
  private static RosCore rosCore;

  public static void main(String[] args) throws Exception {
    URI uri = new URI(defaultUri);
    rosCore = RosCore.newPublic(uri.getHost(), uri.getPort());

    rosCore.start();

    try {
      rosCore.awaitStart(2, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      e.printStackTrace();
      return;
    }

  }
}

