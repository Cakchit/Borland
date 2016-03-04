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

public class TreeControlBeanInfo extends BasicBeanInfo implements java.io.Serializable
{
  public TreeControlBeanInfo() {
    beanClass = TreeControl.class;
    namedAttributes = new Object[][] {
      {"isContainer", Boolean.FALSE}} ;
    propertyDescriptors = new String[][] {
      {"autoEdit",        "Automatically start edit when a key is typed", "isAutoEdit", "setAutoEdit"},     //RES NORES,BI_autoEdit,NORES,NORES
      {"background",      "Background color", "getBackground", "setBackground"},     //RES NORES,BI_background,NORES,NORES
      {"boxSize",         "Size of expand box [width, height] (pixels)", "getBoxSize", "setBoxSize"},     //RES NORES,BI_Tree_boxSize,NORES,NORES
      {"dataToolTip",     "Automatic toolTipText from model", "isDataToolTip", "setDataToolTip"},     //RES NORES,BI_dataToolTip,NORES,NORES
      {"doubleBuffered",  "Double buffered painting", "isDoubleBuffered", "setDoubleBuffered"},     //RES NORES,BI_doubleBuffered,NORES,NORES
      {"dragSubfocus",    "Change the subfocus item when mouse is dragged", "isDragSubfocus", "setDragSubfocus"},     //RES NORES,BI_dragSubfocus,NORES,NORES
      {"editInPlace",     "Allow in-place editing", "isEditInPlace", "setEditInPlace"},     //RES NORES,BI_editInPlace,NORES,NORES
      {"enabled",         "Enabled state", "isEnabled", "setEnabled"},     //RES NORES,BI_enabled,NORES,NORES
      {"expandByDefault", "Expand child nodes by default", "isExpandByDefault", "setExpandByDefault"},     //RES NORES,BI_Tree_expandByDefault,NORES,NORES
      {"font",            "Default font", "getFont", "setFont"},     //RES NORES,BI_font,NORES,NORES
      {"foreground",      "Foreground color", "getForeground", "setForeground"},     //RES NORES,BI_foreground,NORES,NORES
      {"growEditor",      "Auto-size ItemEditors", "isGrowEditor", "setGrowEditor"},     //RES NORES,BI_growEditor,NORES,NORES
      {"hIndent",         "Horizontal indent (pixels)", "getHIndent", "setHIndent"},     //RES NORES,BI_hIndent,NORES,NORES
      {"horizontalScrollBarPolicy", "ScrollBar display policy", "getHorizontalScrollBarPolicy", "setHorizontalScrollBarPolicy", com.borland.jbcl.editors.HorizontalScrollBarPolicyEditor.class.getName()},     //RES NORES,BI_SBPolicy,NORES,NORES
      {"hSnap",           "Auto-scroll horizontally", "isHSnap", "setHSnap"},     //RES NORES,BI_Tree_hSnap,NORES,NORES
      {"itemMargins",     "Item margins [top, left, bottom, right] (pixels)", "getItemMargins", "setItemMargins"},     //RES NORES,BI_itemMargins,NORES,NORES
      {"itemOffset",      "Item offset (pixels)", "getItemOffset", "setItemOffset"},     //RES NORES,BI_Tree_itemOffset,NORES,NORES
      {"items",           "Item string array", "getItems", "setItems", com.borland.jbcl.editors.TreeItemsEditor.class.getName()},     //RES NORES,BI_items,NORES,NORES
      {"leftMargin",      "Left margin (pixels)", "getLeftMargin", "setLeftMargin"},     //RES NORES,BI_leftMargin,NORES,NORES
      {"opaque",          "Opaque setting (false == transparent)", "isOpaque", "setOpaque"},     //RES NORES,BI_opaque,NORES,NORES
      {"showRollover",    "Show rollover item", "isShowRollover", "setShowRollover"},     //RES NORES,BI_showRollover,NORES,NORES
      {"readOnly",        "Read only state", "isReadOnly", "setReadOnly"},     //RES NORES,BI_readOnly,NORES,NORES
      {"showFocus",       "Show focus rectangle", "isShowFocus", "setShowFocus"},     //RES NORES,BI_showFocus,NORES,NORES
      {"snapOrigin",      "Snap scroll to origin", "isSnapOrigin", "setSnapOrigin"},     //RES NORES,BI_snapOrigin,NORES,NORES
      {"style",           "Tree style", "getStyle", "setStyle", com.borland.jbcl.editors.TreeStyleEditor.class.getName()},     //RES NORES,BI_Tree_style,NORES,NORES
      {"textureName",     "Background tiled texture", "getTextureName", "setTextureName", com.borland.jbcl.editors.FileNameEditor.class.getName()},     //RES NORES,BI_texture,NORES,NORES
      {"toolTipText",     "ToolTip help text", "getToolTipText", "setToolTipText"},     //RES NORES,BI_toolTipText,NORES,NORES
      {"topMargin",       "Top margin (pixels)", "getTopMargin", "setTopMargin"},     //RES NORES,BI_topMargin,NORES,NORES
      {"verticalScrollBarPolicy", "ScrollBar display policy", "getVerticalScrollBarPolicy", "setVerticalScrollBarPolicy", com.borland.jbcl.editors.VerticalScrollBarPolicyEditor.class.getName()},     //RES NORES,BI_SBPolicy,NORES,NORES
      {"visible",         "Visible state", "isVisible", "setVisible"},     //RES NORES,BI_visible,NORES,NORES
      {"vgap",            "Vertical gap (pixels)", "getVgap", "setVgap"},     //RES NORES,BI_vgap,NORES,NORES
    };
  }
}
