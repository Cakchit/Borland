//--------------------------------------------------------------------------------------------------
// $Header$
// Copyright (c) 1996-2002 Borland Software Corporation. All Rights Reserved.
//--------------------------------------------------------------------------------------------------

package com.borland.dx.dataset;


import java.util.EventListener;

/**
 * The ResponseListener interface listens to events generated by the
 * ResponseEvent class when requesting a response from the user.
 */
public interface ResponseListener extends EventListener {

    /**
     * This method is used to request a response from the user.
     * @see ResponseEvent.
     * @param response
     */
    public void response(ResponseEvent response);
}
