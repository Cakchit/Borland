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

public class FieldControlBeanInfo extends BasicBeanInfo implements java.io.Serializable
{
  public FieldControlBeanInfo() {
    beanClass = FieldControl.class;
    namedAttributes = new Object[][] {
      {"isContainer", Boolean.FALSE}} ;
    propertyDescriptors = new String[][] {
      {"alignment",     "Alignment setting", "getAlignment", "setAlignment", com.borland.jbcl.editors.AlignmentEditor.class.getName()},     //RES NORES,BI_alignment,NORES,NORES
      {"autoEdit",      "Automatically start edit when a key is typed", "isAutoEdit", "setAutoEdit"},     //RES NORES,BI_autoEdit,NORES,NORES
      {"background",    "Background color", "getBackground", "setBackground"},     //RES NORES,BI_background,NORES,NORES
      {"columnName",    "Column name from DataSet", "getColumnName", "setColumnName", "com.borland.jbuilder.cmt.editors.ColumnNameEditor"}, 
      {"dataSet",       "DataSet data source", "getDataSet", "setDataSet"},     //RES NORES,BI_dataSet,NORES,NORES
      {"dataToolTip",   "Automatic toolTipText from model", "isDataToolTip", "setDataToolTip"},     //RES NORES,BI_dataToolTip,NORES,NORES
      {"editInPlace",   "Allow in-place editing", "isEditInPlace", "setEditInPlace"},     //RES NORES,BI_editInPlace,NORES,NORES
      {"enabled",       "Enabled state", "isEnabled", "setEnabled"},     //RES NORES,BI_enabled,NORES,NORES
      {"flat",          "Flat borders", "isFlat", "setFlat"},     //RES NORES,BI_flat,NORES,NORES
      {"font",          "Default font", "getFont", "setFont"},     //RES NORES,BI_font,NORES,NORES
      {"foreground",    "Foreground color", "getForeground", "setForeground"},     //RES NORES,BI_foreground,NORES,NORES
      {"growEditor",    "Auto-size ItemEditors", "isGrowEditor", "setGrowEditor"},     //RES NORES,BI_growEditor,NORES,NORES
      {"opaque",        "Opaque setting (false == transparent)", "isOpaque", "setOpaque"},     //RES NORES,BI_opaque,NORES,NORES
      {"postOnEndEdit", "Auto-post after editing", "isPostOnEndEdit", "setPostOnEndEdit"},     //RES NORES,BI_postOnEndEdit,NORES,NORES
      {"postOnFocusLost", "Auto-post after losing focus", "isPostOnFocusLost", "setPostOnFocusLost"},     //RES NORES,BI_postOnFocusLost,NORES,NORES
      {"readOnly",      "Read only state", "isReadOnly", "setReadOnly"},     //RES NORES,BI_readOnly,NORES,NORES
      {"selectable",    "Selectable state", "isSelectable", "setSelectable"},     //RES NORES,BI_selectable,NORES,NORES
      {"selected",      "Selected state", "isSelected", "setSelected"},     //RES NORES,BI_selected,NORES,NORES
      {"showRollover",  "Show rollover item", "isShowRollover", "setShowRollover"},     //RES NORES,BI_showRollover,NORES,NORES
      {"text",          "Text string", "getText", "setText"},     //RES NORES,BI_text,NORES,NORES
      {"textureName",   "Background tiled texture", "getTextureName", "setTextureName", com.borland.jbcl.editors.FileNameEditor.class.getName()},     //RES NORES,BI_texture,NORES,NORES
      {"toolTipText",   "ToolTip help text", "getToolTipText", "setToolTipText"},     //RES NORES,BI_toolTipText,NORES,NORES
      {"visible",       "Visible state", "isVisible", "setVisible"},     //RES NORES,BI_visible,NORES,NORES
    };
  }
}
