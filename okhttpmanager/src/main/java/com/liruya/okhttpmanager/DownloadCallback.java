package com.liruya.okhttpmanager;

import java.io.File;

public interface DownloadCallback
{
    void onError( String msg );

    void onProgress( long total, long current );

    void onSuccess( File file );
}
