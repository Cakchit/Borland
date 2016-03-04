/**
 * Copyright (c) 1996-2004 Borland Software Corp. All Rights Reserved.
 *
 * This SOURCE CODE FILE, which has been provided by Borland as part
 * of a Borland product for use ONLY by licensed users of the product,
 * includes CONFIDENTIAL and PROPRIETARY information of Borland.
 *
 * USE OF THIS SOFTWARE IS GOVERNED BY THE TERMS AND CONDITIONS
 * OF THE LICENSE STATEMENT AND LIMITED WARRANTY FURNISHED WITH
 * THE PRODUCT.
 *
 * IN PARTICULAR, YOU WILL INDEMNIFY AND HOLD BORLAND, ITS RELATED
 * COMPANIES AND ITS SUPPLIERS, HARMLESS FROM AND AGAINST ANY
 * CLAIMS OR LIABILITIES ARISING OUT OF THE USE, REPRODUCTION, OR
 * DISTRIBUTION OF YOUR PROGRAMS, INCLUDING ANY CLAIMS OR LIABILITIES
 * ARISING OUT OF OR RESULTING FROM THE USE, MODIFICATION, OR
 * DISTRIBUTION OF PROGRAMS OR FILES CREATED FROM, BASED ON, AND/OR
 * DERIVED FROM THIS SOURCE CODE FILE.
 */
//--------------------------------------------------------------------------------------------------
// Copyright (c) 1996 - 2004 Borland Software Corporation. All Rights Reserved.
//--------------------------------------------------------------------------------------------------
package com.borland.jbcl.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.EventListener;

import com.borland.jb.util.Diagnostic;

public class MatrixSelectionEvent extends SelectionEvent implements Serializable
{
  private static final long serialVersionUID = 200L;

  public MatrixSelectionEvent(MatrixSelection selection, int change) {
    super(selection, change);
    this.selection = selection;
  }

  public MatrixSelectionEvent(MatrixSelection selection, int change, MatrixLocation location) {
    this(selection, change);
    this.rangeStart = this.rangeEnd = this.location = location;
  }

  public MatrixSelectionEvent(MatrixSelection selection, int change, MatrixLocation rangeStart, MatrixLocation rangeEnd) {
    this(selection, change);
    this.location = this.rangeStart = rangeStart;
    this.rangeEnd = rangeEnd;
  }

  public MatrixSelection getSelection()  { return selection; }
  public MatrixLocation  getLocation()   { return location; }
  public MatrixLocation  getRangeStart() { return rangeStart; }
  public MatrixLocation  getRangeEnd()   { return rangeEnd; }

  public void dispatch(EventListener listener) {
    switch (getID()) {
      case ITEM_CHANGE:      ((MatrixSelectionListener)listener).selectionItemChanged(this);  break;
      case RANGE_CHANGE:     ((MatrixSelectionListener)listener).selectionRangeChanged(this); break;
      case SELECTION_CHANGE: ((MatrixSelectionListener)listener).selectionChanged(this);      break;
      default:
        Diagnostic.fail();
        break;
    }
  }

  protected String paramString() {
    return super.paramString() +
           ",selection=" + selection +   
           ",location=" + location +   
           ",rangeStart=" + rangeStart +   
           ",rangeEnd=" + rangeEnd;  
  }

  // Serialization support

  private void writeObject(ObjectOutputStream s) throws IOException {
    s.defaultWriteObject();
    s.writeObject(selection instanceof Serializable ? selection : null);
  }

  private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
    s.defaultReadObject();
    Object data = s.readObject();
    if (data instanceof MatrixSelection)
      selection = (MatrixSelection)data;
  }

  private transient MatrixSelection selection;
  private MatrixLocation  location;
  private MatrixLocation  rangeStart;
  private MatrixLocation  rangeEnd;
}
