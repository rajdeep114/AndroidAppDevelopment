package com.getapp.gesture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.widget.TextView;
import android.support.v4.view.GestureDetectorCompat;


public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener {

    // TextView variable
    private TextView message;

    // type gesture detector variable
    private GestureDetectorCompat gesture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reference to text label
        message = (TextView) findViewById(R.id.message);

        // constructing a new gesture object
        this.gesture = new GestureDetectorCompat(this,this);

        // called method to detect double tap
        gesture.setOnDoubleTapListener(this);

    }

    // ********** Implemented methods in the above interface ---> CMD + N

    // Gesture Begin
        // True ---> informs the computer that gesture has been performed
        // False --> would result in multiple gesture event, which we dont want!!

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        message.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        message.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        message.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        message.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        message.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        message.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        message.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        message.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        message.setText("onFling");
        return true;
    }

    // This method overrides the super class method.
    // This method is called when a user touches the screen. We want to check if that touch is a
    // gesture or not. We do it by placing this line of code: this.gesture.onTouchEvent(event);
    // If the touch was a gesture, use the appropriate gesture method listed above, and if it is not
    // a gesture then do what u did for a touch before overwritting the method.

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gesture.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
