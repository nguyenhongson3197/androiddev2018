package xyz.sonbn.ircclient.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageButton;

import xyz.sonbn.ircclient.R;
import xyz.sonbn.ircclient.activity.ClientActivity;
import xyz.sonbn.ircclient.adapter.ConversationViewPagerAdapter;


public class ConversationFragment extends Fragment {
    public static final String TRANSACTION_TAG = "fragment_conversation";

    private ClientActivity activity;
    private EditText input;
    private ImageButton sendButton;
    private ViewPager mViewPager;
    private ConversationViewPagerAdapter mConversationViewPagerAdapter;
    private TabLayout tabLayout;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (!(context instanceof ClientActivity)) {
            throw new IllegalArgumentException("Activity has to implement YaaicActivity interface");
        }

        this.activity = (ClientActivity) context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_conversation, container, false);

        input = (EditText) view.findViewById(R.id.input);
        mViewPager = (ViewPager) view.findViewById(R.id.pager);

        mConversationViewPagerAdapter = new ConversationViewPagerAdapter();
        mViewPager.setAdapter(mConversationViewPagerAdapter);

        tabLayout = (TabLayout) view.findViewById(R.id.tab);
        tabLayout.setupWithViewPager(mViewPager);

        sendButton = (ImageButton) view.findViewById(R.id.send);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        return view;
    }
}
