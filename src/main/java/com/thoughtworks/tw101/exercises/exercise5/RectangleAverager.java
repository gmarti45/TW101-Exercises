package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles)
    {
        int total =0;

        for( int i=0; i< rectangles.length; i++ )
        {
            total = total + rectangles[i].area();
        }
        return total / (rectangles.length);
    }
}
