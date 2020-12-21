package com.nelioalves.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 4863555269931926091L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }

}
