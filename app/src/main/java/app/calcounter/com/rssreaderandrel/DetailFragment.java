package app.calcounter.com.rssreaderandrel;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailFragment extends Fragment {

    // you wrote this
    public View onCreate(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_rssitem_detail, container, false);
        return view;

    }

    public void setText(String text)
    {
        TextView view = (TextView)getView().findViewById(R.id.detailsText);
        view.setText(text);

    }

}
