package rutherfordit.com.instasalary.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

import rutherfordit.com.instasalary.R;
import rutherfordit.com.instasalary.adapters.FaqAdapter;

public class FaqFragment extends Fragment {

    RecyclerView recfaq;
    WebView mywebView;
    View v;
    CardView loader_faq;
    private ArrayList questions = new ArrayList<>(Arrays.asList("How does this app protect my privacy?", "Am I able to delete my account?", "What happens to my data if I delete my TW account ?", "Does this app track my location?", "Is my account safe?", "Am I able to delete my account?"));
    private ArrayList answers = new ArrayList<>(Arrays.asList("There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don’t look even slightly believable.", "Yes", "It Will Get Deleted", "Yes", "Yes Your Account Is Safe", "Yes"));

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate    (R.layout.layout_faq, null);

        init();

        return v;
    }

    private void init() {
 /*       recfaq = v.findViewById(R.id.recfaq);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recfaq.setLayoutManager(linearLayoutManager);

        FaqAdapter faqAdapter = new FaqAdapter(getContext(), questions, answers);
        recfaq.setAdapter(faqAdapter);
    }*/

        loader_faq = v.findViewById(R.id.loader_faq);

        loader_faq.setVisibility(View.VISIBLE);

        mywebView = v.findViewById(R.id.simpleWebView);
        WebSettings webSettings= mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("file:///android_asset/index.html");
        // Line of Code for opening links in app
        mywebView.setWebViewClient(new WebViewClient());

        loader_faq.setVisibility(View.GONE );

    }
}
