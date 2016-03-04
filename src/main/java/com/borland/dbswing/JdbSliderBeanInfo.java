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

package com.borland.dbswing;

import com.borland.jb.util.BasicBeanInfo;

/**
 * <p>BeanInfo for <code>JdbSlider</code>.</p>
 */

public class JdbSliderBeanInfo extends BasicBeanInfo implements java.io.Serializable
{
  public JdbSliderBeanInfo() {
    beanClass = JdbSlider.class;
    namedAttributes = new Object[][] {
      {"isContainer", Boolean.FALSE}} ;
    propertyDescriptors = new String[][] {
//  Format:
//    {"PropertyName", "Short Description", "ReadMethod", "WriteMethod", "PropertyEditor", "Expert", "Hidden"}

      // java.awt.Component properties
      {"background",             "background color", "", ""},     //RES NORES,BI_background,NORES,NORES
//      {"bounds",                 Res._BI_bounds, "", ""},
//      {"componentOrientation",         Res._BI_compOrientation, "", "", null, "true", "true"},
//      {"cursor",               Res._BI_cursor, "", "", null, "true", "true"},
//      {"dropTarget",             Res._BI_dropTarget, "", "", null, "true", "true"},
      {"enabled",                "enable or disable component", "", ""},     //RES NORES,BI_enabled,NORES,NORES
      {"font",                   "font used for painting", "", ""},     //RES NORES,BI_font,NORES,NORES
      {"foreground",             "foreground color", "", ""},     //RES NORES,BI_foreground,NORES,NORES
      {"locale",                 "locale", "", "", null, "true"},     //RES NORES,BI_locale,NORES,NORES,NORES
//      {"location",                 Res._BI_location, "", "", null, "true"},
//      {"name",                 Res._BI_name, "", "", null, "true"},
//      {"size",                 Res._BI_size, "", "", null, "true"},
      {"visible",                "visibility state", "", "",},     //RES NORES,BI_visible,NORES,NORES

      // java.awt.Container properties
//      {"layout",                 Res._BI_layout, "", "", null, "true", "true"},

      // javax.swing.JComponent properties
      {"alignmentX",             "preferred horizontal alignment", "", "", null, "true"},     //RES NORES,BI_alignmentX,NORES,NORES,NORES
      {"alignmentY",             "preferred vertical alignment", "", "", null, "true"},     //RES NORES,BI_alignmentY,NORES,NORES,NORES
      {"autoscrolls",            "automatically scrolls contents when dragged", "", "", null, "true"},     //RES NORES,BI_autoscrolls,NORES,NORES,NORES
      {"border",                 "border (insets)", "", ""},     //RES NORES,BI_border,NORES,NORES
      {"debugGraphicsOptions",   "diagnostic options for debugging graphics", "", "", "com.borland.dbswing.editors.DebugGraphicsEditor", "true"},     //RES NORES,BI_debugGraphicsOption,NORES,NORES,NORES,NORES
      {"doubleBuffered",         "use offscreen painting buffer", "", "", null, "true"},     //RES NORES,BI_doubleBuffered,NORES,NORES,NORES
      {"maximumSize",            "maximum size", "", ""},     //RES NORES,BI_maxSize,NORES,NORES
      {"minimumSize",            "minimum size", "", ""},     //RES NORES,BI_minSize,NORES,NORES
      {"nextFocusableComponent", "next component to receive focus", "", ""},     //RES NORES,BI_nextFocusComponent,NORES,NORES
      {"opaque",                 "opaque or transparent", "", "", null, "true"},     //RES NORES,BI_opaque,NORES,NORES,NORES
      {"preferredSize",          "preferred size", "", ""},     //RES NORES,BI_prefSize,NORES,NORES
      {"requestFocusEnabled",    "can obtain focus by calling requestFocus()", "", "", null, "true"},     //RES NORES,BI_reqFocusEnabled,NORES,NORES,NORES
      {"toolTipText",            "text to display in tool tip", "", ""},     //RES NORES,BI_toolTipText,NORES,NORES

      // javax.swing.JSlider
      {"extent",                 "size of extent", "", ""},     //RES NORES,BI_JSlider_extent,NORES,NORES
      {"inverted",               "reverse max and min locations", "", ""},     //RES NORES,BI_JSlider_inverted,NORES,NORES
//      {"labelTable",             Res._BI_JSlider_labelTable, "", "", "true", "true"},
      {"majorTickSpacing",       "interval between major ticks", "", ""},     //RES NORES,BI_JSlider_majorTick,NORES,NORES
      {"maximum",                "maximum value", "", ""},     //RES NORES,BI_JSlider_maximum,NORES,NORES
      {"minimum",                "minimum value", "", ""},     //RES NORES,BI_JSlider_minimum,NORES,NORES
      {"minorTickSpacing",       "interval between minor ticks", "", ""},     //RES NORES,BI_JSlider_minorTick,NORES,NORES
      {"model",                  "model", "", "", null, "true"},     //RES NORES,BI_model,NORES,NORES,NORES
      {"orientation",            "vertical or horizontal orientation", "", "", "com.borland.dbswing.editors.OrientationEditor"},     //RES NORES,BI_JSlider_orientation,NORES,NORES,NORES
      {"paintLabels",            "paint labels", "", ""},     //RES NORES,BI_JSlider_paintLabels,NORES,NORES
      {"paintTicks",             "paint tick marks", "", ""},     //RES NORES,BI_JSlider_paintTicks,NORES,NORES
      {"paintTrack",             "paint slider track", "", ""},     //RES NORES,BI_JSlider_paintTrack,NORES,NORES
      {"snapToTicks",            "snap thumb to tick marks", "", ""},     //RES NORES,BI_JSlider_snapTicks,NORES,NORES
//      {"UI",                     Res._BI_UI, "", "", null, "true", "true"},
      {"value",                  "current slider value", "", "",},     //RES NORES,BI_JSlider_value,NORES,NORES
      {"valueIsAdjusting",       "selection value adjusting", "", "", null, "true", "true"},     //RES NORES,BI_JList_valueAdj,NORES,NORES,NORES,NORES

      // com.borland.dbswing.JdbSlider
      {"columnName",             "DataSet Column name", "", "", "com.borland.jbuilder.cmt.editors.ColumnNameEditor"},     //RES NORES,BI_dx_columnName,NORES,NORES,NORES
      {"dataSet",                "DataSet data source", "", ""},     //RES NORES,BI_dx_dataSet,NORES,NORES
      {"unknownDataValueMode",   "policy for indicating inconsistent values", "", "", "com.borland.dbswing.editors.UnknownDataModeEditor"},     //RES NORES,BI_DBButtonDB_unkMode,NORES,NORES,NORES
    };
  }
}
