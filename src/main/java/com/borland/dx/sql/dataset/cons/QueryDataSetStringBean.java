//--------------------------------------------------------------------------------------------------
// $Header$
// Copyright (c) 1996-2002 Borland Software Corporation. All Rights Reserved.
//--------------------------------------------------------------------------------------------------

//NOTTRANSLATABLE

package com.borland.dx.sql.dataset.cons;

public class QueryDataSetStringBean
{
    public static final String[][] strings = {
      {"accumulateResults", Res.bundle.getString(ResIndex.BI_accumulateResults), "isAccumulateResults", "setAccumulateResults"},
//**  {"columns",           Res.bundle.getString(ResIndex.BI_columns), "getColumns", "setColumns"},
      {"query",             Res.bundle.getString(ResIndex.BI_query), "getQuery", "setQuery"},
//!      {"provider",          Res.bundle.getString(ResIndex.BI_provider), "getProvider", "setProvider"},
    };
    // This is why certain properties are not visible in the designers:
    //   columns:  We only want programmatic access
}
