package com.theqvd.android.xpro;

import android.app.Activity;
import android.app.PendingIntent;

public interface VncViewer extends Prerrequisite {

	public void launchVncViewer();
	public PendingIntent getContentVncIntent();
	public Activity getActivity();
	public void stopVncViewer();
}
