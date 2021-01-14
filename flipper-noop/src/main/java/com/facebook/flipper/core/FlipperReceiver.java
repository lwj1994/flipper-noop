package com.facebook.flipper.core;

public interface FlipperReceiver {

  /**
   * Reciver for a request sent from the Flipper desktop client.
   *
   * @param params Optional set of parameters sent with the request.
   * @param responder Optional responder for request. Some requests don't warrant a response
   *     through. In this case the request should be made from the desktop using send() instead of
   *     call().
   */
  void onReceive(FlipperObject params, FlipperResponder responder) throws Exception;
}
