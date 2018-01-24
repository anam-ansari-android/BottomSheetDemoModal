package com.anam.bottomsheetdemomodal;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/***
 * @author Anam Ansari
 */
public class MainActivity extends AppCompatActivity {

    private ModalSheetDialog myBottomSheet;
    private Button btnKnowMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBottomSheet = ModalSheetDialog.newInstance("Modal Bottom Sheet");
        btnKnowMore = (Button) findViewById(R.id.btn_know_more);
        btnKnowMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myBottomSheet.show(getSupportFragmentManager(), myBottomSheet.getTag());
            }
        });
    }
}
