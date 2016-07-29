package com.worlddomination.mushroom.animatedplayer.sandbox;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

import com.jimulabs.mirrorsandbox.MirrorSandboxBase;
import com.worlddomination.mushroom.animatedplayer.R;


public class ViewAnimationBox extends MirrorSandboxBase {
    public ViewAnimationBox(View rootView) {
        super(rootView);
    }

    @Override
    public void $onLayoutDone(final View rootView) {
        View view = rootView.findViewById(R.id.textView);
        AnimationSet animation = new AnimationSet(true);
        TranslateAnimation move = new TranslateAnimation(0, 0, 0, 800);
        move.setDuration(1000);

        AlphaAnimation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setDuration(1000);
        fadeOut.setStartOffset(1000);

        AlphaAnimation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(1000);
        fadeIn.setStartOffset(3000);

        animation.addAnimation(move);
        animation.addAnimation(fadeOut);
//        animation.addAnimation(fadeIn);

        view.startAnimation(animation);
    }
}
