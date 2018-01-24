package com.anam.bottomsheetdemomodal;

import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ModalSheetDialog extends BottomSheetDialogFragment {
    String mString;

    static ModalSheetDialog newInstance(String string) {
        ModalSheetDialog f = new ModalSheetDialog();
        Bundle args = new Bundle();
        args.putString("string", string);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mString = getArguments().getString("string");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottom_layout_modal, container, false);
        TextView tv = (TextView) v.findViewById(R.id.details);
        return v;
    }
}
