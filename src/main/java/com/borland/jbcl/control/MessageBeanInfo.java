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

//NOTTRANSLATABLE

package com.borland.jbcl.control;

import com.borland.jb.util.BasicBeanInfo;

public class MessageBeanInfo extends BasicBeanInfo implements java.io.Serializable
{
  public MessageBeanInfo() {
    beanClass = Message.class;
    namedAttributes = new Object[][] {
      {"isContainer", Boolean.FALSE}} ;
    propertyDescriptors = new String[][] {
      {"buttonSet",   "Dialog button set", "getButtonSet", "setButtonSet", com.borland.jbcl.editors.MessageButtonSetEditor.class.getName()},     //RES NORES,BI_Dialog_buttonSet,NORES,NORES
      {"frame",       "Parent frame", "getFrame", "setFrame"},     //RES NORES,BI_Dialog_frame,NORES,NORES
      {"labels",      "Button label string array", "getLabels", "setLabels"},     //RES NORES,BI_Dialog_labels,NORES,NORES
      {"message",     "Message text", "getMessage", "setMessage"},     //RES NORES,BI_Message_message,NORES,NORES
      {"result",      "Dialog result", "getResult", "setResult", com.borland.jbcl.editors.MessageResultEditor.class.getName()},     //RES NORES,BI_Dialog_result,NORES,NORES
      {"title",       "Dialog title", "getTitle", "setTitle"},     //RES NORES,BI_Dialog_title,NORES,NORES
      {"visible",     "Visible state", "isVisible", "setVisible"},     //RES NORES,BI_visible,NORES,NORES
    };
  }
}
