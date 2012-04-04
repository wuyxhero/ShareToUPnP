package fr.spaz.upnp.upnp;

import org.teleal.cling.android.AndroidUpnpServiceImpl;

import android.util.Log;

public class UpnpService extends AndroidUpnpServiceImpl
{

	private static final String TAG = "UpnpService";

	@Override
	public void onCreate()
	{
		Log.d(TAG, "onCreate");
		super.onCreate();
	}

	@Override
	public void onDestroy()
	{
		Log.d(TAG, "onCreate");
		super.onDestroy();
	}

}
