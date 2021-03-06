//--------------------------------------------------------------------------------------------------
// $Header$
// Copyright (c) 1996-2002 Borland Software Corporation. All Rights Reserved.
//--------------------------------------------------------------------------------------------------

package com.borland.dx.memorystore;

import java.math.BigDecimal;

import com.borland.dx.dataset.Variant;
import com.borland.jb.util.Diagnostic;

// Do not make public.
//
class BigDecimalColumn extends DataColumn {

  public BigDecimalColumn(NullState nullState) {
    super(nullState);
    vector          = new BigDecimal[InitialSize];
    vectorLength    = vector.length;
  }

  final void copy(int source, int dest) {
    vector[dest]  = vector[source];
    Diagnostic.check(vector[dest] != null);
    if (hasNulls)
      nullState.copy(source, dest, nullMask);
  }

   final void  grow(int newLength) {
    Diagnostic.check(newLength > vector.length);
    BigDecimal newVector[] = new BigDecimal[newLength];
    System.arraycopy(vector, 0, newVector, 0, vectorLength);
    vector        = newVector;
    vectorLength  = vector.length;
  }


  final int compare(int index1, int index2) {
    if (hasNulls) {
      if ((comp = nullState.compare(index1, index2, nullMask)) != 0)
        return comp;
    }
//! JDK beta 3.2
//!    if (vector[index1].lessThan(vector[index2]))
//!      return -1;
//!    if (vector[index1].greaterThan(vector[index2]))
//!      return 1;
//!    return 0;
    return vector[index1].compareTo(vector[index2]);
  }

  final int compareIgnoreCase(int index1, int index2) {
    return compare(index1, index2);
  }

  final void getVariant(int row, Variant value) {
    if (hasNulls && vector[row] == nullBigDecimal)
      nullState.getNull(row, value, nullMask, assignedMask);
    else
      value.setBigDecimal(vector[row]);
  }


  final void setVariant (int index, Variant val) {
    if (val.isNull()) {
      vector[index] = nullBigDecimal;
      setNull(index, val.getType());
    }
    else {
      if (hasNulls)
        nullState.vector[index] &= ~nullMask;
      vector[index]  = val.getBigDecimal();
      Diagnostic.check(vector[index] != null);
    }
  }

  private BigDecimal[]         vector;
}
