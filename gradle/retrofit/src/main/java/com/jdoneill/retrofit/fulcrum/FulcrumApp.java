package com.jdoneill.retrofit.fulcrum;

import com.jdoneill.retrofit.fulcrum.controller.Controller;

public class FulcrumApp {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
    }
}