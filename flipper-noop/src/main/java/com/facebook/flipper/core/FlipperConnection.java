package com.facebook.flipper.core;

public interface FlipperConnection {

  /**
   * Call a remote method on the Flipper desktop application, passing an optional JSON object as a
   * parameter.
   */
  void send(String method, FlipperObject params);

  /**
   * Call a remote method on the Flipper desktop application, passing an optional JSON array as a
   * parameter.
   */
  void send(String method, FlipperArray params);

  /** Report client error with reason and stacktrace as an argument */
  void reportErrorWithMetadata(String reason, String stackTrace);

  /** Report client error */
  void reportError(Throwable throwable);

  /**
   * Register a receiver for a remote method call issued by the Flipper desktop application. The
   * FlipperReceiver is passed a responder to respond back to the desktop application.
   */
  void receive(String method, FlipperReceiver receiver);
}
