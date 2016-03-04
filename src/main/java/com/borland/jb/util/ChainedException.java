//--------------------------------------------------------------------------------------------------
// $Header$
// Copyright (c) 1996-2002 Borland Software Corporation. All Rights Reserved.
//--------------------------------------------------------------------------------------------------

package com.borland.jb.util;


/**
 * The <CODE>ChainedException</CODE> interface collects generic routines
 * to handle chained exceptions (a linked list of exceptions). In the
 * <CODE>dataset</CODE> package, the  <CODE>DataSetException</CODE> class
 * handles exceptions in this manner. It can contain other types of <CODE>
 * Exception</CODE> objects including those of type <CODE>
 * ValidationException</CODE>, <CODE>InvalidFormatException</CODE>, <CODE>
 * ResolutionException</CODE> as well as other exceptions such as JDBC and
 * SQL exceptions.
 *
 * @see com.borland.dbswing#DBExceptionDialog()
 * @see com.borland.dx.dataset#DataSetException()
 */
public interface ChainedException {
/**
 * Returns to the beginning of the exception chain.
 * @return  The <code>ExceptionChain</cose>
 */
  public ExceptionChain getExceptionChain();
}

