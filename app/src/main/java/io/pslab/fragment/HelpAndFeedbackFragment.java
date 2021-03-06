package io.pslab.fragment;


import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import io.pslab.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Harsh on 16-05-2018.
 */

public class HelpAndFeedbackFragment extends Fragment {

    @BindView(R.id.appBarAnim)
    AppBarLayout appBarLayout;

    public static HelpAndFeedbackFragment newInstance() {
        return new HelpAndFeedbackFragment();
    }

    public HelpAndFeedbackFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_help_feedback, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

}
