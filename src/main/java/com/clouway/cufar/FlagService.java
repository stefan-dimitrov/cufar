package com.clouway.cufar;

import com.clouway.cufar.flag.ChangeFlag;
import com.clouway.cufar.function.FlagApplyFunction;

import java.util.Date;
import java.util.List;

/**
 * @author Stefan Dimitrov (stefan.dimitrov@clouway.com).
 */
public interface FlagService {
  void addChange(ChangeFlag changeFlag, Date changedOn);
  void seeChange(ChangeFlag changeFlag, String attender, Date seenOn);

  <T> void applyFlags(String attender, T object, FlagApplyFunction<T> flagApplyFunction, List<? extends ChangeFlag> changeFlags);
}
