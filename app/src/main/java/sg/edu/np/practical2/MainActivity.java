package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        User user1 = new User("Fahmi", "Fahmi1", 01, false);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user1.isFollowed() == false) {
                    button.setText("Unfollow");
                    Log.v(TAG, "Followed");
                    user1.setFollowed(true);
                }
                else if (user1.isFollowed() == true) {
                    button.setText("Follow");
                    Log.v(TAG, "Unfollowed");
                    user1.setFollowed(false);
                }
            }
        });


    }

    protected void onStart() {
        super.onStart();
        Log.v(TAG, "On Start!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "On Resume!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "On Pause!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "On Stop!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "On Destroy!");
    }
}