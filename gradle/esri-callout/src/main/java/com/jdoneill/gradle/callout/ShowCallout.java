package com.jdoneill.gradle.callout;

import com.esri.arcgisruntime.geometry.GeometryEngine;
import com.esri.arcgisruntime.geometry.Point;
import com.esri.arcgisruntime.geometry.SpatialReferences;
import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.Callout;
import com.esri.arcgisruntime.mapping.view.MapView;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ShowCallout extends Application {

    private MapView mapView;

    // callout show and hide animation duration
    private static final Duration DURATION = new Duration(50);

    @Override
    public void start(Stage stage) throws Exception {

        try {
            // create stack pane and application scene
            StackPane stackPane = new StackPane();
            Scene scene = new Scene(stackPane);

            // set title, size, and add scene to stage
            stage.setTitle("Show Callout");
            stage.setWidth(800);
            stage.setHeight(700);
            stage.setScene(scene);
            stage.show();

            // create ArcGISMap with imagery basemap
            ArcGISMap map = new ArcGISMap(Basemap.Type.TOPOGRAPHIC_VECTOR, 47.609201, -122.331597, 14);
            // create a view and set map to it
            mapView = new MapView();
            mapView.setMap(map);
            // click event to display the callout
            mapView.setOnMouseClicked(e -> {
                // check that the primary mouse button was clicked and user is not
                // panning
                if (e.isStillSincePress() && e.getButton() == MouseButton.PRIMARY) {
                    // create a point from where the user clicked
                    Point2D point = new Point2D(e.getX(), e.getY());
                    // create a map point from a point
                    Point mapPoint = mapView.screenToLocation(point);
                    // get the map view's callout
                    Callout callout = mapView.getCallout();
                    // set callout title
                    callout.setTitle("Location");
                    // convert to WGS84 for lat/lon format
                    Point geo = (Point) GeometryEngine.project(mapPoint, SpatialReferences.getWgs84());
                    // convert to degrees minutes seconds
                    String convertY = convertCoordinate(geo.getY(), true);
                    String convertX = convertCoordinate(geo.getX(), false);
                    // add converted coordinates to callout
                    callout.setDetail(convertY + " : " + convertX);
                    // show call out where user clicks on map
                    callout.showCalloutAt(mapPoint, DURATION);
                    mapView.setViewpointCenterAsync(mapPoint);
                }
            });

            // add map view and control panel to stack pane
            stackPane.getChildren().addAll(mapView);

        } catch (Exception e) {
            // on any error, print the stack trace
            e.printStackTrace();
        }
    }

    /**
     * Stops and releases all resources used in application.
     */
    @Override
    public void stop() throws Exception {

        // release resources when the application closes
        if (mapView != null) {
            mapView.dispose();
        }
    }

    /**
     * Opens and runs application.
     *
     * @param args arguments passed to this application
     */
    public static void main(String[] args) {

        Application.launch(args);
    }

    /**
     * Converts a degree formatted location coordinate into
     * degrees minutes seconds for display
     *
     * @param coordinate location in degrees format
     * @param isLatitude true if Y, false if X
     * @return String formatted in degress minutes seconds
     */
    private String convertCoordinate(double coordinate, boolean isLatitude){
        String[] pString = isLatitude ? new String[]{"N", "S"} :  new String[]{"E", "W"};
        int degree = (int) coordinate;
        int minute = (int) (Math.abs(coordinate) * 60) % 60;
        int second = (int) (Math.abs(coordinate) * 3600) % 60;

        int index = degree < 0 ? 1 : 0;
        degree = Math.abs(degree);

        return degree + pString[index] + " " + minute + "' " + second + "\"";
    }
}
