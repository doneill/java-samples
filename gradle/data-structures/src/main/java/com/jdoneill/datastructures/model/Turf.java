package com.jdoneill.datastructures.model;

import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Object;

public class Turf {

    // ------------------------------------------------------------------------
    // Instance Variables
    // ------------------------------------------------------------------------

    private String mPath;

    private V8 mRuntime;

    private V8Object mHelpers;

    // ------------------------------------------------------------------------
    // Constructors
    // ------------------------------------------------------------------------

    public Turf(String scriptPath){
        this.mPath = scriptPath;
        setup(mPath);
    }

    public void release() {
        // release objects
        // turfJs.release();
        mHelpers.release();
        mRuntime.release();
    }

    public double degrees2radians(double angle) {
        Double radians = null; 
        Object object = mHelpers.executeJSFunction("degrees2radians", angle);

        if (object instanceof Double) {
            radians = (Double) object;
        }

        return radians;
    }

    private void setup(String script) {
        mRuntime = V8.createV8Runtime();
        mRuntime.executeScript(script);

        // traverse js
        V8Object turfJs = mRuntime.getObject("turf");
        mHelpers = turfJs.getObject("helpers");
        turfJs.release();

    }

}