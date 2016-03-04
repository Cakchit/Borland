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

public class ButtonControlBeanInfo extends BasicBeanInfo implements java.io.Serializable
{
  public ButtonControlBeanInfo() {
    beanClass = ButtonControl.class;
    namedAttributes = new Object[][] {
      {"isContainer", Boolean.FALSE}} ;
    propertyDescriptors = new String[][] {
      {"actionCommand", "Action command string", "getActionCommand", "setActionCommand"},     //RES NORES,BI_ButtonControl_actionCmd,NORES,NORES
      {"alignment",     "Alignment setting", "getAlignment", "setAlignment", com.borland.jbcl.editors.AlignmentEditor.class.getName()},     //RES NORES,BI_alignment,NORES,NORES
      {"background",    "Background color", "getBackground", "setBackground"},     //RES NORES,BI_background,NORES,NORES
      {"enabled",       "Enabled state", "isEnabled", "setEnabled"},     //RES NORES,BI_enabled,NORES,NORES
      {"focusAware",    "Focus aware state", "isFocusAware", "setFocusAware"},     //RES NORES,BI_focusAware,NORES,NORES
      {"font",          "Default font", "getFont", "setFont"},     //RES NORES,BI_font,NORES,NORES
      {"foreground",    "Foreground color", "getForeground", "setForeground"},     //RES NORES,BI_foreground,NORES,NORES
      {"image",         "Image", "getImage", "setImage"},     //RES NORES,BI_ButtonControl_image,NORES,NORES
      {"imageFirst",    "Image left/above label", "isImageFirst", "setImageFirst"},     //RES NORES,BI_ButtonControl_imageFirst,NORES,NORES
      {"imageName",     "Image name", "getImageName", "setImageName", com.borland.jbcl.editors.FileNameEditor.class.getName()},     //RES NORES,BI_ButtonControl_imageName,NORES,NORES
      {"itemMargins",   "Item margins [top, left, bottom, right] (pixels)", "getItemMargins", "setItemMargins"},     //RES NORES,BI_itemMargins,NORES,NORES
      {"label",         "Label text", "getLabel", "setLabel"},     //RES NORES,BI_label,NORES,NORES
      {"opaque",        "Opaque setting (false == transparent)", "isOpaque", "setOpaque"},     //RES NORES,BI_opaque,NORES,NORES
      {"orientation",   "Orientation setting", "getOrientation", "setOrientation", com.borland.jbcl.editors.OrientationEditor.class.getName()},     //RES NORES,BI_orientation,NORES,NORES
      {"readOnly",      "Read only state", "isReadOnly", "setReadOnly"},     //RES NORES,BI_readOnly,NORES,NORES
      {"selected",      "Selected state", "isSelected", "setSelected"},     //RES NORES,BI_selected,NORES,NORES
      {"showRollover",  "Show rollover item", "isShowRollover", "setShowRollover"},     //RES NORES,BI_showRollover,NORES,NORES
      {"textureName",   "Background tiled texture", "getTextureName", "setTextureName", com.borland.jbcl.editors.FileNameEditor.class.getName()},     //RES NORES,BI_texture,NORES,NORES
      {"toolTipText",   "ToolTip help text", "getToolTipText", "setToolTipText"},     //RES NORES,BI_toolTipText,NORES,NORES
      {"visible",       "Visible state", "isVisible", "setVisible"},     //RES NORES,BI_visible,NORES,NORES
    };
  }
}
