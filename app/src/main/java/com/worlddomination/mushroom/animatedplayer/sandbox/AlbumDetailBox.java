package com.worlddomination.mushroom.animatedplayer.sandbox;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.jimulabs.mirrorsandbox.MirrorSandboxBase;
import com.worlddomination.mushroom.animatedplayer.R;

import butterknife.ButterKnife;
import butterknife.Bind;


public class AlbumDetailBox extends MirrorSandboxBase {

    @Bind(R.id.album_art)
    ImageView albumArtView;
    @Bind(R.id.fab)
    ImageButton fab;
    @Bind(R.id.title_panel)
    ViewGroup cyanPanel;
    @Bind(R.id.track_panel)
    ViewGroup whitePanel;
    @Bind(R.id.detail_container)
    ViewGroup detailContainer;

    public AlbumDetailBox(View rootView) {
        super(rootView);
        ButterKnife.bind(this, rootView);
    }

    @Override
    public void $onLayoutDone(View rootView) {
        // Put animation code here
    }
}
