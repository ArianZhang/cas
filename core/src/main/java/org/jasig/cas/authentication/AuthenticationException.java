/*
 * Copyright 2005 The JA-SIG Collaborative.  All rights reserved.
 * See license distributed with this file and
 * available online at http://www.uportal.org/license.html
 */
package org.jasig.cas.authentication;

/**
 * The most generic type of authentication exception when one cannot determine
 * why the authentication actually failed. Top of the tree of all other
 * AuthenticationExceptions
 * 
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 3.0
 */
public class AuthenticationException extends Exception {

    private static final String CODE = "AUTH_ERROR";

    private static final long serialVersionUID = 3906648604830611762L;

    /**
     * 
     */
    public AuthenticationException() {
        super();
    }

    /**
     * @param arg0
     */
    public AuthenticationException(String arg0) {
        super(arg0);
    }

    /**
     * @param arg0
     * @param arg1
     */
    public AuthenticationException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    /**
     * @param arg0
     */
    public AuthenticationException(Throwable arg0) {
        super(arg0);
    }

    public String getCode() {
        return CODE;
    }
}