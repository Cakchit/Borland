/* DO NOT EDIT THIS FILE
 *
 * Copyright (c) 2005 Borland Software Corporation. All Rights Reserved.
 *
 */

package com.borland.dx.sql.metadata;
import java.util.ResourceBundle;

import com.borland.jb.util.StringArrayResourceBundle;

public class Res {
  public static final StringArrayResourceBundle bundle =
              (StringArrayResourceBundle)ResourceBundle.getBundle("com.borland.dx.sql.metadata.ResTable");

  static String getString(int index) {
    return bundle.getString(index);
  }
}
