package com.example.criminalintent;


import java.util.Date;
import java.util.UUID;

import org.json.JSONException;
import org.json.JSONObject;

import android.R.mipmap;

public class Crime {

	private UUID mId;
	private String mTitle;
	private Date mDate;
	private boolean mSolved;
	
	public Crime() {
		mId = UUID.randomUUID();
		mDate = new Date();
	}
//	
//	public Crime(JSONObject json) throws JSONException{
//		mId = UUID.fromString(json.getString(JSON_ID));
//		if(json.has(JSON_TITLE)){
//			mTitle = json.getString(JSON_TITLE);
//		}
//		mSolved = json.getBoolean(JSON_SOLVED);
//		mDate = new Date(json.getLong(JSON_DATE));
//	}
//	
	
	public String getmTitle() {
		return mTitle;
	}
	
	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}
	
	public UUID getmId() {
		return mId;
	}

	public Date getmDate() {
		return mDate;
	}

	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}

	public boolean ismSolved() {
		return mSolved;
	}

	public void setmSolved(boolean mSolved) {
		this.mSolved = mSolved;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return mTitle;
	}
	
}