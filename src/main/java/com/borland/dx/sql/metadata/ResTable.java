/* DO NOT EDIT THIS FILE
 *
 * Copyright (c) 2005 Borland Software Corporation. All Rights Reserved.
 *
 */

package com.borland.dx.sql.metadata;
import com.borland.jb.util.StringArrayResourceBundle;

public class ResTable extends StringArrayResourceBundle {
  public ResTable() {
    strings = new String[] {
      "Bad Fieldlist type: must be int[] or Object[] or Enumeration.",
      "Column type: {0}, is not supported by database: {1}.",
      "Table creation not implemented for current database dialect.",
    };
  }
}