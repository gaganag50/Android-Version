package com.example.android.listviewpractice;

class AndroidVersion {
    private int mImageResourceId;
    private String VersionName;
    private String VersionNumber;
    private String APILevel;

    AndroidVersion(String versionName, String versionNumber, String APILevel, int imageResourceid) {
        VersionName = versionName;
        VersionNumber = versionNumber;
        this.APILevel = APILevel;
        mImageResourceId = imageResourceid;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getAPILevel() {
        return APILevel;
    }

    public String getVersionName() {
        return VersionName;
    }

    public String getVersionNumber() {
        return VersionNumber;
    }
}
