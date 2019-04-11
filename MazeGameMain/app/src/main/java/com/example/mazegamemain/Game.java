package com.example.mazegamemain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Game extends Activity {
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras(); //get the intent extras
        MazeGame maze = (MazeGame)extras.get("maze"); // retrieve the maze from intent extras
        MazeGameActivity view = new MazeGameActivity(this, maze);
        setContentView(view);
    }
}
