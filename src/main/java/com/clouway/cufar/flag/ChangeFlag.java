package com.clouway.cufar.flag;


/**
 * @author Stefan Dimitrov (stefan.dimitrov@clouway.com).
 */
public interface ChangeFlag<T> {
  String getId();
  T getReferenceId();
}
