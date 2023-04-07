package com.example.method_channelling

import android.widget.Toast
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel

class MainActivity: FlutterActivity() {

    private val channelName = "Habeeb";

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)

        var channel = MethodChannel(flutterEngine.dartExecutor.binaryMessenger,channelName);
        channel.setMethodCallHandler { call, result ->
            if (call.method == "ShowToast"){
                Toast.makeText(this,"Habeeb",Toast.LENGTH_LONG).show();
            }
        }
    }
}
